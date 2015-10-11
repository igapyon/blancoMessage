/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.sample.message;

/**
 * ���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
 */
public class SampleMessage {
    /**
     * ���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B
     */
    protected final SampleMessageResourceBundle fBundle = new SampleMessageResourceBundle();

    /**
     * ������[���b�Z�[�W�̃T���v���B���̂P�B]
     *
     * No.1:
     */
    public static final String MESSAGE001 = "���b�Z�[�W�̃T���v���B���̂P�B";

    /**
     * �L�[�l: KEY_MESSAGE001
     *
     * No.1:
     */
    public static final String KEY_MESSAGE001 = "MESSAGE001";

    /**
     * ������[���b�Z�[�W�u������[{0}]���u������܂��B]
     *
     * No.2:
     */
    public static final String MESSAGE002 = "���b�Z�[�W�u������[{0}]���u������܂��B";

    /**
     * �L�[�l: KEY_MESSAGE002
     *
     * No.2:
     */
    public static final String KEY_MESSAGE002 = "MESSAGE002";

    /**
     * ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
     *
     * No.3:
     */
    public static final String MESSAGE003 = "���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B";

    /**
     * �L�[�l: KEY_MESSAGE003
     *
     * No.3:
     */
    public static final String KEY_MESSAGE003 = "MESSAGE003";

    /**
     * ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
     *
     * No.4:
     */
    public static final String MESSAGE004 = "�A���������b�Z�[�W�u������{0}{1}�̗�ł��B";

    /**
     * �L�[�l: KEY_MESSAGE004
     *
     * No.4:
     */
    public static final String KEY_MESSAGE004 = "MESSAGE004";

    /**
     * ������[{0}�擪����u�������񂪂����B]
     *
     * No.5:
     */
    public static final String MESSAGE005 = "{0}�擪����u�������񂪂����B";

    /**
     * �L�[�l: KEY_MESSAGE005
     *
     * No.5:
     */
    public static final String KEY_MESSAGE005 = "MESSAGE005";

    /**
     * ������[�Ōオ�u��������̗�B{0}]
     *
     * No.6:
     */
    public static final String MESSAGE006 = "�Ōオ�u��������̗�B{0}";

    /**
     * �L�[�l: KEY_MESSAGE006
     *
     * No.6:
     */
    public static final String KEY_MESSAGE006 = "MESSAGE006";

    /**
     * ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
     *
     * No.7:
     */
    public static final String MESSAGE007 = "���x�������u������{0}{1}{0}{1}{2}{1}{0}";

    /**
     * �L�[�l: KEY_MESSAGE007
     *
     * No.7:
     */
    public static final String KEY_MESSAGE007 = "MESSAGE007";

    /**
     * ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
     *
     * No.8:
     */
    public static final String MESSAGE008 = "��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B";

    /**
     * �L�[�l: KEY_MESSAGE008
     *
     * No.8:
     */
    public static final String KEY_MESSAGE008 = "MESSAGE008";

    /**
     * ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
     *
     * No.9:
     */
    public static final String MESSAGE009 = "{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B";

    /**
     * �L�[�l: KEY_MESSAGE009
     *
     * No.9:
     */
    public static final String KEY_MESSAGE009 = "MESSAGE009";

    /**
     * ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
     *
     * No.10:
     */
    public static final String MESSAGE010 = "�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����\"�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B";

    /**
     * �L�[�l: KEY_MESSAGE010
     *
     * No.10:
     */
    public static final String KEY_MESSAGE010 = "MESSAGE010";

    /**
     * ������[�~]
     *
     * No.11:
     */
    public static final String MESSAGE011 = "�~";

    /**
     * �L�[�l: KEY_MESSAGE011
     *
     * No.11:
     */
    public static final String KEY_MESSAGE011 = "MESSAGE011";

    /**
     * ������[���s[\n]�̎����B]
     *
     * No.12:
     */
    public static final String MESSAGE012 = "���s[\n]�̎����B";

    /**
     * �L�[�l: KEY_MESSAGE012
     *
     * No.12:
     */
    public static final String KEY_MESSAGE012 = "MESSAGE012";

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE001]�̕�������擾���܂��B
     *
     * No.1:
     * ������[���b�Z�[�W�̃T���v���B���̂P�B]
     *
     * @return ���b�Z�[�W������B
     */
    public String getMessage001() {
        return fBundle.getMessage001();
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE002]�̕�������擾���܂��B
     *
     * No.2:
     * ������[���b�Z�[�W�u������[{0}]���u������܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage002(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage002(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE003]�̕�������擾���܂��B
     *
     * No.3:
     * ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage003(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage003]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage003]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage003(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE004]�̕�������擾���܂��B
     *
     * No.4:
     * ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage004(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage004]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage004]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage004(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE005]�̕�������擾���܂��B
     *
     * No.5:
     * ������[{0}�擪����u�������񂪂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage005(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage005]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage005(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE006]�̕�������擾���܂��B
     *
     * No.6:
     * ������[�Ōオ�u��������̗�B{0}]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage006(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage006]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage006(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE007]�̕�������擾���܂��B
     *
     * No.7:
     * ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage007(final String arg0, final String arg1, final String arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage007]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage007]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage007]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage007(arg0, arg1, arg2);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE008]�̕�������擾���܂��B
     *
     * No.8:
     * ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @param arg4 �u��������{4}�̒l�B
     * @param arg5 �u��������{5}�̒l�B
     * @param arg6 �u��������{6}�̒l�B
     * @param arg7 �u��������{7}�̒l�B
     * @param arg8 �u��������{8}�̒l�B
     * @param arg9 �u��������{9}�̒l�B
     * @param arg10 �u��������{10}�̒l�B
     * @param arg11 �u��������{11}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage008(final String arg0, final String arg1, final String arg2, final String arg3, final String arg4, final String arg5, final String arg6, final String arg7, final String arg8, final String arg9, final String arg10, final String arg11) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg4 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg4]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg5 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg5]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg6 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg6]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg7 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg7]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg8 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg8]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg9 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg9]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg10 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg10]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg11 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage008]�̃p�����[�^[arg11]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage008(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE009]�̕�������擾���܂��B
     *
     * No.9:
     * ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMessage009(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage009]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMessage009]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return fBundle.getMessage009(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE010]�̕�������擾���܂��B
     *
     * No.10:
     * ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
     *
     * @return ���b�Z�[�W������B
     */
    public String getMessage010() {
        return fBundle.getMessage010();
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE011]�̕�������擾���܂��B
     *
     * No.11:
     * ������[�~]
     *
     * @return ���b�Z�[�W������B
     */
    public String getMessage011() {
        return fBundle.getMessage011();
    }

    /**
     * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE012]�̕�������擾���܂��B
     *
     * No.12:
     * ������[���s[\n]�̎����B]
     *
     * @return ���b�Z�[�W������B
     */
    public String getMessage012() {
        return fBundle.getMessage012();
    }
}
