' ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
Imports System

Namespace blanco.sample.message
    ''' <summary>���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B</summary>
    Public Class Sample2Message

        ''' <summary>������[���b�Z�[�W�̃T���v���B���̂P�B]</summary>
        ''' <remarks>
        ''' <newpara>No.1: </newpara>
        ''' </remarks>
        Public Const MESSAGE001 As String = "[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B"

        ''' <summary>�L�[�l: KEY_MESSAGE001</summary>
        ''' <remarks>
        ''' <newpara>No.1: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE001 As String = "MESSAGE001"

        ''' <summary>������[���b�Z�[�W�u������[{0}]���u������܂��B]</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const MESSAGE002 As String = "[MESSAGE002] ���b�Z�[�W�u������[{0}]���u������܂��B"

        ''' <summary>�L�[�l: KEY_MESSAGE002</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE002 As String = "MESSAGE002"

        ''' <summary>������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const MESSAGE003 As String = "[MESSAGE003] ���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B"

        ''' <summary>�L�[�l: KEY_MESSAGE003</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE003 As String = "MESSAGE003"

        ''' <summary>������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const MESSAGE004 As String = "[MESSAGE004] �A���������b�Z�[�W�u������{0}{1}�̗�ł��B"

        ''' <summary>�L�[�l: KEY_MESSAGE004</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE004 As String = "MESSAGE004"

        ''' <summary>������[{0}�擪����u�������񂪂����B]</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const MESSAGE005 As String = "[MESSAGE005] {0}�擪����u�������񂪂����B"

        ''' <summary>�L�[�l: KEY_MESSAGE005</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE005 As String = "MESSAGE005"

        ''' <summary>������[�Ōオ�u��������̗�B{0}]</summary>
        ''' <remarks>
        ''' <newpara>No.6: </newpara>
        ''' </remarks>
        Public Const MESSAGE006 As String = "[MESSAGE006] �Ōオ�u��������̗�B{0}"

        ''' <summary>�L�[�l: KEY_MESSAGE006</summary>
        ''' <remarks>
        ''' <newpara>No.6: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE006 As String = "MESSAGE006"

        ''' <summary>������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]</summary>
        ''' <remarks>
        ''' <newpara>No.7: </newpara>
        ''' </remarks>
        Public Const MESSAGE007 As String = "[MESSAGE007] ���x�������u������{0}{1}{0}{1}{2}{1}{0}"

        ''' <summary>�L�[�l: KEY_MESSAGE007</summary>
        ''' <remarks>
        ''' <newpara>No.7: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE007 As String = "MESSAGE007"

        ''' <summary>������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const MESSAGE008 As String = "[MESSAGE008] ��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B"

        ''' <summary>�L�[�l: KEY_MESSAGE008</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE008 As String = "MESSAGE008"

        ''' <summary>������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]</summary>
        ''' <remarks>
        ''' <newpara>No.9: </newpara>
        ''' </remarks>
        Public Const MESSAGE009 As String = "[MESSAGE009] {0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B"

        ''' <summary>�L�[�l: KEY_MESSAGE009</summary>
        ''' <remarks>
        ''' <newpara>No.9: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE009 As String = "MESSAGE009"

        ''' <summary>������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]</summary>
        ''' <remarks>
        ''' <newpara>No.10: </newpara>
        ''' </remarks>
        Public Const MESSAGE010 As String = "[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����""�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B"

        ''' <summary>�L�[�l: KEY_MESSAGE010</summary>
        ''' <remarks>
        ''' <newpara>No.10: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE010 As String = "MESSAGE010"

        ''' <summary>������[�~]</summary>
        ''' <remarks>
        ''' <newpara>No.11: </newpara>
        ''' </remarks>
        Public Const MESSAGE011 As String = "[MESSAGE011] �~"

        ''' <summary>�L�[�l: KEY_MESSAGE011</summary>
        ''' <remarks>
        ''' <newpara>No.11: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE011 As String = "MESSAGE011"

        ''' <summary>������[���s[\n]�̎����B]</summary>
        ''' <remarks>
        ''' <newpara>No.12: </newpara>
        ''' </remarks>
        Public Const MESSAGE012 As String = "[MESSAGE012] ���s[\n]�̎����B"

        ''' <summary>�L�[�l: KEY_MESSAGE012</summary>
        ''' <remarks>
        ''' <newpara>No.12: </newpara>
        ''' </remarks>
        Public Const KEY_MESSAGE012 As String = "MESSAGE012"

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE001]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.1: </newpara>
        ''' <newpara>������[���b�Z�[�W�̃T���v���B���̂P�B]</newpara>
        ''' </remarks>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage001() As String
            Return "[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE002]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.2: </newpara>
        ''' <newpara>������[���b�Z�[�W�u������[{0}]���u������܂��B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage002(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE002] ���b�Z�[�W�u������[" + arg0 + "]���u������܂��B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE003]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.3: </newpara>
        ''' <newpara>������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage003(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage003]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage003]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE003] ���b�Z�[�W�u������[" + arg0 + "]�ɉ����A�����ЂƂ�[" + arg1 + "]���u������܂��B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE004]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.4: </newpara>
        ''' <newpara>������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage004(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage004]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage004]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE004] �A���������b�Z�[�W�u������" + arg0 + arg1 + "�̗�ł��B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE005]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.5: </newpara>
        ''' <newpara>������[{0}�擪����u�������񂪂����B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage005(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage005]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE005] " + arg0 + "�擪����u�������񂪂����B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE006]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.6: </newpara>
        ''' <newpara>������[�Ōオ�u��������̗�B{0}]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage006(arg0 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage006]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE006] �Ōオ�u��������̗�B" + arg0
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE007]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.7: </newpara>
        ''' <newpara>������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <param name="arg2">�u��������{2}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage007(arg0 As String, arg1 As String, arg2 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage007]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage007]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg2 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage007]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE007] ���x�������u������" + arg0 + arg1 + arg0 + arg1 + arg2 + arg1 + arg0
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE008]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.8: </newpara>
        ''' <newpara>������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <param name="arg2">�u��������{2}�̒l�B</param>
        ''' <param name="arg3">�u��������{3}�̒l�B</param>
        ''' <param name="arg4">�u��������{4}�̒l�B</param>
        ''' <param name="arg5">�u��������{5}�̒l�B</param>
        ''' <param name="arg6">�u��������{6}�̒l�B</param>
        ''' <param name="arg7">�u��������{7}�̒l�B</param>
        ''' <param name="arg8">�u��������{8}�̒l�B</param>
        ''' <param name="arg9">�u��������{9}�̒l�B</param>
        ''' <param name="arg10">�u��������{10}�̒l�B</param>
        ''' <param name="arg11">�u��������{11}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage008(arg0 As String, arg1 As String, arg2 As String, arg3 As String, arg4 As String, arg5 As String, arg6 As String, arg7 As String, arg8 As String, arg9 As String, arg10 As String, arg11 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg2 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg3 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg4 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg4]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg5 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg5]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg6 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg6]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg7 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg7]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg8 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg8]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg9 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg9]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg10 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg10]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg11 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage008]�̃p�����[�^[arg11]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE008] ��������̒u�������B" + arg11 + arg10 + arg9 + arg8 + arg7 + arg6 + arg5 + arg4 + arg3 + arg2 + arg1 + arg0 + "��12�B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE009]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.9: </newpara>
        ''' <newpara>������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]</newpara>
        ''' </remarks>
        ''' <param name="arg0">�u��������{0}�̒l�B</param>
        ''' <param name="arg1">�u��������{1}�̒l�B</param>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage009(arg0 As String, arg1 As String) As String
            If (arg0 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage009]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If
            If (arg1 Is Nothing) Then
                Throw New ArgumentException("���\�b�h[GetMessage009]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B")
            End If

            Return "[MESSAGE009] " + arg0 + "�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B" + arg1 + "�B���̒�`����0�I���W���ł��B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE010]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.10: </newpara>
        ''' <newpara>������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]</newpara>
        ''' </remarks>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage010() As String
            Return "[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����""�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\\�B"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE011]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.11: </newpara>
        ''' <newpara>������[�~]</newpara>
        ''' </remarks>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage011() As String
            Return "[MESSAGE011] �~"
        End Function

        ''' <summary>���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE012]�̕�������擾���܂��B</summary>
        ''' <remarks>
        ''' <newpara>No.12: </newpara>
        ''' <newpara>������[���s[\n]�̎����B]</newpara>
        ''' </remarks>
        ''' <returns>���b�Z�[�W������B</returns>
        Public Function GetMessage012() As String
            Return "[MESSAGE012] ���s[\n]�̎����B"
        End Function
    End Class
End Namespace
