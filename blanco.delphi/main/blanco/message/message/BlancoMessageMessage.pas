// ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
unit BlancoMessageMessage;

interface
type
    // blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B
    TBlancoMessageMessage = class(TObject)

        // ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
        const MBMSGI01: String = '[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B';

        // �L�[�l: KEY_MBMSGI01
        const KEY_MBMSGI01: String = 'MBMSGI01';

        // ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
        const MBMSGI02: String = '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B';

        // �L�[�l: KEY_MBMSGI02
        const KEY_MBMSGI02: String = 'MBMSGI02';

        // ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
        const MBMSGI03: String = '[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B';

        // �L�[�l: KEY_MBMSGI03
        const KEY_MBMSGI03: String = 'MBMSGI03';

        // ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
        const MBMSGI04: String = '[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B';

        // �L�[�l: KEY_MBMSGI04
        const KEY_MBMSGI04: String = 'MBMSGI04';

        // ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
        const MBMSGA01: String = '[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B';

        // �L�[�l: KEY_MBMSGA01
        const KEY_MBMSGA01: String = 'MBMSGA01';

        function getMbmsgi01(arg0: String): String;

        function getMbmsgi02(arg0: String): String;

        function getMbmsgi03(arg0: String; arg1: String): String;

        function getMbmsgi04(arg0: String; arg1: String; arg2: String; arg3: String): String;

        function getMbmsga01(arg0: String): String;
    end;
implementation

    function TBlancoMessageMessage.getMbmsgi01(arg0: String): String;
    begin
        result:= '[MBMSGI01] ���b�Z�[�W��`ID[' + arg0 + ']�̃p�b�P�[�W�����w�肳��Ă��܂���B';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsgi02(arg0: String): String;
    begin
        result:= '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[' + arg0 + ']���w�肳��܂����B';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsgi03(arg0: String; arg1: String): String;
    begin
        result:= '[MBMSGI03] ���b�Z�[�W��`ID[' + arg0 + ']�ɂ����āA�L�[[' + arg1 + ']��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsgi04(arg0: String; arg1: String; arg2: String; arg3: String): String;
    begin
        result:= '[MBMSGI04] ���b�Z�[�W��`ID[' + arg0 + ']�ɂ����āA�L�[[' + arg1 + ']�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' + arg2 + ']�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' + arg3 + ']�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B';
        exit;
    end;

    function TBlancoMessageMessage.getMbmsga01(arg0: String): String;
    begin
        result:= '[MBMSGA01] ���^�f�B���N�g��[' + arg0 + ']�����݂��܂���B';
        exit;
    end;
end.

