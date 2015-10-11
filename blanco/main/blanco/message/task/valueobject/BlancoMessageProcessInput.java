/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.message.task.valueobject;

/**
 * �����N���X [BlancoMessageProcess]�̓��̓o�����[�I�u�W�F�N�g�N���X�ł��B
 */
public class BlancoMessageProcessInput {
    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * �t�B�[���h: [verbose]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fVerbose = false;

    /**
     * ���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B
     *
     * �t�B�[���h: [metadir]�B
     */
    private String fMetadir;

    /**
     * �o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B
     *
     * �t�B�[���h: [targetdir]�B
     * �f�t�H���g: [blanco]�B
     */
    private String fTargetdir = "blanco";

    /**
     * �e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B
     *
     * �t�B�[���h: [tmpdir]�B
     * �f�t�H���g: [tmp]�B
     */
    private String fTmpdir = "tmp";

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B
     *
     * �t�B�[���h: [encoding]�B
     */
    private String fEncoding;

    /**
     * �^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js, vb,php,ruby,python���I���\�B
     *
     * �t�B�[���h: [targetlang]�B
     * �f�t�H���g: [java]�B
     */
    private String fTargetlang = "java";

    /**
     * ��������N���X�̒萔�Ƃ��ďo�͂��邩�ǂ����B
     *
     * �t�B�[���h: [constants]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fConstants = false;

    /**
     * Java JSF �̃��b�Z�[�W���o�͂��邩�ǂ����BJava ����̂ݑΉ��B
     *
     * �t�B�[���h: [isJavaJsf]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fIsJavaJsf = false;

    /**
     * Java Apache Struts �̃��b�Z�[�W���o�͂��邩�ǂ����BJava ����̂ݑΉ��B
     *
     * �t�B�[���h: [isJavaStruts]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fIsJavaStruts = false;

    /**
     * �t�B�[���h [verbose] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     *
     * @param argVerbose �t�B�[���h[verbose]�ɐݒ肷��l�B
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * �t�B�[���h [verbose] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[verbose]����擾�����l�B
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * �t�B�[���h [metadir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B]�B
     *
     * @param argMetadir �t�B�[���h[metadir]�ɐݒ肷��l�B
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * �t�B�[���h [metadir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���^�f�B���N�g���Bxls�t�@�C���̊i�[��܂��� xml�t�@�C���̊i�[����w�肵�܂��B]�B
     *
     * @return �t�B�[���h[metadir]����擾�����l�B
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * �t�B�[���h [targetdir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B]�B
     *
     * @param argTargetdir �t�B�[���h[targetdir]�ɐݒ肷��l�B
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * �t�B�[���h [targetdir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B]�B
     * �f�t�H���g: [blanco]�B
     *
     * @return �t�B�[���h[targetdir]����擾�����l�B
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * �t�B�[���h [tmpdir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B]�B
     *
     * @param argTmpdir �t�B�[���h[tmpdir]�ɐݒ肷��l�B
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * �t�B�[���h [tmpdir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�e���|�����f�B���N�g�����w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp��p���܂��B]�B
     * �f�t�H���g: [tmp]�B
     *
     * @return �t�B�[���h[tmpdir]����擾�����l�B
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * �t�B�[���h [encoding] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]�B
     *
     * @param argEncoding �t�B�[���h[encoding]�ɐݒ肷��l�B
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * �t�B�[���h [encoding] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[encoding]����擾�����l�B
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * �t�B�[���h [targetlang] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js, vb,php,ruby,python���I���\�B]�B
     *
     * @param argTargetlang �t�B�[���h[targetlang]�ɐݒ肷��l�B
     */
    public void setTargetlang(final String argTargetlang) {
        fTargetlang = argTargetlang;
    }

    /**
     * �t�B�[���h [targetlang] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�^�[�Q�b�g�ƂȂ�v���O���~���O���ꏈ���n���Bjava, cs, js, vb,php,ruby,python���I���\�B]�B
     * �f�t�H���g: [java]�B
     *
     * @return �t�B�[���h[targetlang]����擾�����l�B
     */
    public String getTargetlang() {
        return fTargetlang;
    }

    /**
     * �t�B�[���h [constants] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [��������N���X�̒萔�Ƃ��ďo�͂��邩�ǂ����B]�B
     *
     * @param argConstants �t�B�[���h[constants]�ɐݒ肷��l�B
     */
    public void setConstants(final boolean argConstants) {
        fConstants = argConstants;
    }

    /**
     * �t�B�[���h [constants] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [��������N���X�̒萔�Ƃ��ďo�͂��邩�ǂ����B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[constants]����擾�����l�B
     */
    public boolean getConstants() {
        return fConstants;
    }

    /**
     * �t�B�[���h [isJavaJsf] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [Java JSF �̃��b�Z�[�W���o�͂��邩�ǂ����BJava ����̂ݑΉ��B]�B
     *
     * @param argIsJavaJsf �t�B�[���h[isJavaJsf]�ɐݒ肷��l�B
     */
    public void setIsJavaJsf(final boolean argIsJavaJsf) {
        fIsJavaJsf = argIsJavaJsf;
    }

    /**
     * �t�B�[���h [isJavaJsf] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [Java JSF �̃��b�Z�[�W���o�͂��邩�ǂ����BJava ����̂ݑΉ��B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[isJavaJsf]����擾�����l�B
     */
    public boolean getIsJavaJsf() {
        return fIsJavaJsf;
    }

    /**
     * �t�B�[���h [isJavaStruts] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [Java Apache Struts �̃��b�Z�[�W���o�͂��邩�ǂ����BJava ����̂ݑΉ��B]�B
     *
     * @param argIsJavaStruts �t�B�[���h[isJavaStruts]�ɐݒ肷��l�B
     */
    public void setIsJavaStruts(final boolean argIsJavaStruts) {
        fIsJavaStruts = argIsJavaStruts;
    }

    /**
     * �t�B�[���h [isJavaStruts] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [Java Apache Struts �̃��b�Z�[�W���o�͂��邩�ǂ����BJava ����̂ݑΉ��B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[isJavaStruts]����擾�����l�B
     */
    public boolean getIsJavaStruts() {
        return fIsJavaStruts;
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
        buf.append("blanco.message.task.valueobject.BlancoMessageProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",metadir=" + fMetadir);
        buf.append(",targetdir=" + fTargetdir);
        buf.append(",tmpdir=" + fTmpdir);
        buf.append(",encoding=" + fEncoding);
        buf.append(",targetlang=" + fTargetlang);
        buf.append(",constants=" + fConstants);
        buf.append(",isJavaJsf=" + fIsJavaJsf);
        buf.append(",isJavaStruts=" + fIsJavaStruts);
        buf.append("]");
        return buf.toString();
    }
}
