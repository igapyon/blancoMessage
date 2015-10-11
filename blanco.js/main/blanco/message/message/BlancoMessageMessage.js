/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */

/**
 * �f�t�H���g�R���X�g���N�^
 * @fileoverview ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 * @class blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B
 * @constructor
 */
function BlancoMessageMessage() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.BlancoMessageMessage �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

}

/**
 * ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
 * @type string
 * No.2:
 */
BlancoMessageMessage.MBMSGI01 = "[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B";

/**
 * �L�[�l: KEY_MBMSGI01
 * @type string
 * No.2:
 */
BlancoMessageMessage.KEY_MBMSGI01 = "MBMSGI01";

/**
 * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
 * @type string
 * No.3:
 */
BlancoMessageMessage.MBMSGI02 = "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B";

/**
 * �L�[�l: KEY_MBMSGI02
 * @type string
 * No.3:
 */
BlancoMessageMessage.KEY_MBMSGI02 = "MBMSGI02";

/**
 * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
 * @type string
 * No.4:
 */
BlancoMessageMessage.MBMSGI03 = "[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B";

/**
 * �L�[�l: KEY_MBMSGI03
 * @type string
 * No.4:
 */
BlancoMessageMessage.KEY_MBMSGI03 = "MBMSGI03";

/**
 * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
 * @type string
 * No.5:
 */
BlancoMessageMessage.MBMSGI04 = "[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B";

/**
 * �L�[�l: KEY_MBMSGI04
 * @type string
 * No.5:
 */
BlancoMessageMessage.KEY_MBMSGI04 = "MBMSGI04";

/**
 * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
 * @type string
 * No.8:
 */
BlancoMessageMessage.MBMSGA01 = "[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B";

/**
 * �L�[�l: KEY_MBMSGA01
 * @type string
 * No.8:
 */
BlancoMessageMessage.KEY_MBMSGA01 = "MBMSGA01";

/**
 * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.2:
 * ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
 */
BlancoMessageMessage.prototype.getMbmsgi01 = function(/* string */ arg0) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi01 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi01 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }

    return "[MBMSGI01] ���b�Z�[�W��`ID[" + arg0 + "]�̃p�b�P�[�W�����w�肳��Ă��܂���B";
};

/**
 * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.3:
 * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
 */
BlancoMessageMessage.prototype.getMbmsgi02 = function(/* string */ arg0) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi02 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi02 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }

    return "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[" + arg0 + "]���w�肳��܂����B";
};

/**
 * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.4:
 * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
 */
BlancoMessageMessage.prototype.getMbmsgi03 = function(/* string */ arg0, /* string */ arg1) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi03 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi03 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi03 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }

    return "[MBMSGI03] ���b�Z�[�W��`ID[" + arg0 + "]�ɂ����āA�L�[[" + arg1 + "]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B";
};

/**
 * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @param {string} arg2 �u��������{2}�̒l�B
 * @param {string} arg3 �u��������{3}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.5:
 * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
 */
BlancoMessageMessage.prototype.getMbmsgi04 = function(/* string */ arg0, /* string */ arg1, /* string */ arg2, /* string */ arg3) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 4) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 �̃p�����[�^��[4]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }
    if (typeof(arg2) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��3�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg2) + "]�^���^�����܂����B");
    }
    if (typeof(arg3) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��4�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg3) + "]�^���^�����܂����B");
    }

    return "[MBMSGI04] ���b�Z�[�W��`ID[" + arg0 + "]�ɂ����āA�L�[[" + arg1 + "]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[" + arg2 + "]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[" + arg3 + "]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B";
};

/**
 * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.8:
 * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
 */
BlancoMessageMessage.prototype.getMbmsga01 = function(/* string */ arg0) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsga01 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: BlancoMessageMessage.getMbmsga01 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }

    return "[MBMSGA01] ���^�f�B���N�g��[" + arg0 + "]�����݂��܂���B";
};
/* �N���X[BlancoMessageMessage]�錾�̏I���B */
