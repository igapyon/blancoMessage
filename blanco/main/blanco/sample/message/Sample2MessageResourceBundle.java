/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.sample.message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * ���b�Z�[�W��`[Sample2]�������I�ɗ��p���郊�\�[�X�o���h���N���X�B
 *
 * ���\�[�X�o���h����`: [Sample2Message]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 */
class Sample2MessageResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * Sample2MessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[Sample2Message]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public Sample2MessageResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/message/Sample2Message");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * Sample2MessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[Sample2Message]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public Sample2MessageResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/message/Sample2Message", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * Sample2MessageResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[Sample2Message]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public Sample2MessageResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/sample/message/Sample2Message", locale, loader);
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
     * bundle[Sample2Message], key[MESSAGE001]
     *
     * [���b�Z�[�W�̃T���v���B���̂P�B] (ja)<br>
     *
     * @return key[MESSAGE001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage001() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W�̃T���v���B���̂P�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE001");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample2Message], key[MESSAGE002]
     *
     * [���b�Z�[�W�u������[{0}]���u������܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage002(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W�u������[{0}]���u������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE002");
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
     * bundle[Sample2Message], key[MESSAGE003]
     *
     * [���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage003(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE003");
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
     * bundle[Sample2Message], key[MESSAGE004]
     *
     * [�A���������b�Z�[�W�u������{0}{1}�̗�ł��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage004(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�A���������b�Z�[�W�u������{0}{1}�̗�ł��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE004");
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
     * bundle[Sample2Message], key[MESSAGE005]
     *
     * [{0}�擪����u�������񂪂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage005(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�擪����u�������񂪂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE005");
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
     * bundle[Sample2Message], key[MESSAGE006]
     *
     * [�Ōオ�u��������̗�B{0}] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage006(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�Ōオ�u��������̗�B{0}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE006");
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
     * bundle[Sample2Message], key[MESSAGE007]
     *
     * [���x�������u������{0}{1}{0}{1}{2}{1}{0}] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE007]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage007(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���x�������u������{0}{1}{0}{1}{2}{1}{0}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample2Message], key[MESSAGE008]
     *
     * [��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg4 �u��������{4}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg5 �u��������{5}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg6 �u��������{6}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg7 �u��������{7}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg8 �u��������{8}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg9 �u��������{9}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg10 �u��������{10}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg11 �u��������{11}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE008]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage008(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5, final String arg6, final String arg7, final String arg8, final String arg9, final String arg10, final String arg11) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[Sample2Message], key[MESSAGE009]
     *
     * [{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[MESSAGE009]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage009(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE009");
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
     * bundle[Sample2Message], key[MESSAGE010]
     *
     * [�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B] (ja)<br>
     *
     * @return key[MESSAGE010]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage010() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����\"�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE010");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample2Message], key[MESSAGE011]
     *
     * [�~] (ja)<br>
     *
     * @return key[MESSAGE011]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage011() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�~";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE011");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[Sample2Message], key[MESSAGE012]
     *
     * [���s[\n]�̎����B] (ja)<br>
     *
     * @return key[MESSAGE012]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMessage012() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���s[\n]�̎����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("MESSAGE012");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
