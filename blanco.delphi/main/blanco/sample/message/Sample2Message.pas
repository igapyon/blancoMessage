// ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
unit Sample2Message;

interface
type
    // ���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
    TSample2Message = class(TObject)

        // ������[���b�Z�[�W�̃T���v���B���̂P�B]
        const MESSAGE001: String = '[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B';

        // �L�[�l: KEY_MESSAGE001
        const KEY_MESSAGE001: String = 'MESSAGE001';

        // ������[���b�Z�[�W�u������[{0}]���u������܂��B]
        const MESSAGE002: String = '[MESSAGE002] ���b�Z�[�W�u������[{0}]���u������܂��B';

        // �L�[�l: KEY_MESSAGE002
        const KEY_MESSAGE002: String = 'MESSAGE002';

        // ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
        const MESSAGE003: String = '[MESSAGE003] ���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B';

        // �L�[�l: KEY_MESSAGE003
        const KEY_MESSAGE003: String = 'MESSAGE003';

        // ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
        const MESSAGE004: String = '[MESSAGE004] �A���������b�Z�[�W�u������{0}{1}�̗�ł��B';

        // �L�[�l: KEY_MESSAGE004
        const KEY_MESSAGE004: String = 'MESSAGE004';

        // ������[{0}�擪����u�������񂪂����B]
        const MESSAGE005: String = '[MESSAGE005] {0}�擪����u�������񂪂����B';

        // �L�[�l: KEY_MESSAGE005
        const KEY_MESSAGE005: String = 'MESSAGE005';

        // ������[�Ōオ�u��������̗�B{0}]
        const MESSAGE006: String = '[MESSAGE006] �Ōオ�u��������̗�B{0}';

        // �L�[�l: KEY_MESSAGE006
        const KEY_MESSAGE006: String = 'MESSAGE006';

        // ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
        const MESSAGE007: String = '[MESSAGE007] ���x�������u������{0}{1}{0}{1}{2}{1}{0}';

        // �L�[�l: KEY_MESSAGE007
        const KEY_MESSAGE007: String = 'MESSAGE007';

        // ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
        const MESSAGE008: String = '[MESSAGE008] ��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B';

        // �L�[�l: KEY_MESSAGE008
        const KEY_MESSAGE008: String = 'MESSAGE008';

        // ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
        const MESSAGE009: String = '[MESSAGE009] {0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B';

        // �L�[�l: KEY_MESSAGE009
        const KEY_MESSAGE009: String = 'MESSAGE009';

        // ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
        const MESSAGE010: String = '[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����''�A�G���}�[�N\�B';

        // �L�[�l: KEY_MESSAGE010
        const KEY_MESSAGE010: String = 'MESSAGE010';

        // ������[�~]
        const MESSAGE011: String = '[MESSAGE011] �~';

        // �L�[�l: KEY_MESSAGE011
        const KEY_MESSAGE011: String = 'MESSAGE011';

        // ������[���s[\n]�̎����B]
        const MESSAGE012: String = '[MESSAGE012] ���s[\n]�̎����B';

        // �L�[�l: KEY_MESSAGE012
        const KEY_MESSAGE012: String = 'MESSAGE012';

        function getMessage001: String;

        function getMessage002(arg0: String): String;

        function getMessage003(arg0: String; arg1: String): String;

        function getMessage004(arg0: String; arg1: String): String;

        function getMessage005(arg0: String): String;

        function getMessage006(arg0: String): String;

        function getMessage007(arg0: String; arg1: String; arg2: String): String;

        function getMessage008(arg0: String; arg1: String; arg2: String; arg3: String; arg4: String; arg5: String; arg6: String; arg7: String; arg8: String; arg9: String; arg10: String; arg11: String): String;

        function getMessage009(arg0: String; arg1: String): String;

        function getMessage010: String;

        function getMessage011: String;

        function getMessage012: String;
    end;
implementation

    function TSample2Message.getMessage001: String;
    begin
        result:= '[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B';
        exit;
    end;

    function TSample2Message.getMessage002(arg0: String): String;
    begin
        result:= '[MESSAGE002] ���b�Z�[�W�u������[' + arg0 + ']���u������܂��B';
        exit;
    end;

    function TSample2Message.getMessage003(arg0: String; arg1: String): String;
    begin
        result:= '[MESSAGE003] ���b�Z�[�W�u������[' + arg0 + ']�ɉ����A�����ЂƂ�[' + arg1 + ']���u������܂��B';
        exit;
    end;

    function TSample2Message.getMessage004(arg0: String; arg1: String): String;
    begin
        result:= '[MESSAGE004] �A���������b�Z�[�W�u������' + arg0 + arg1 + '�̗�ł��B';
        exit;
    end;

    function TSample2Message.getMessage005(arg0: String): String;
    begin
        result:= '[MESSAGE005] ' + arg0 + '�擪����u�������񂪂����B';
        exit;
    end;

    function TSample2Message.getMessage006(arg0: String): String;
    begin
        result:= '[MESSAGE006] �Ōオ�u��������̗�B' + arg0;
        exit;
    end;

    function TSample2Message.getMessage007(arg0: String; arg1: String; arg2: String): String;
    begin
        result:= '[MESSAGE007] ���x�������u������' + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0;
        exit;
    end;

    function TSample2Message.getMessage008(arg0: String; arg1: String; arg2: String; arg3: String; arg4: String; arg5: String; arg6: String; arg7: String; arg8: String; arg9: String; arg10: String; arg11: String): String;
    begin
        result:= '[MESSAGE008] ��������̒u�������B' + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + '��12�B';
        exit;
    end;

    function TSample2Message.getMessage009(arg0: String; arg1: String): String;
    begin
        result:= '[MESSAGE009] ' + arg0 + '�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B' + arg1 + '�B���̒�`����0�I���W���ł��B';
        exit;
    end;

    function TSample2Message.getMessage010: String;
    begin
        result:= '[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����''�A�G���}�[�N\�B';
        exit;
    end;

    function TSample2Message.getMessage011: String;
    begin
        result:= '[MESSAGE011] �~';
        exit;
    end;

    function TSample2Message.getMessage012: String;
    begin
        result:= '[MESSAGE012] ���s[\n]�̎����B';
        exit;
    end;
end.

