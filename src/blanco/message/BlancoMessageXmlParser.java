/*
 * blanco Framework
 * Copyright (C) 2004-2007 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.message;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import blanco.commons.util.BlancoStringUtil;
import blanco.message.message.BlancoMessageMessage;
import blanco.message.valueobject.BlancoMessageFieldStructure;
import blanco.message.valueobject.BlancoMessageStructure;
import blanco.xml.bind.BlancoXmlBindingUtil;
import blanco.xml.bind.BlancoXmlUnmarshaller;
import blanco.xml.bind.valueobject.BlancoXmlDocument;
import blanco.xml.bind.valueobject.BlancoXmlElement;

/**
 * �u���b�Z�[�W��`���vExcel�l��������𒊏o���܂��B
 * 
 * ���̃N���X�́A����XML�t�@�C�������񒊏o����@�\��S���܂��B
 * 
 * @author IGA Tosiki
 */
public class BlancoMessageXmlParser {
    /**
     * ���b�Z�[�W��`�B
     */
    protected final BlancoMessageMessage fMsg = new BlancoMessageMessage();

    /**
     * ����XML�t�@�C����XML�h�L�������g���p�[�X���āA���̔z����擾���܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ����XML�t�@�C���B
     * @return �p�[�X�̌��ʓ���ꂽ���̔z��B
     */
    public BlancoMessageStructure[] parse(final File argMetaXmlSourceFile) {
        final BlancoXmlDocument documentMeta = new BlancoXmlUnmarshaller()
                .unmarshal(argMetaXmlSourceFile);
        if (documentMeta == null) {
            return null;
        }

        return parse(documentMeta);
    }

    /**
     * ����XML�t�@�C���`����XML�h�L�������g���p�[�X���āA�o�����[�I�u�W�F�N�g���̔z����擾���܂��B
     * 
     * @param argXmlDocument
     *            ����XML�t�@�C����XML�h�L�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���̔z��B
     */
    public BlancoMessageStructure[] parse(final BlancoXmlDocument argXmlDocument) {
        final List<BlancoMessageStructure> listStructure = new ArrayList<BlancoMessageStructure>();
        // ���[�g�G�������g���擾���܂��B
        final BlancoXmlElement elementRoot = BlancoXmlBindingUtil
                .getDocumentElement(argXmlDocument);
        if (elementRoot == null) {
            // ���[�g�G�������g�������ꍇ�ɂ͏������f���܂��B
            return null;
        }

        // sheet(Excel�V�[�g)�̃��X�g���擾���܂��B
        final List<BlancoXmlElement> listSheet = BlancoXmlBindingUtil
                .getElementsByTagName(elementRoot, "sheet");
        final int sizeListSheet = listSheet.size();
        for (int index = 0; index < sizeListSheet; index++) {
            final BlancoXmlElement elementSheet = listSheet.get(index);

            final BlancoMessageStructure structure = parseElementSheet(elementSheet);
            if (structure != null) {
                // ����ꂽ�����L�����܂��B
                listStructure.add(structure);
            }
        }

        final BlancoMessageStructure[] result = new BlancoMessageStructure[listStructure
                .size()];
        listStructure.toArray(result);
        return result;
    }

    /**
     * ����XML�t�@�C���`���́usheet�vXML�G�������g���p�[�X���āA�o�����[�I�u�W�F�N�g�����擾���܂��B
     * 
     * @param argElementSheet
     *            ����XML�t�@�C���́usheet�vXML�G�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���B�uname�v��������Ȃ������ꍇ�ɂ� null��߂��܂��B
     */
    public BlancoMessageStructure parseElementSheet(
            final BlancoXmlElement argElementSheet) {
        final BlancoMessageStructure structure = new BlancoMessageStructure();
        // ���̓p�����[�^�����擾���܂��B

        final List<BlancoXmlElement> listCommon = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancomessage-common");
        if (listCommon.size() == 0) {
            // common�������ꍇ�ɂ̓X�L�b�v���܂��B
            return null;
        }

        // �ŏ��̃A�C�e���̂ݏ������Ă��܂��B
        final BlancoXmlElement elementCommon = listCommon.get(0);

        // �V�[�g����ڍׂȏ����擾���܂��B
        structure.setName(BlancoXmlBindingUtil.getTextContent(elementCommon,
                "name"));
        structure.setPackage(BlancoXmlBindingUtil.getTextContent(elementCommon,
                "package"));

        if (BlancoStringUtil.null2Blank(structure.getName()).length() == 0) {
            return null;
        }

        if (BlancoStringUtil.null2Blank(structure.getPackage()).trim().length() == 0) {
            throw new IllegalArgumentException(fMsg.getMbmsgi01(structure
                    .getName()));
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "description") != null) {
            structure.setDescription(BlancoXmlBindingUtil.getTextContent(
                    elementCommon, "description"));
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "suffix") != null) {
            structure.setSuffix(BlancoXmlBindingUtil.getTextContent(
                    elementCommon, "suffix"));
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "idEmbedding") != null) {
            structure.setIdEmbedding("true".equals(BlancoXmlBindingUtil
                    .getTextContent(elementCommon, "idEmbedding")));
        }

        final BlancoXmlElement elementMessageList = BlancoXmlBindingUtil
                .getElement(argElementSheet, "blancomessage-list");
        if (elementMessageList == null) {
            return null;
        }

        // �ꗗ�̓��e���擾���܂��B
        final List<BlancoXmlElement> listField = BlancoXmlBindingUtil
                .getElementsByTagName(elementMessageList, "field");
        for (int indexField = 0; indexField < listField.size(); indexField++) {
            final BlancoXmlElement elementField = listField.get(indexField);

            final BlancoMessageFieldStructure fieldStructure = new BlancoMessageFieldStructure();

            fieldStructure.setNo(BlancoXmlBindingUtil.getTextContent(
                    elementField, "no"));
            fieldStructure.setName(BlancoXmlBindingUtil.getTextContent(
                    elementField, "key"));
            if (BlancoStringUtil.null2Blank(fieldStructure.getName()).length() == 0) {
                // key���w�肳��Ă��Ȃ��ꍇ�ɂ͏������܂���B
                continue;
            }

            if (BlancoStringUtil.null2Blank(
                    BlancoXmlBindingUtil.getTextContent(elementField, "level"))
                    .length() > 0) {
                fieldStructure.setLevel(BlancoXmlBindingUtil.getTextContent(
                        elementField, "level"));
            }

            if (BlancoStringUtil.null2Blank(
                    BlancoXmlBindingUtil.getTextContent(elementField, "value"))
                    .length() > 0) {
                fieldStructure.setMessage(BlancoXmlBindingUtil.getTextContent(
                        elementField, "value"));
            }

            if (BlancoStringUtil.null2Blank(fieldStructure.getMessage())
                    .length() == 0) {
                // �����Ōx���B
                continue;
            }

            // ���ɓ������e���o�^����Ă��Ȃ����ǂ����̃`�F�b�N�B
            for (int indexPast = 0; indexPast < structure.getFieldList().size(); indexPast++) {
                final BlancoMessageFieldStructure fieldPast = (BlancoMessageFieldStructure) structure
                        .getFieldList().get(indexPast);
                if (fieldPast.getName().equals(fieldStructure.getName())) {
                    throw new IllegalArgumentException(fMsg.getMbmsgi03(
                            structure.getName(), fieldStructure.getName()));
                }
            }

            structure.getFieldList().add(fieldStructure);
        }

        return structure;
    }
}
