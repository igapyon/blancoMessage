/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.message.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * BlancoMessage�����p���郊�\�[�X�o���h����~���܂��B
 *
 * ���\�[�X�o���h����`: [BlancoMessage]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoMessageResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoMessage]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoMessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/message/resourcebundle/BlancoMessage");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoMessage]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoMessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/message/resourcebundle/BlancoMessage", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoMessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoMessage]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoMessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/message/resourcebundle/BlancoMessage", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoMessage], key[METAFILE_DISPLAYNAME]
     *
     * [���b�Z�[�W��`��] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMetafileDisplayname() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W��`��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.FIELD_NO]
     *
     * [No.{0}: ] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2SOURCE_FILE.FIELD_NO]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2sourceFileFieldNo(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "No.{0}: ";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.FIELD_NO");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.DESCRIPTION]
     *
     * [����:�L�[:[{0}]�A������[{1}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2SOURCE_FILE.DESCRIPTION]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2sourceFileDescription(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "����:�L�[:[{0}]�A������[{1}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.DESCRIPTION");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST]
     *
     * [false] (ja)<br>
     *
     * @return key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2sourceFileNoGenerateConstantIfFormatElementExist() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "false";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoMessage], key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST_MSG]
     *
     * [���[�h: ���b�Z�[�W�ɒu�������񂪂���ꍇ�ɂ͒萔�t�B�[���h�͐������Ȃ��B] (ja)<br>
     *
     * @return key[XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST_MSG]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2sourceFileNoGenerateConstantIfFormatElementExistMsg() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���[�h: ���b�Z�[�W�ɒu�������񂪂���ꍇ�ɂ͒萔�t�B�[���h�͐������Ȃ��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2SOURCE_FILE.NO_GENERATE_CONSTANT_IF_FORMAT_ELEMENT_EXIST_MSG");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
