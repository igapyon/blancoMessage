#
# ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
#

#
# ���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
#
class SampleMessage

    #
    # ������[���b�Z�[�W�̃T���v���B���̂P�B]
    #
    # No.1:
    #
    MESSAGE001 = '���b�Z�[�W�̃T���v���B���̂P�B'

    #
    # �L�[�l: KEY_MESSAGE001
    #
    # No.1:
    #
    KEY_MESSAGE001 = 'MESSAGE001'

    #
    # ������[���b�Z�[�W�u������[{0}]���u������܂��B]
    #
    # No.2:
    #
    MESSAGE002 = '���b�Z�[�W�u������[{0}]���u������܂��B'

    #
    # �L�[�l: KEY_MESSAGE002
    #
    # No.2:
    #
    KEY_MESSAGE002 = 'MESSAGE002'

    #
    # ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
    #
    # No.3:
    #
    MESSAGE003 = '���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B'

    #
    # �L�[�l: KEY_MESSAGE003
    #
    # No.3:
    #
    KEY_MESSAGE003 = 'MESSAGE003'

    #
    # ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
    #
    # No.4:
    #
    MESSAGE004 = '�A���������b�Z�[�W�u������{0}{1}�̗�ł��B'

    #
    # �L�[�l: KEY_MESSAGE004
    #
    # No.4:
    #
    KEY_MESSAGE004 = 'MESSAGE004'

    #
    # ������[{0}�擪����u�������񂪂����B]
    #
    # No.5:
    #
    MESSAGE005 = '{0}�擪����u�������񂪂����B'

    #
    # �L�[�l: KEY_MESSAGE005
    #
    # No.5:
    #
    KEY_MESSAGE005 = 'MESSAGE005'

    #
    # ������[�Ōオ�u��������̗�B{0}]
    #
    # No.6:
    #
    MESSAGE006 = '�Ōオ�u��������̗�B{0}'

    #
    # �L�[�l: KEY_MESSAGE006
    #
    # No.6:
    #
    KEY_MESSAGE006 = 'MESSAGE006'

    #
    # ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
    #
    # No.7:
    #
    MESSAGE007 = '���x�������u������{0}{1}{0}{1}{2}{1}{0}'

    #
    # �L�[�l: KEY_MESSAGE007
    #
    # No.7:
    #
    KEY_MESSAGE007 = 'MESSAGE007'

    #
    # ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
    #
    # No.8:
    #
    MESSAGE008 = '��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B'

    #
    # �L�[�l: KEY_MESSAGE008
    #
    # No.8:
    #
    KEY_MESSAGE008 = 'MESSAGE008'

    #
    # ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
    #
    # No.9:
    #
    MESSAGE009 = '{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B'

    #
    # �L�[�l: KEY_MESSAGE009
    #
    # No.9:
    #
    KEY_MESSAGE009 = 'MESSAGE009'

    #
    # ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
    #
    # No.10:
    #
    MESSAGE010 = '�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����\'�A�G���}�[�N\\�B'

    #
    # �L�[�l: KEY_MESSAGE010
    #
    # No.10:
    #
    KEY_MESSAGE010 = 'MESSAGE010'

    #
    # ������[�~]
    #
    # No.11:
    #
    MESSAGE011 = '�~'

    #
    # �L�[�l: KEY_MESSAGE011
    #
    # No.11:
    #
    KEY_MESSAGE011 = 'MESSAGE011'

    #
    # ������[���s[\n]�̎����B]
    #
    # No.12:
    #
    MESSAGE012 = '���s[\n]�̎����B'

    #
    # �L�[�l: KEY_MESSAGE012
    #
    # No.12:
    #
    KEY_MESSAGE012 = 'MESSAGE012'

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE001]�̕�������擾���܂��B
    #
    # No.1:
    # ������[���b�Z�[�W�̃T���v���B���̂P�B]
    #
    # return ���b�Z�[�W������B
    #
    def getMessage001()
        return '���b�Z�[�W�̃T���v���B���̂P�B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE002]�̕�������擾���܂��B
    #
    # No.2:
    # ������[���b�Z�[�W�u������[{0}]���u������܂��B]
    #
    # param arg0 �u��������{0}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage002(arg0)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage002]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '���b�Z�[�W�u������[' + arg0 + ']���u������܂��B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE003]�̕�������擾���܂��B
    #
    # No.3:
    # ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage003(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage003]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMessage003]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '���b�Z�[�W�u������[' + arg0 + ']�ɉ����A�����ЂƂ�[' + arg1 + ']���u������܂��B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE004]�̕�������擾���܂��B
    #
    # No.4:
    # ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage004(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage004]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMessage004]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '�A���������b�Z�[�W�u������' + arg0 + arg1 + '�̗�ł��B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE005]�̕�������擾���܂��B
    #
    # No.5:
    # ������[{0}�擪����u�������񂪂����B]
    #
    # param arg0 �u��������{0}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage005(arg0)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage005]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return arg0 + '�擪����u�������񂪂����B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE006]�̕�������擾���܂��B
    #
    # No.6:
    # ������[�Ōオ�u��������̗�B{0}]
    #
    # param arg0 �u��������{0}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage006(arg0)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage006]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '�Ōオ�u��������̗�B' + arg0
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE007]�̕�������擾���܂��B
    #
    # No.7:
    # ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # param arg2 �u��������{2}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage007(arg0, arg1, arg2)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage007]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMessage007]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg2.nil?
            raise ArgumentError, "���\�b�h[getMessage007]�̃p�����[�^[arg2]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '���x�������u������' + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE008]�̕�������擾���܂��B
    #
    # No.8:
    # ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # param arg2 �u��������{2}�̒l�B
    # param arg3 �u��������{3}�̒l�B
    # param arg4 �u��������{4}�̒l�B
    # param arg5 �u��������{5}�̒l�B
    # param arg6 �u��������{6}�̒l�B
    # param arg7 �u��������{7}�̒l�B
    # param arg8 �u��������{8}�̒l�B
    # param arg9 �u��������{9}�̒l�B
    # param arg10 �u��������{10}�̒l�B
    # param arg11 �u��������{11}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage008(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg2.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg2]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg3.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg3]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg4.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg4]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg5.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg5]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg6.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg6]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg7.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg7]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg8.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg8]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg9.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg9]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg10.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg10]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg11.nil?
            raise ArgumentError, "���\�b�h[getMessage008]�̃p�����[�^[arg11]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return '��������̒u�������B' + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + '��12�B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE009]�̕�������擾���܂��B
    #
    # No.9:
    # ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
    #
    # param arg0 �u��������{0}�̒l�B
    # param arg1 �u��������{1}�̒l�B
    # return ���b�Z�[�W������B
    #
    def getMessage009(arg0, arg1)
        if arg0.nil?
            raise ArgumentError, "���\�b�h[getMessage009]�̃p�����[�^[arg0]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end
        if arg1.nil?
            raise ArgumentError, "���\�b�h[getMessage009]�̃p�����[�^[arg1]��nil���^�����܂����B�������A���̃p�����[�^��nil��^���邱�Ƃ͂ł��܂���"
        end

        return arg0 + '�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B' + arg1 + '�B���̒�`����0�I���W���ł��B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE010]�̕�������擾���܂��B
    #
    # No.10:
    # ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
    #
    # return ���b�Z�[�W������B
    #
    def getMessage010()
        return '�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����\'�A�G���}�[�N\\�B'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE011]�̕�������擾���܂��B
    #
    # No.11:
    # ������[�~]
    #
    # return ���b�Z�[�W������B
    #
    def getMessage011()
        return '�~'
    end

    #
    # ���b�Z�[�W��`ID[Sample]�A�L�[[MESSAGE012]�̕�������擾���܂��B
    #
    # No.12:
    # ������[���s[\n]�̎����B]
    #
    # return ���b�Z�[�W������B
    #
    def getMessage012()
        return '���s[' + "\n" + ']�̎����B'
    end
end
