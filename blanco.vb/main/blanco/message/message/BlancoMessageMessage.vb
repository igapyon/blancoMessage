' ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
Imports System

Namespace blanco.message.message
    ''' <summary>blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B</summary>
    Public Class BlancoMessageMessage

        ''' <summary>������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const MBMSGI01 As String = "[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B"

        ''' <summary>�L�[�l: KEY_MBMSGI01</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI01 As String = "MBMSGI01"

        ''' <summary>������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const MBMSGI02 As String = "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B"

        ''' <summary>�L�[�l: KEY_MBMSGI02</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI02 As String = "MBMSGI02"

        ''' <summary>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const MBMSGI03 As String = "[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B"

        ''' <summary>�L�[�l: KEY_MBMSGI03</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI03 As String = "MBMSGI03"

        ''' <summary>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const MBMSGI04 As String = "[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B"

        ''' <summary>�L�[�l: KEY_MBMSGI04</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGI04 As String = "MBMSGI04"

        ''' <summary>������[���^�f�B���N�g��[{0}]�����݂��܂���B]</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const MBMSGA01 As String = "[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B"

        ''' <summary>�L�[�l: KEY_MBMSGA01</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const KEY_MBMSGA01 As String = "MBMSGA01"

        ''' <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' <newpara>������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMbmsgi01(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MBMSGI01] ���b�Z�[�W��`ID[" + arg0 + "]�̃p�b�P�[�W�����w�肳��Ă��܂���B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' <newpara>������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMbmsgi02(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi02]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[" + arg0 + "]���w�肳��܂����B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' <newpara>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMbmsgi03(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi03]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi03]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MBMSGI03] ���b�Z�[�W��`ID[" + arg0 + "]�ɂ����āA�L�[[" + arg1 + "]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' <newpara>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <param name="arg2">�u��������{2}�̒l�B</param>
        ''' <param name="arg3">�u��������{3}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMbmsgi04(arg0 As String, arg1 As String, arg2 As String, arg3 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg2 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg3 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MBMSGI04] ���b�Z�[�W��`ID[" + arg0 + "]�ɂ����āA�L�[[" + arg1 + "]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[" + arg2 + "]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[" + arg3 + "]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' <newpara>������[���^�f�B���N�g��[{0}]�����݂��܂���B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMbmsga01(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMbmsga01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MBMSGA01] ���^�f�B���N�g��[" + arg0 + "]�����݂��܂���B"
        End Function
    End Class
End Namespace
