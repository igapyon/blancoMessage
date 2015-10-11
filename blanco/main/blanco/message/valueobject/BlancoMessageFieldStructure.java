/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.message.valueobject;

/**
 * BlancoMessage�̂Ȃ��ŗ��p�����ValueObject�ł��B
 */
public class BlancoMessageFieldStructure {
    /**
     * ���ڔԍ�
     *
     * �t�B�[���h: [no]�B
     */
    private String fNo;

    /**
     * �L�[������킵�܂��B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * ���b�Z�[�W�E���x���B
     *
     * �t�B�[���h: [level]�B
     */
    private String fLevel;

    /**
     * ���b�Z�[�W�����������킵�܂��B
     *
     * �t�B�[���h: [message]�B
     */
    private String fMessage;

    /**
     * �t�B�[���h [no] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���ڔԍ�]�B
     *
     * @param argNo �t�B�[���h[no]�ɐݒ肷��l�B
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * �t�B�[���h [no] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���ڔԍ�]�B
     *
     * @return �t�B�[���h[no]����擾�����l�B
     */
    public String getNo() {
        return fNo;
    }

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�L�[������킵�܂��B]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�L�[������킵�܂��B]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [level] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W�E���x���B]�B
     *
     * @param argLevel �t�B�[���h[level]�ɐݒ肷��l�B
     */
    public void setLevel(final String argLevel) {
        fLevel = argLevel;
    }

    /**
     * �t�B�[���h [level] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W�E���x���B]�B
     *
     * @return �t�B�[���h[level]����擾�����l�B
     */
    public String getLevel() {
        return fLevel;
    }

    /**
     * �t�B�[���h [message] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W�����������킵�܂��B]�B
     *
     * @param argMessage �t�B�[���h[message]�ɐݒ肷��l�B
     */
    public void setMessage(final String argMessage) {
        fMessage = argMessage;
    }

    /**
     * �t�B�[���h [message] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W�����������킵�܂��B]�B
     *
     * @return �t�B�[���h[message]����擾�����l�B
     */
    public String getMessage() {
        return fMessage;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.message.valueobject.BlancoMessageFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",level=" + fLevel);
        buf.append(",message=" + fMessage);
        buf.append("]");
        return buf.toString();
    }
}
