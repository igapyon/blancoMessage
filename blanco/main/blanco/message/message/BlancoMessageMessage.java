/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.message.message;

/**
 * blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B
 */
public class BlancoMessageMessage {
    /**
     * ���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B
     */
    protected final BlancoMessageMessageResourceBundle fBundle = new BlancoMessageMessageResourceBundle();

    /**
     * ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
     *
     * No.2:
     */
    public static final String MBMSGI01 = "[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B";

    /**
     * �L�[�l: KEY_MBMSGI01
     *
     * No.2:
     */
    public static final String KEY_MBMSGI01 = "MBMSGI01";

    /**
     * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
     *
     * No.3:
     */
    public static final String MBMSGI02 = "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B";

    /**
     * �L�[�l: KEY_MBMSGI02
     *
     * No.3:
     */
    public static final String KEY_MBMSGI02 = "MBMSGI02";

    /**
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
     *
     * No.4:
     */
    public static final String MBMSGI03 = "[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B";

    /**
     * �L�[�l: KEY_MBMSGI03
     *
     * No.4:
     */
    public static final String KEY_MBMSGI03 = "MBMSGI03";

    /**
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
     *
     * No.5:
     */
    public static final String MBMSGI04 = "[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B";

    /**
     * �L�[�l: KEY_MBMSGI04
     *
     * No.5:
     */
    public static final String KEY_MBMSGI04 = "MBMSGI04";

    /**
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * No.8:
     */
    public static final String MBMSGA01 = "[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B";

    /**
     * �L�[�l: KEY_MBMSGA01
     *
     * No.8:
     */
    public static final String KEY_MBMSGA01 = "MBMSGA01";

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B
     *
     * No.2:
     * ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbmsgi01(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBMSGI01] " + fBundle.getMbmsgi01(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B
     *
     * No.3:
     * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbmsgi02(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi02]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBMSGI02] " + fBundle.getMbmsgi02(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B
     *
     * No.4:
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbmsgi03(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi03]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi03]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBMSGI03] " + fBundle.getMbmsgi03(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B
     *
     * No.5:
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @param arg2 �u��������{2}�̒l�B
     * @param arg3 �u��������{3}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbmsgi04(final String arg0, final String arg1, final String arg2, final String arg3) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi04]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi04]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg2 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi04]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg3 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsgi04]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBMSGI04] " + fBundle.getMbmsgi04(arg0, arg1, arg2, arg3);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B
     *
     * No.8:
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbmsga01(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbmsga01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBMSGA01] " + fBundle.getMbmsga01(arg0);
    }
}
