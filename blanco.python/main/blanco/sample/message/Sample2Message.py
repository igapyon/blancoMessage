# -*- coding: cp932 -*-
"""���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
"""
class Sample2Message:
    """���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
    """

    """������[���b�Z�[�W�̃T���v���B���̂P�B]

    No.1:
    """
    MESSAGE001 = '[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B'

    """�L�[�l: KEY_MESSAGE001

    No.1:
    """
    KEY_MESSAGE001 = 'MESSAGE001'

    """������[���b�Z�[�W�u������[{0}]���u������܂��B]

    No.2:
    """
    MESSAGE002 = '[MESSAGE002] ���b�Z�[�W�u������[{0}]���u������܂��B'

    """�L�[�l: KEY_MESSAGE002

    No.2:
    """
    KEY_MESSAGE002 = 'MESSAGE002'

    """������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]

    No.3:
    """
    MESSAGE003 = '[MESSAGE003] ���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B'

    """�L�[�l: KEY_MESSAGE003

    No.3:
    """
    KEY_MESSAGE003 = 'MESSAGE003'

    """������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]

    No.4:
    """
    MESSAGE004 = '[MESSAGE004] �A���������b�Z�[�W�u������{0}{1}�̗�ł��B'

    """�L�[�l: KEY_MESSAGE004

    No.4:
    """
    KEY_MESSAGE004 = 'MESSAGE004'

    """������[{0}�擪����u�������񂪂����B]

    No.5:
    """
    MESSAGE005 = '[MESSAGE005] {0}�擪����u�������񂪂����B'

    """�L�[�l: KEY_MESSAGE005

    No.5:
    """
    KEY_MESSAGE005 = 'MESSAGE005'

    """������[�Ōオ�u��������̗�B{0}]

    No.6:
    """
    MESSAGE006 = '[MESSAGE006] �Ōオ�u��������̗�B{0}'

    """�L�[�l: KEY_MESSAGE006

    No.6:
    """
    KEY_MESSAGE006 = 'MESSAGE006'

    """������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]

    No.7:
    """
    MESSAGE007 = '[MESSAGE007] ���x�������u������{0}{1}{0}{1}{2}{1}{0}'

    """�L�[�l: KEY_MESSAGE007

    No.7:
    """
    KEY_MESSAGE007 = 'MESSAGE007'

    """������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]

    No.8:
    """
    MESSAGE008 = '[MESSAGE008] ��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B'

    """�L�[�l: KEY_MESSAGE008

    No.8:
    """
    KEY_MESSAGE008 = 'MESSAGE008'

    """������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]

    No.9:
    """
    MESSAGE009 = '[MESSAGE009] {0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B'

    """�L�[�l: KEY_MESSAGE009

    No.9:
    """
    KEY_MESSAGE009 = 'MESSAGE009'

    """������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]

    No.10:
    """
    MESSAGE010 = '[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����\'�A�G���}�[�N\\�B'

    """�L�[�l: KEY_MESSAGE010

    No.10:
    """
    KEY_MESSAGE010 = 'MESSAGE010'

    """������[�~]

    No.11:
    """
    MESSAGE011 = '[MESSAGE011] �~'

    """�L�[�l: KEY_MESSAGE011

    No.11:
    """
    KEY_MESSAGE011 = 'MESSAGE011'

    """������[���s[\n]�̎����B]

    No.12:
    """
    MESSAGE012 = '[MESSAGE012] ���s[\n]�̎����B'

    """�L�[�l: KEY_MESSAGE012

    No.12:
    """
    KEY_MESSAGE012 = 'MESSAGE012'

    def getMessage001(self):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE001]�̕�������擾���܂��B

        No.1:
        ������[���b�Z�[�W�̃T���v���B���̂P�B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        return -- ���b�Z�[�W������B
        """
        return '[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B'
    #end

    def getMessage002(self, arg0):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE002]�̕�������擾���܂��B

        No.2:
        ������[���b�Z�[�W�u������[{0}]���u������܂��B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE002] ���b�Z�[�W�u������[' + arg0 + ']���u������܂��B'
    #end

    def getMessage003(self, arg0, arg1):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE003]�̕�������擾���܂��B

        No.3:
        ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage003]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMessage003]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE003] ���b�Z�[�W�u������[' + arg0 + ']�ɉ����A�����ЂƂ�[' + arg1 + ']���u������܂��B'
    #end

    def getMessage004(self, arg0, arg1):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE004]�̕�������擾���܂��B

        No.4:
        ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage004]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMessage004]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE004] �A���������b�Z�[�W�u������' + arg0 + arg1 + '�̗�ł��B'
    #end

    def getMessage005(self, arg0):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE005]�̕�������擾���܂��B

        No.5:
        ������[{0}�擪����u�������񂪂����B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage005]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE005] ' + arg0 + '�擪����u�������񂪂����B'
    #end

    def getMessage006(self, arg0):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE006]�̕�������擾���܂��B

        No.6:
        ������[�Ōオ�u��������̗�B{0}]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage006]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE006] �Ōオ�u��������̗�B' + arg0
    #end

    def getMessage007(self, arg0, arg1, arg2):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE007]�̕�������擾���܂��B

        No.7:
        ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        arg2 -- �u��������{2}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage007]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMessage007]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg2 is None:
            raise ValueError, "���\�b�h[getMessage007]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE007] ���x�������u������' + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0
    #end

    def getMessage008(self, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE008]�̕�������擾���܂��B

        No.8:
        ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        arg2 -- �u��������{2}�̒l�B
        arg3 -- �u��������{3}�̒l�B
        arg4 -- �u��������{4}�̒l�B
        arg5 -- �u��������{5}�̒l�B
        arg6 -- �u��������{6}�̒l�B
        arg7 -- �u��������{7}�̒l�B
        arg8 -- �u��������{8}�̒l�B
        arg9 -- �u��������{9}�̒l�B
        arg10 -- �u��������{10}�̒l�B
        arg11 -- �u��������{11}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg2 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg3 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg4 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg4]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg5 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg5]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg6 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg6]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg7 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg7]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg8 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg8]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg9 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg9]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg10 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg10]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg11 is None:
            raise ValueError, "���\�b�h[getMessage008]�̃p�����[�^[arg11]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE008] ��������̒u�������B' + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + '��12�B'
    #end

    def getMessage009(self, arg0, arg1):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE009]�̕�������擾���܂��B

        No.9:
        ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        arg0 -- �u��������{0}�̒l�B
        arg1 -- �u��������{1}�̒l�B
        return -- ���b�Z�[�W������B
        """
        if arg0 is None:
            raise ValueError, "���\�b�h[getMessage009]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end
        if arg1 is None:
            raise ValueError, "���\�b�h[getMessage009]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B"
        #end

        return '[MESSAGE009] ' + arg0 + '�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B' + arg1 + '�B���̒�`����0�I���W���ł��B'
    #end

    def getMessage010(self):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE010]�̕�������擾���܂��B

        No.10:
        ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        return -- ���b�Z�[�W������B
        """
        return '[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����\'�A�G���}�[�N\\�B'
    #end

    def getMessage011(self):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE011]�̕�������擾���܂��B

        No.11:
        ������[�~]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        return -- ���b�Z�[�W������B
        """
        return '[MESSAGE011] �~'
    #end

    def getMessage012(self):
        """���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE012]�̕�������擾���܂��B

        No.12:
        ������[���s[\n]�̎����B]

        self -- ���̃��\�b�h���܂ރN���X���g�B
        return -- ���b�Z�[�W������B
        """
        return '[MESSAGE012] ���s[' + "\n" + ']�̎����B'
    #end
#end
