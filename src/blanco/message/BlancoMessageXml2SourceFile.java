/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.message;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.BlancoCgSupportedLang;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.util.BlancoCgLineUtil;
import blanco.cg.util.BlancoCgSourceUtil;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.message.message.BlancoMessageMessage;
import blanco.message.resourcebundle.BlancoMessageResourceBundle;
import blanco.message.valueobject.BlancoMessageFieldStructure;
import blanco.message.valueobject.BlancoMessageStructure;
import blanco.resourcebundle.BlancoResourceBundleUtil;
import blanco.resourcebundle.BlancoResourceBundleXml2JavaClass;
import blanco.resourcebundle.BlancoResourceBundleXml2Properties;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleItemStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleResourceStringStructure;
import blanco.resourcebundle.valueobject.BlancoResourceBundleBundleStructure;

/**
 * �u���b�Z�[�W��`���vExcel�l�����烁�b�Z�[�W����������N���X�E�\�[�X�R�[�h�𐶐��B
 * 
 * ���̃N���X�́A����XML�t�@�C������\�[�X�R�[�h��������������@�\��S���܂��B
 * 
 * @author IGA Tosiki
 */
public class BlancoMessageXml2SourceFile {
    private final BlancoMessageMessage fMsg = new BlancoMessageMessage();

    /**
     * ���̃v���_�N�g�̃��\�[�X�o���h���ւ̃A�N�Z�X�I�u�W�F�N�g�B
     */
    private final BlancoMessageResourceBundle fBundle = new BlancoMessageResourceBundle();

    /**
     * �o�͑ΏۂƂȂ�v���O���~���O����B
     */
    private int fTargetLang = BlancoCgSupportedLang.NOT_DEFINED;

    /**
     * �������萔�Ƃ��ăN���X�ɏo�͂��邩�ǂ����B
     */
    private boolean fIsGenerateConstants = false;

    /**
     * �����I�ɗ��p����blancoCg�p�t�@�N�g���B
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * �����I�ɗ��p����blancoCg�p�\�[�X�t�@�C�����B
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * �����I�ɗ��p����blancoCg�p�N���X���B
     */
    private BlancoCgClass fCgClass = null;

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    private boolean fIsJavaJsf = false;

    public void setIsJavaJsf(final boolean arg) {
        fIsJavaJsf = arg;
    }

    private boolean fIsJavaStruts = false;

    public void setIsJavaStruts(final boolean arg) {
        fIsJavaStruts = arg;
    }

    /**
     * ����XML�t�@�C������\�[�X�R�[�h�������������܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ���^��񂪊܂܂�Ă���XML�t�@�C���B
     * @param argTargetLang
     *            �o�͑Ώۃv���O���~���O����B
     * @param argDirectoryTarget
     *            �\�[�X�R�[�h������f�B���N�g�� (/main�������������w�肵�܂�)�B
     * @param argIsGenerateConstants
     *            ������萔���N���X�ɏo�͂��邩�ǂ����̃t���O�B
     * @throws IOException
     *             ���o�͗�O�����������ꍇ�B
     */
    public void process(final File argMetaXmlSourceFile, final String argTargetLang,
            final boolean argIsGenerateConstants, final File argDirectoryTarget) throws IOException {

        fTargetLang = new BlancoCgSupportedLang().convertToInt(argTargetLang);
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.JS:
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.PHP:
        case BlancoCgSupportedLang.RUBY:
        case BlancoCgSupportedLang.PYTHON:
        case BlancoCgSupportedLang.DELPHI:
            break;
        default:
            throw new IllegalArgumentException(fMsg.getMbmsgi02(argTargetLang));
        }

        fIsGenerateConstants = argIsGenerateConstants;

        final BlancoMessageStructure[] structures = new BlancoMessageXmlParser().parse(argMetaXmlSourceFile);

