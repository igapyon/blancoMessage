#
# ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
#

#
# blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B
#
class BlancoMessageMessage

    #
    # ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
    #
    # No.2:
    #
    MBMSGI01 = '[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B'

    #
    # �L�[�l: KEY_MBMSGI01
    #
    # No.2:
    #
    KEY_MBMSGI01 = 'MBMSGI01'

    #
    # ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
    #
    # No.3:
    #
    MBMSGI02 = '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B'

    #
    # �L�[�l: KEY_MBMSGI02
    #
    # No.3:
    #
    KEY_MBMSGI02 = 'MBMSGI02'

    #
    # ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
    #
    # No.4:
    #
    MBMSGI03 = '[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B'

    #
    # �L�[�l: KEY_MBMSGI03
    #
    # No.4:
    #
    KEY_MBMSGI03 = 'MBMSGI03'

    #
    # ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
    #
    # No.5:
    #
    MBMSGI04 = '[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B'

    #
    # �L�[�l: KEY_MBMSGI04
    #
    # No.5:
    #
    KEY_MBMSGI04 = 'MBMSGI04'

    #
    # ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
    #
    # No.8:
    #
    MBMSGA01 = '[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B'

    #
    # �L�[�l: KEY_MBMSGA01
    #
    # No.8:
    #
    KEY_MBMSGA01 = 'MBMSGA01'

    #
    # ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B
    #
    # No.2:
    # ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
    #
    # param arg0 �u��������{0}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMbmsgi01(arg0)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi01]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '[MBMSGI01] ���b�Z�[�W��`ID[' + arg0 + ']�̃p�b�P�[�W�����w�肳��Ă��܂���B'
    end

    #
    # ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B
    #
    # No.3:
    # ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
    #
    # param arg0 �u��������{0}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMbmsgi02(arg0)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi02]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[' + arg0 + ']���w�肳��܂����B'
    end

    #
    # ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B
    #
    # No.4:
    # ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMbmsgi03(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi03]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi03]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '[MBMSGI03] ���b�Z�[�W��`ID[' + arg0 + ']�ɂ����āA�L�[[' + arg1 + ']��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B'
    end

    #
    # ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B
    #
    # No.5:
    # ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # param arg2 �u��������{2}�̒l�B
    # param arg3 �u��������{3}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMbmsgi04(arg0, arg1, arg2, arg3)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg2.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg2]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg3.nil?
            raise ArgumentError, "���\�b�h[getMbmsgi04]�̃p�����[�^[arg3]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '[MBMSGI04] ���b�Z�[�W��`ID[' + arg0 + ']�ɂ����āA�L�[[' + arg1 + ']�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' + arg2 + ']�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' + arg3 + ']�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B'
    end

    #
    # ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B
    #
    # No.8:
    # ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
    #
    # param arg0 �u��������{0}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMbmsga01(arg0)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMbmsga01]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '[MBMSGA01] ���^�f�B���N�g��[' + arg0 + ']�����݂��܂���B'
    end
end
