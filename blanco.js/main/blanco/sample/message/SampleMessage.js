/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */

/**
 * �f�t�H���g�R���X�g���N�^
 * @fileoverview ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 * @class ���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
 * @constructor
 */
function SampleMessage() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: SampleMessage.SampleMessage �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

}

/**
 * ������[���b�Z�[�W�̃T���v���B���̂P�B]
 * @type string
 * No.1:
 */
SampleMessage.MESSAGE001 = "���b�Z�[�W�̃T���v���B���̂P�B";

/**
 * �L�[�l: KEY_MESSAGE001
 * @type string
 * No.1:
 */
SampleMessage.KEY_MESSAGE001 = "MESSAGE001";

/**
 * ������[���b�Z�[�W�u������[{0}]���u������܂��B]
 * @type string
 * No.2:
 */
SampleMessage.MESSAGE002 = "���b�Z�[�W�u������[{0}]���u������܂��B";

/**
 * �L�[�l: KEY_MESSAGE002
 * @type string
 * No.2:
 */
SampleMessage.KEY_MESSAGE002 = "MESSAGE002";

/**
 * ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
 * @type string
 * No.3:
 */
SampleMessage.MESSAGE003 = "���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B";

/**
 * �L�[�l: KEY_MESSAGE003
 * @type string
 * No.3:
 */
SampleMessage.KEY_MESSAGE003 = "MESSAGE003";

/**
 * ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
 * @type string
 * No.4:
 */
SampleMessage.MESSAGE004 = "�A���������b�Z�[�W�u������{0}{1}�̗�ł��B";

/**
 * �L�[�l: KEY_MESSAGE004
 * @type string
 * No.4:
 */
SampleMessage.KEY_MESSAGE004 = "MESSAGE004";

/**
 * ������[{0}�擪����u�������񂪂����B]
 * @type string
 * No.5:
 */
SampleMessage.MESSAGE005 = "{0}�擪����u�������񂪂����B";

/**
 * �L�[�l: KEY_MESSAGE005
 * @type string
 * No.5:
 */
SampleMessage.KEY_MESSAGE005 = "MESSAGE005";

/**
 * ������[�Ōオ�u��������̗�B{0}]
 * @type string
 * No.6:
 */
SampleMessage.MESSAGE006 = "�Ōオ�u��������̗�B{0}";

/**
 * �L�[�l: KEY_MESSAGE006
 * @type string
 * No.6:
 */
SampleMessage.KEY_MESSAGE006 = "MESSAGE006";

/**
 * ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
 * @type string
 * No.7:
 */
SampleMessage.MESSAGE007 = "���x�������u������{0}{1}{0}{1}{2}{1}{0}";

/**
 * �L�[�l: KEY_MESSAGE007
 * @type string
 * No.7:
 */
SampleMessage.KEY_MESSAGE007 = "MESSAGE007";

/**
 * ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
 * @type string
 * No.8:
 */
SampleMessage.MESSAGE008 = "��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B";

/**
 * �L�[�l: KEY_MESSAGE008
 * @type string
 * No.8:
 */
SampleMessage.KEY_MESSAGE008 = "MESSAGE008";

/**
 * ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
 * @type string
 * No.9:
 */
SampleMessage.MESSAGE009 = "{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B";

/**
 * �L�[�l: KEY_MESSAGE009
 * @type string
 * No.9:
 */
SampleMessage.KEY_MESSAGE009 = "MESSAGE009";

/**
 * ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
 * @type string
 * No.10:
 */
SampleMessage.MESSAGE010 = "�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����\"�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B";

/**
 * �L�[�l: KEY_MESSAGE010
 * @type string
 * No.10:
 */
SampleMessage.KEY_MESSAGE010 = "MESSAGE010";

/**
 * ������[�~]
 * @type string
 * No.11:
 */
SampleMessage.MESSAGE011 = "�~";

/**
 * �L�[�l: KEY_MESSAGE011
 * @type string
 * No.11:
 */
SampleMessage.KEY_MESSAGE011 = "MESSAGE011";

/**
 * ������[���s[\n]�̎����B]
 * @type string
 * No.12:
 */
SampleMessage.MESSAGE012 = "���s[\n]�̎����B";

/**
 * �L�[�l: KEY_MESSAGE012
 * @type string
 * No.12:
 */
SampleMessage.KEY_MESSAGE012 = "MESSAGE012";

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE001]�̕�������擾���܂��B
 * @addon
 * @return ���b�Z�[�W������B
 * @type string
 * No.1:
 * ������[���b�Z�[�W�̃T���v���B���̂P�B]
 */
SampleMessage.prototype.getMessage001 = function() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage001 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

    return "���b�Z�[�W�̃T���v���B���̂P�B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE002]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.2:
 * ������[���b�Z�[�W�u������[{0}]���u������܂��B]
 */
SampleMessage.prototype.getMessage002 = function(/* string */ arg0) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage002 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage002 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }

    return "���b�Z�[�W�u������[" + arg0 + "]���u������܂��B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE003]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.3:
 * ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
 */
SampleMessage.prototype.getMessage003 = function(/* string */ arg0, /* string */ arg1) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage003 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage003 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage003 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }

    return "���b�Z�[�W�u������[" + arg0 + "]�ɉ����A�����ЂƂ�[" + arg1 + "]���u������܂��B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE004]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.4:
 * ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
 */
SampleMessage.prototype.getMessage004 = function(/* string */ arg0, /* string */ arg1) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage004 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage004 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage004 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }

    return "�A���������b�Z�[�W�u������" + arg0 + arg1 + "�̗�ł��B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE005]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.5:
 * ������[{0}�擪����u�������񂪂����B]
 */