        for (int index = 0; index < structures.length; index++) {
            // ���^���̉�͌��ʂ����ƂɃ\�[�X�R�[�h�������������s���܂��B
            structure2Source(structures[index], argDirectoryTarget);

            if (fTargetLang == BlancoCgSupportedLang.JAVA) {
                expandResourceBundleForJava(structures[index], argDirectoryTarget);
            }
        }
    }

    /**
     * �w��̃V�[�g�̋L�q���e��W�J���܂��B
     * 
     * @param argStructure
     *            �^�X�N�̍\���B
     * @param argDirectoryTarget
     *            �o�͐�f�B���N�g��
     */
    public void structure2Source(final BlancoMessageStructure argStructure, final File argDirectoryTarget) {
        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(argDirectoryTarget.getAbsolutePath() + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(argStructure.getPackage(),
                "���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B");
        fCgSourceFile.setEncoding(fEncoding);
        switch (fTargetLang) {
        case BlancoCgSupportedLang.DELPHI:
            // Delphi����ł́AUnit���Ƃ̖��O�Փ˂�����邽�߁A����ɏ]���N���X���ɋ����I��T�����܂��B
            fCgSourceFile.setName(argStructure.getName() + BlancoStringUtil.null2Blank(argStructure.getSuffix()));
            fCgClass = fCgFactory.createClass("T" + BlancoNameAdjuster.toClassName(argStructure.getName())
                    + BlancoStringUtil.null2Blank(argStructure.getSuffix()),
                    BlancoStringUtil.null2Blank(argStructure.getDescription()));
            break;
        default:
            fCgClass = fCgFactory.createClass(
                    BlancoNameAdjuster.toClassName(argStructure.getName())
                            + BlancoStringUtil.null2Blank(argStructure.getSuffix()),
                    BlancoStringUtil.null2Blank(argStructure.getDescription()));
            break;
        }
        fCgSourceFile.getClassList().add(fCgClass);

        if (fTargetLang == BlancoCgSupportedLang.JAVA) {
            // Java�̏ꍇ�ɂ̓��\�[�X�o���h���𗘗p�B
            final BlancoCgField field = new BlancoCgField();
            field.setName("fBundle");
            field.setType(fCgFactory.createType(argStructure.getPackage() + "."
                    + BlancoNameAdjuster.toClassName(argStructure.getName()) + argStructure.getSuffix()
                    + "ResourceBundle"));
            field.setDescription("���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B");
            field.setDefault("new " + BlancoNameAdjuster.toClassName(argStructure.getName()) + argStructure.getSuffix()
                    + "ResourceBundle()");
            field.setFinal(true);
            field.setAccess("protected");
            fCgClass.getFieldList().add(field);
        }

        if (fIsGenerateConstants) {
            expandFieldMessage(argStructure);
        }

        expandMethodGetMessage(argStructure);

        if (fIsJavaJsf) {
            expandMethodGetFacesMessage(argStructure);
        }
        if (fIsJavaStruts) {
            expandMethodGetStrutsMessage(argStructure);
            expandStrutsMessageBundle(argStructure, fileBlancoMain);
        }

        BlancoCgTransformerFactory.getSourceTransformer(fTargetLang).transform(fCgSourceFile, fileBlancoMain);
    }

    /**
     * �萔�t�B�[���h��W�J���܂��B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    @SuppressWarnings("unchecked")
    private void expandFieldMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = argProcessStructure.getFieldList().get(indexField);

            final String fieldName = fieldLook.getName().toUpperCase();

            // �u���b�Z�[�W�ɒu�������񂪂���ꍇ�ɂ͒萔�t�B�[���h�͐������Ȃ��v�Ƃ����d�l���������邩�ǂ����̃t���O�ւ̑Ή��B
            if ("true".equals(fBundle.getXml2sourceFileNoGenerateConstantIfFormatElementExist())) {
                final List listSplitMessage = new ArrayList();
                listSplitMessage.add(fieldLook.getMessage());
                final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);
                if (maxReplaceNumber >= 0) {
                    // �u�������񂪑��݂���̂Œ萔�t�B�[���h�͐������܂���B
                    continue;
                }
            }

            {
                // �萔�����ꂽ���b�Z�[�W�B
                final BlancoCgField cgField = fCgFactory.createField(fieldName, getTypeString(), "������["
                        + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage()) + "]");
                fCgClass.getFieldList().add(cgField);
                cgField.setAccess("public");
                cgField.setStatic(true);
                cgField.setFinal(true);
                cgField.setDefault(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                        + BlancoCgSourceUtil.escapeStringAsSource(fTargetLang,
                                (argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                                        + fieldLook.getMessage())
                        + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));

                if (fieldLook.getNo() != null) {
                    cgField.getLangDoc().getDescriptionList().add(fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
                }
            }

            {
                // �萔�����ꂽ���b�Z�[�W ID�B
                final BlancoCgField cgField = fCgFactory.createField("KEY_" + fieldName, getTypeString(), "�L�[�l: "
                        + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, "KEY_" + fieldLook.getName()));
                fCgClass.getFieldList().add(cgField);
                cgField.setAccess("public");
                cgField.setStatic(true);
                cgField.setFinal(true);
                cgField.setDefault(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang)
                        + BlancoCgSourceUtil.escapeStringAsSource(fTargetLang, fieldLook.getName())
                        + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));

                if (fieldLook.getNo() != null) {
                    cgField.getLangDoc().getDescriptionList().add(fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
                }
            }
        }
    }

    /**
     * get���b�Z�[�W ���\�b�h��W�J���܂��B
     * 
     * @param argProcessStructure
     *            ���^�t�@�C��������W�ł��������\���f�[�^�B
     */
    @SuppressWarnings("unchecked")
    private void expandMethodGetMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            final List listSplitMessage = new ArrayList();
            listSplitMessage.add((argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                    + fieldLook.getMessage());
            final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);

            final int blancoResourceBundleFormatCount = BlancoResourceBundleUtil.getFormatsByArgumentIndex(
                    fieldLook.getMessage(), false).length;

            if (maxReplaceNumber + 1 != blancoResourceBundleFormatCount) {
                throw new IllegalArgumentException(fMsg.getMbmsgi04(argProcessStructure.getName(), fieldLook.getName(),
                        Integer.toString(maxReplaceNumber + 1), Integer.toString(blancoResourceBundleFormatCount)));
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.RUBY:
            case BlancoCgSupportedLang.PYTHON:
                new BlancoMessageSplitUtil().splitByNewLineChar(listSplitMessage);
                break;
            }
            final String methodName = "get" + BlancoNameAdjuster.toClassName(fieldLook.getName());

            final BlancoCgMethod cgMethod = fCgFactory.createMethod(getMethodName(methodName), "���b�Z�[�W��`ID["
                    + argProcessStructure.getName() + "]�A�L�[[" + fieldLook.getName() + "]�̕�������擾���܂��B");
            fCgClass.getMethodList().add(cgMethod);

            // System.out.println("�u��������:" + maxReplaceNumber);
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                cgMethod.getParameterList().add(
                        fCgFactory.createParameter("arg" + indexArg, getTypeString(), "�u��������{" + indexArg + "}�̒l�B",
                                true));
            }

            if (fieldLook.getNo() != null) {
                cgMethod.getLangDoc().getDescriptionList().add(fBundle.getXml2sourceFileFieldNo(fieldLook.getNo()));
            }
            cgMethod.getLangDoc().getDescriptionList()
                    .add("������[" + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage()) + "]");

            cgMethod.setReturn(fCgFactory.createReturn(getTypeString(), "���b�Z�[�W������B"));

            final List lineList = cgMethod.getLineList();

            StringBuffer bufLine = new StringBuffer();

            switch (fTargetLang) {
            case BlancoCgSupportedLang.JAVA:
                if (true) {
                    final StringBuffer buf = new StringBuffer();
                    if (argProcessStructure.getIdEmbedding()) {
                        // ID���ߍ���
                        buf.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang) + "[" + fieldLook.getName()
                                + "] " + BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang) + " + ");
                    }
                    buf.append("fBundle.get" + BlancoNameAdjuster.toClassName(fieldLook.getName()) + "(");
                    for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                        if (indexArg != 0) {
                            buf.append(", ");
                        }
                        buf.append("arg" + indexArg);
                    }
                    buf.append(")");
                    bufLine.append(buf.toString());
                }
                break;
            case BlancoCgSupportedLang.RUBY:
            case BlancoCgSupportedLang.PYTHON:
                bufLine.append(getReturnStringRuby(listSplitMessage));
                break;
            default:
                bufLine.append(getReturnString(listSplitMessage));
                break;
            }

            switch (fTargetLang) {
            case BlancoCgSupportedLang.DELPHI:
                // Delphi�ɂ�return��������܂���B
                lineList.add("result:= " + bufLine.toString() + BlancoCgLineUtil.getTerminator(fTargetLang));
                lineList.add("exit" + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            default:
                lineList.add(BlancoCgLineUtil.getReturn(fTargetLang, bufLine.toString())
                        + BlancoCgLineUtil.getTerminator(fTargetLang));
                break;
            }
        }
    }

    /**
     * Java �����p�� JSF ���b�Z�[�W�������\�b�h�B
     * 
     * @param argProcessStructure
     */
    private void expandMethodGetFacesMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (fTargetLang != BlancoCgSupportedLang.JAVA) {
                // Java �ȊO�T�|�[�g���܂���B
                return;
            }

            final String methodName = "getFaces" + BlancoNameAdjuster.toClassName(fieldLook.getName());
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                    getMethodName(methodName),
                    "���b�Z�[�W: [" + fieldLook.getMessage() + "]");
            fCgClass.getMethodList().add(cgMethod);
            cgMethod.getLangDoc().getDescriptionList().add("<h3>���</h3><ul>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>���b�Z�[�W��`ID: "
                            + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, argProcessStructure.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>�L�[: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>���x��: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getLevel())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>���b�Z�[�W: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage())
                            + "</li>");
            cgMethod.getLangDoc().getDescriptionList().add("</ul>");

            final List<String> listSplitMessage = new ArrayList<String>();
            listSplitMessage.add((argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                    + fieldLook.getMessage());
            final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                cgMethod.getParameterList().add(
                        fCgFactory.createParameter("arg" + indexArg, getTypeString(), "�u��������{" + indexArg + "}�̒l�B",
                                true));
            }

            cgMethod.setReturn(fCgFactory.createReturn("javax.faces.application.FacesMessage", "JSF Faces ���b�Z�[�W�B"));

            final StringBuffer callParam = new StringBuffer();
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                if (indexArg != 0)
                    callParam.append(", ");
                callParam.append("arg" + indexArg);
            }

            String levelFaces = "INFO";
            if (fieldLook.getLevel() == null || fieldLook.getLevel().trim().length() == 0) {
                // �������܂���B
                levelFaces = "INFO";
            } else if (fieldLook.getLevel().equals("FATAL")) {
                levelFaces = "FATAL";
            } else if (fieldLook.getLevel().equals("ERROR")) {
                levelFaces = "ERROR";
            } else if (fieldLook.getLevel().equals("WARN")) {
                levelFaces = "WARN";
            } else if (fieldLook.getLevel().equals("INFO")) {
                levelFaces = "INFO";
            } else {
                // �d���������̂� INFO �����Ƃ��܂��B
                levelFaces = "INFO";
            }

            cgMethod.getLineList().add(
                    "return new FacesMessage(FacesMessage.SEVERITY_" + levelFaces + ", get"
                            + BlancoNameAdjuster.toClassName(fieldLook.getName()) + "(" + callParam + "), null);");
        }
    }

    /**
     * Java �����p�� Apache Struts ���b�Z�[�W�������\�b�h�B
     * 
     * struts-config.xml �� <message-resources parameter="resources.�ق��ق�"/>
     * ��ǉ����邱�ƁB
     * 
     * @param argProcessStructure
     */
    private void expandMethodGetStrutsMessage(final BlancoMessageStructure argProcessStructure) {

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (fTargetLang != BlancoCgSupportedLang.JAVA) {
                // Java �ȊO�T�|�[�g���܂���B
                return;
            }

            final String methodName = "addStruts" + BlancoNameAdjuster.toClassName(fieldLook.getName());
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                    getMethodName(methodName),
                    "���b�Z�[�W: [" + fieldLook.getMessage() + "]");
            fCgClass.getMethodList().add(cgMethod);
            cgMethod.getLangDoc().getDescriptionList().add("<h3>���</h3><ul>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>���b�Z�[�W��`ID: "
                            + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, argProcessStructure.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>�L�[: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getName())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>���x��: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getLevel())
                            + "</li>");
            cgMethod.getLangDoc()
                    .getDescriptionList()
                    .add("<li>���b�Z�[�W: " + BlancoCgSourceUtil.escapeStringAsLangDoc(fTargetLang, fieldLook.getMessage())
                            + "</li>");
            cgMethod.getLangDoc().getDescriptionList().add("</ul>");

            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("actionMessages", "org.apache.struts.action.ActionMessages",
                            "Apache Struts Messages"));

            final List<String> listSplitMessage = new ArrayList<String>();
            listSplitMessage.add((argProcessStructure.getIdEmbedding() ? "[" + fieldLook.getName() + "] " : "")
                    + fieldLook.getMessage());
            final int maxReplaceNumber = new BlancoMessageSplitUtil().split(listSplitMessage);
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                cgMethod.getParameterList().add(
                        fCgFactory.createParameter("arg" + indexArg, getTypeString(), "�u��������{" + indexArg + "}�̒l�B",
                                true));
            }

            fCgSourceFile.getImportList().add("org.apache.struts.action.ActionMessage");

            final int STRUTS_MAX_ARG = 2; // 3 �𒴂����� String �z�񉻂��܂��B(Struts �I�ɂ� 4 �܂Œ�`����)
            final StringBuffer callParam = new StringBuffer();
            if (maxReplaceNumber > STRUTS_MAX_ARG) {
                // Apache Struts Message �̃R���X�g���N�^�[��������Ή�
                callParam.append(", new String[] {");
            } else if (maxReplaceNumber >= 0) {
                // �|�C���g: �ЂƂ��Ȃ��ꍇ�� -1 �ł��B
                callParam.append(", ");
            }
            for (int indexArg = 0; indexArg <= maxReplaceNumber; indexArg++) {
                if (indexArg != 0)
                    callParam.append(", ");

                callParam.append("arg" + indexArg);
            }
            if (maxReplaceNumber > STRUTS_MAX_ARG) {
                callParam.append("}");
            }

            String levelCustomMessage = "INFO";
            if (fieldLook.getLevel() == null || fieldLook.getLevel().trim().length() == 0) {
                levelCustomMessage = "INFO";
            } else if (fieldLook.getLevel().equals("FATAL")) {
                levelCustomMessage = "FATAL";
            } else if (fieldLook.getLevel().equals("ERROR")) {
                levelCustomMessage = "ERROR";
            } else if (fieldLook.getLevel().equals("WARN")) {
                levelCustomMessage = "WARN";
            } else if (fieldLook.getLevel().equals("INFO")) {
                levelCustomMessage = "INFO";
            } else {
                // �d���������̂� INFO �����Ƃ��܂��B
                levelCustomMessage = "INFO";
            }

            cgMethod.getLineList().add(
                    "actionMessages.add(\"" + levelCustomMessage + "\", new ActionMessage(\""
                            + argProcessStructure.getPackage() + "." + fieldLook.getName() + "\"" + callParam + "));");
        }
    }

    private void expandStrutsMessageBundle(final BlancoMessageStructure argProcessStructure, final File fileBlancoMain) {
        final BlancoResourceBundleBundleStructure bundleStructure = new BlancoResourceBundleBundleStructure();
        bundleStructure.setPackage(argProcessStructure.getPackage());
        bundleStructure.setName(argProcessStructure.getName());
        bundleStructure.setDescription(argProcessStructure.getDescription());

        for (int indexField = 0; indexField < argProcessStructure.getFieldList().size(); indexField++) {
            final BlancoMessageFieldStructure fieldLook = (BlancoMessageFieldStructure) argProcessStructure
                    .getFieldList().get(indexField);

            if (fTargetLang != BlancoCgSupportedLang.JAVA) {
                // Java �ȊO�T�|�[�g���܂���B
                return;
            }

            final BlancoResourceBundleBundleItemStructure item = new BlancoResourceBundleBundleItemStructure();
            bundleStructure.getItemList().add(item);
            item.setKey(bundleStructure.getPackage() + "." + fieldLook.getName());
            BlancoResourceBundleBundleResourceStringStructure res = new BlancoResourceBundleBundleResourceStringStructure();
            res.setResourceString(fieldLook.getMessage());
            item.getResourceStringList().add(res);
        }

        final BlancoResourceBundleXml2Properties xml2Properties = new BlancoResourceBundleXml2Properties();
        xml2Properties.setPropertieswithdirectory(false);
        xml2Properties.structure2Properties(bundleStructure, null, fileBlancoMain);
    }

    /**
     * �v���O���~���O���ꏈ���n�ɍ����� String �^�̖��̂��擾���܂��B
     * 
     * �^�̓ǂݑւ��B
     * 
     * @return
     */
    private final String getTypeString() {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return "java.lang.String";
        case BlancoCgSupportedLang.CS:
            return "string";
        case BlancoCgSupportedLang.JS:
        case BlancoCgSupportedLang.PHP:
            return "string";
        case BlancoCgSupportedLang.VB:
        case BlancoCgSupportedLang.DELPHI:
            return "String";
        }
    }

    /**
     * �v���O���~���O���ꏈ���n�ɍ����� ���\�b�h�̖��O�ό`�������Ȃ��܂��B
     * 
     * ���\�b�h���̓ǂݑւ��B
     * 
     * @return
     */
    private final String getMethodName(final String argMethodName) {
        switch (fTargetLang) {
        case BlancoCgSupportedLang.JAVA:
        default:
            return argMethodName;
        case BlancoCgSupportedLang.CS:
        case BlancoCgSupportedLang.VB:
            return BlancoNameAdjuster.toUpperCaseTitle(argMethodName);
        case BlancoCgSupportedLang.JS:
            return argMethodName;
        }
    }

    /**
     * 
     * ���b�Z�[�W������𐶐����鎮���擾
     * 
     * @param listSplitMessage
     *            ���ߍ��ݕ�����ŕ������ꂽ���b�Z�[�W�̃��X�g
     * @return
     */
    @SuppressWarnings("unchecked")
    private StringBuffer getReturnString(final List listSplitMessage) {
        StringBuffer bufLine = new StringBuffer();
        boolean isPastString = false;
        for (int index = 0; index < listSplitMessage.size(); index++) {
            final Object objLook = listSplitMessage.get(index);
            if (objLook instanceof Integer) {
                // �u��������B
                final Integer intLook = (Integer) objLook;
                if (isPastString) {
                    bufLine.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
                }
                isPastString = false;
                if (index != 0) {
                    bufLine.append(" " + BlancoCgLineUtil.getStringConcatenationOperator(fTargetLang) + " ");
                }
                if (fTargetLang == BlancoCgSupportedLang.PHP) {
                    bufLine.append("$");
                }
                bufLine.append("arg" + intLook.intValue());
            } else {
                if (isPastString == false) {
                    if (index != 0) {
                        bufLine.append(" " + BlancoCgLineUtil.getStringConcatenationOperator(fTargetLang) + " ");
                    }
                    bufLine.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
                }
                isPastString = true;

                final String strLook = (String) objLook;
                bufLine.append(BlancoCgSourceUtil.escapeStringAsSource(fTargetLang, strLook));
            }
        }

        if (isPastString) {
            bufLine.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
        }

        return bufLine;
    }

    /**
     * 
     * Ruby������ɂ����āA���b�Z�[�W������𐶐����鎮���擾
     * 
     * ���s�������ʂ̕����񃊃e�����Ƃ��Ď�舵�������ꍇ�� �g�p���܂��B
     * 
     * @param listSplitMessage
     *            ���ߍ��ݕ�����ŕ������ꂽ���b�Z�[�W�̃��X�g
     * @return
     */
    @SuppressWarnings("unchecked")
    private StringBuffer getReturnStringRuby(final List listSplitMessage) {
        StringBuffer bufLine = new StringBuffer();
        for (int index = 0; index < listSplitMessage.size(); index++) {
            final Object objLook = listSplitMessage.get(index);
            if (index != 0) {
                bufLine.append(" " + BlancoCgLineUtil.getStringConcatenationOperator(fTargetLang) + " ");
            }
            if (objLook instanceof Integer) {
                // �u�������̏ꍇ�B
                final Integer intLook = (Integer) objLook;

                if (fTargetLang == BlancoCgSupportedLang.PHP) {
                    bufLine.append("$");
                }
                bufLine.append("arg" + intLook.intValue());
            } else {
                // �����񃊃e�����̏ꍇ�B
                final String strLook = (String) objLook;

                // ���s�����݂̂̏ꍇ�A�����񃊃e������\"�ň݂͂܂�
                StringBuffer literalEnclosure = new StringBuffer();
                if ("\n".equals(strLook)) {
                    literalEnclosure.append("\"");
                } else {
                    literalEnclosure.append(BlancoCgLineUtil.getStringLiteralEnclosure(fTargetLang));
                }

                bufLine.append(literalEnclosure);
                bufLine.append(BlancoCgSourceUtil.escapeStringAsSource(fTargetLang, strLook));
                bufLine.append(literalEnclosure);
            }
        }

        return bufLine;
    }

    /**
     * Java�̏ꍇ�Ƀ��\�[�X�o���h���N���X�𐶐����܂��B
     * 
     * @param argStructure
     * @param argDirectoryTarget
     */
    private void expandResourceBundleForJava(final BlancoMessageStructure argStructure, final File argDirectoryTarget) {
        final BlancoResourceBundleBundleStructure bundleStructure = new BlancoResourceBundleBundleStructure();
        bundleStructure.setName(BlancoNameAdjuster.toClassName(argStructure.getName()) + argStructure.getSuffix());
        bundleStructure.setPackage(argStructure.getPackage());
        // �N���X���p�b�P�[�W�A�N�Z�X�ɐ������܂��B
        bundleStructure.setAccess("");
        bundleStructure.setSuffix("ResourceBundle");
        bundleStructure.setDescription("���b�Z�[�W��`[" + argStructure.getName() + "]�������I�ɗ��p���郊�\�[�X�o���h���N���X�B");

        // TODO �f�t�H���g���P�[���𗘗p���邱�Ƃɂ��Ă��܂��B
        final Locale defalutLocale = Locale.getDefault();

        for (int index = 0; index < argStructure.getFieldList().size(); index++) {
            final BlancoMessageFieldStructure fieldStructure = (BlancoMessageFieldStructure) argStructure
                    .getFieldList().get(index);
            final BlancoResourceBundleBundleItemStructure item = new BlancoResourceBundleBundleItemStructure();
            item.setKey(fieldStructure.getName());
            final BlancoResourceBundleBundleResourceStringStructure resourceString = new BlancoResourceBundleBundleResourceStringStructure();
            resourceString.setResourceString(BlancoStringUtil.null2Blank(fieldStructure.getMessage()));
            resourceString.setLocale(defalutLocale.getLanguage());
            item.getResourceStringList().add(resourceString);
            bundleStructure.getItemList().add(item);
        }

        final BlancoResourceBundleXml2JavaClass xml2java = new BlancoResourceBundleXml2JavaClass();
        xml2java.setEncoding(fEncoding);
        xml2java.structure2Source(bundleStructure, argDirectoryTarget);
    }
}
