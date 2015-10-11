/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.message.valueobject;

import java.util.List;

/**
 * BlancoMessage�̂Ȃ��ŗ��p�����ValueObject�ł��B
 */
public class BlancoMessageStructure {
    /**
     * ���b�Z�[�W��`ID���w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [package]�B
     */
    private String fPackage;

    /**
     * ���b�Z�[�W��`�̐������L�ڂ��܂��B
     *
     * �t�B�[���h: [description]�B
     */
    private String fDescription;

    /**
     * �N���X���̌���ɕt�^�����T�t�B�b�N�X�B
     *
     * �t�B�[���h: [suffix]�B
     */
    private String fSuffix;

    /**
     * ���b�Z�[�W�������ID���ߍ��݂��s�����ǂ����B
     *
     * �t�B�[���h: [idEmbedding]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fIdEmbedding = false;

    /**
     * �t�B�[���h��ێ����郊�X�g�B
     *
     * �t�B�[���h: [fieldList]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.message.valueobject.BlancoMessageFieldStructure>()]�B
     */
    private List<blanco.message.valueobject.BlancoMessageFieldStructure> fFieldList = new java.util.ArrayList<blanco.message.valueobject.BlancoMessageFieldStructure>();

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W��`ID���w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W��`ID���w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [package] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argPackage �t�B�[���h[package]�ɐݒ肷��l�B
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h [package] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[package]����擾�����l�B
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W��`�̐������L�ڂ��܂��B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W��`�̐������L�ڂ��܂��B]�B
     *
     * @return �t�B�[���h[description]����擾�����l�B
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [suffix] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X���̌���ɕt�^�����T�t�B�b�N�X�B]�B
     *
     * @param argSuffix �t�B�[���h[suffix]�ɐݒ肷��l�B
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * �t�B�[���h [suffix] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X���̌���ɕt�^�����T�t�B�b�N�X�B]�B
     *
     * @return �t�B�[���h[suffix]����擾�����l�B
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * �t�B�[���h [idEmbedding] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W�������ID���ߍ��݂��s�����ǂ����B]�B
     *
     * @param argIdEmbedding �t�B�[���h[idEmbedding]�ɐݒ肷��l�B
     */
    public void setIdEmbedding(final boolean argIdEmbedding) {
        fIdEmbedding = argIdEmbedding;
    }

    /**
     * �t�B�[���h [idEmbedding] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [���b�Z�[�W�������ID���ߍ��݂��s�����ǂ����B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[idEmbedding]����擾�����l�B
     */
    public boolean getIdEmbedding() {
        return fIdEmbedding;
    }

    /**
     * �t�B�[���h [fieldList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h��ێ����郊�X�g�B]�B
     *
     * @param argFieldList �t�B�[���h[fieldList]�ɐݒ肷��l�B
     */
    public void setFieldList(final List<blanco.message.valueobject.BlancoMessageFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * �t�B�[���h [fieldList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h��ێ����郊�X�g�B]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.message.valueobject.BlancoMessageFieldStructure>()]�B
     *
     * @return �t�B�[���h[fieldList]����擾�����l�B
     */
    public List<blanco.message.valueobject.BlancoMessageFieldStructure> getFieldList() {
        return fFieldList;
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
        buf.append("blanco.message.valueobject.BlancoMessageStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",suffix=" + fSuffix);
        buf.append(",idEmbedding=" + fIdEmbedding);
        buf.append(",fieldList=" + fFieldList);
        buf.append("]");
        return buf.toString();
    }
}