SampleMessage.prototype.getMessage005 = function(/* string */ arg0) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage005 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage005 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }

    return arg0 + "�擪����u�������񂪂����B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE006]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.6:
 * ������[�Ōオ�u��������̗�B{0}]
 */
SampleMessage.prototype.getMessage006 = function(/* string */ arg0) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 1) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage006 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage006 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }

    return "�Ōオ�u��������̗�B" + arg0;
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE007]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @param {string} arg2 �u��������{2}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.7:
 * ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
 */
SampleMessage.prototype.getMessage007 = function(/* string */ arg0, /* string */ arg1, /* string */ arg2) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 3) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage007 �̃p�����[�^��[3]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage007 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage007 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }
    if (typeof(arg2) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage007 ��3�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg2) + "]�^���^�����܂����B");
    }

    return "���x�������u������" + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0;
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE008]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @param {string} arg2 �u��������{2}�̒l�B
 * @param {string} arg3 �u��������{3}�̒l�B
 * @param {string} arg4 �u��������{4}�̒l�B
 * @param {string} arg5 �u��������{5}�̒l�B
 * @param {string} arg6 �u��������{6}�̒l�B
 * @param {string} arg7 �u��������{7}�̒l�B
 * @param {string} arg8 �u��������{8}�̒l�B
 * @param {string} arg9 �u��������{9}�̒l�B
 * @param {string} arg10 �u��������{10}�̒l�B
 * @param {string} arg11 �u��������{11}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.8:
 * ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
 */
SampleMessage.prototype.getMessage008 = function(/* string */ arg0, /* string */ arg1, /* string */ arg2, /* string */ arg3, /* string */ arg4, /* string */ arg5, /* string */ arg6, /* string */ arg7, /* string */ arg8, /* string */ arg9, /* string */ arg10, /* string */ arg11) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 12) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 �̃p�����[�^��[12]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }
    if (typeof(arg2) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��3�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg2) + "]�^���^�����܂����B");
    }
    if (typeof(arg3) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��4�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg3) + "]�^���^�����܂����B");
    }
    if (typeof(arg4) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��5�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg4) + "]�^���^�����܂����B");
    }
    if (typeof(arg5) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��6�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg5) + "]�^���^�����܂����B");
    }
    if (typeof(arg6) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��7�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg6) + "]�^���^�����܂����B");
    }
    if (typeof(arg7) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��8�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg7) + "]�^���^�����܂����B");
    }
    if (typeof(arg8) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��9�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg8) + "]�^���^�����܂����B");
    }
    if (typeof(arg9) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��10�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg9) + "]�^���^�����܂����B");
    }
    if (typeof(arg10) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��11�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg10) + "]�^���^�����܂����B");
    }
    if (typeof(arg11) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage008 ��12�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg11) + "]�^���^�����܂����B");
    }

    return "��������̒u�������B" + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + "��12�B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE009]�̕�������擾���܂��B
 * @addon
 * @param {string} arg0 �u��������{0}�̒l�B
 * @param {string} arg1 �u��������{1}�̒l�B
 * @return ���b�Z�[�W������B
 * @type string
 * No.9:
 * ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
 */
SampleMessage.prototype.getMessage009 = function(/* string */ arg0, /* string */ arg1) {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 2) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage009 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }
    if (typeof(arg0) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage009 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg0) + "]�^���^�����܂����B");
    }
    if (typeof(arg1) != "string") {
        throw new Error("[ArgumentException]: SampleMessage.getMessage009 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[" + typeof(arg1) + "]�^���^�����܂����B");
    }

    return arg0 + "�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B" + arg1 + "�B���̒�`����0�I���W���ł��B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE010]�̕�������擾���܂��B
 * @addon
 * @return ���b�Z�[�W������B
 * @type string
 * No.10:
 * ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
 */
SampleMessage.prototype.getMessage010 = function() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage010 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

    return "�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����\"�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE011]�̕�������擾���܂��B
 * @addon
 * @return ���b�Z�[�W������B
 * @type string
 * No.11:
 * ������[�~]
 */
SampleMessage.prototype.getMessage011 = function() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage011 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

    return "�~";
};

/**
 * ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE012]�̕�������擾���܂��B
 * @addon
 * @return ���b�Z�[�W������B
 * @type string
 * No.12:
 * ������[���s[\n]�̎����B]
 */
SampleMessage.prototype.getMessage012 = function() {
    /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
    if (arguments.length !== 0) {
        throw new Error("[ArgumentException]: SampleMessage.getMessage012 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[" + arguments.length +  "]�̃p�����[�^�𔺂��ČĂяo����܂����B");
    }

    return "���s[\n]�̎����B";
};
/* �N���X[SampleMessage]�錾�̏I���B */
