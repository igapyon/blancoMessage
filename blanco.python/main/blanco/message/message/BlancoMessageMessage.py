# -*- coding: cp932 -*-
"""���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
"""
class BlancoMessageMessage:
    """blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B
    """

    """������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]

    No.2:
    """
    MBMSGI01 = '[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B'

    """�L�[�l: KEY_MBMSGI01

    No.2:
    """
    KEY_MBMSGI01 = 'MBMSGI01'

    """������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]

    No.3:
    """
    MBMSGI02 = '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B'

    """�L�[�l: KEY_MBMSGI02

    No.3:
    """
    KEY_MBMSGI02 = 'MBMSGI02'

    """������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]

    No.4:
    """
    MBMSGI03 = '[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B'

    """�L�[�l: KEY_MBMSGI03

    No.4:
    """
    KEY_MBMSGI03 = 'MBMSGI03'

    """������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]

    No.5:
    """
    MBMSGI04 = '[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B'

    """�L�[�l: KEY_MBMSGI04

    No.5:
    """
    KEY_MBMSGI04 = 'MBMSGI04'

    """������[���^�f�B���N�g��[{0}]�����݂��܂���B]

    No.8:
    """
    MBMSGA01 = '[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B'

    """�L�[�l: KEY_MBMSGA01

    No.8:
    """
    KEY_MBMSGA01 = 'MBMSGA01'

    def getMbmsgi01(self, arg0):
        """���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B

        No.2:
        ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMbmsgi01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MBMSGI01] ���b�Z�[�W��`ID[' + arg0 + ']�̃p�b�P�[�W�����w�肳��Ă��܂���B'
    #end

    def getMbmsgi02(self, arg0):
        """���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B

        No.3:
        ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMbmsgi02]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[' + arg0 + ']���w�肳��܂����B'
    #end

    def getMbmsgi03(self, arg0, arg1):
        """���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B

        No.4:
        ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMbmsgi03]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMbmsgi03]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MBMSGI03] ���b�Z�[�W��`ID[' + arg0 + ']�ɂ����āA�L�[[' + arg1 + ']��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B'
    #end

    def getMbmsgi04(self, arg0, arg1, arg2, arg3):
        """���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B

        No.5:
        ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        arg2 -- �u��������{2}�̒l�B
        arg3 -- �u��������{3}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg2 is None:
            raise ValueError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg3 is None:
            raise ValueError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MBMSGI04] ���b�Z�[�W��`ID[' + arg0 + ']�ɂ����āA�L�[[' + arg1 + ']�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' + arg2 + ']�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' + arg3 + ']�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B'
    #end

    def getMbmsga01(self, arg0):
        """���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B

        No.8:
        ������[���^�f�B���N�g��[{0}]�����݂��܂���B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMbmsga01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MBMSGA01] ���^�f�B���N�g��[' + arg0 + ']�����݂��܂���B'
    #end
#end
