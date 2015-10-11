// ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
using System;

namespace blanco.message.message
{
    /// <summary>blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B</summary>
    public class BlancoMessageMessage
    {
        /// <summary>������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]</summary>
        /// <remarks>
        /// <newpara>No.2: </newpara>
        /// </remarks>
        public static readonly string MBMSGI01 = "[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B";

        /// <summary>�L�[�l: KEY_MBMSGI01</summary>
        /// <remarks>
        /// <newpara>No.2: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI01 = "MBMSGI01";

        /// <summary>������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]</summary>
        /// <remarks>
        /// <newpara>No.3: </newpara>
        /// </remarks>
        public static readonly string MBMSGI02 = "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B";

        /// <summary>�L�[�l: KEY_MBMSGI02</summary>
        /// <remarks>
        /// <newpara>No.3: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI02 = "MBMSGI02";

        /// <summary>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]</summary>
        /// <remarks>
        /// <newpara>No.4: </newpara>
        /// </remarks>
        public static readonly string MBMSGI03 = "[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B";

        /// <summary>�L�[�l: KEY_MBMSGI03</summary>
        /// <remarks>
        /// <newpara>No.4: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI03 = "MBMSGI03";

        /// <summary>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]</summary>
        /// <remarks>
        /// <newpara>No.5: </newpara>
        /// </remarks>
        public static readonly string MBMSGI04 = "[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B";

        /// <summary>�L�[�l: KEY_MBMSGI04</summary>
        /// <remarks>
        /// <newpara>No.5: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGI04 = "MBMSGI04";

        /// <summary>������[���^�f�B���N�g��[{0}]�����݂��܂���B]</summary>
        /// <remarks>
        /// <newpara>No.8: </newpara>
        /// </remarks>
        public static readonly string MBMSGA01 = "[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B";

        /// <summary>�L�[�l: KEY_MBMSGA01</summary>
        /// <remarks>
        /// <newpara>No.8: </newpara>
        /// </remarks>
        public static readonly string KEY_MBMSGA01 = "MBMSGA01";

        /// <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B</summary>
        /// <remarks>
        /// <newpara>No.2: </newpara>
        /// <newpara>������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]</newpara>
        /// </remarks>
        /// <param name="arg0">�u��������{0}�̒l�B</param>
        /// <returns>���b�Z�[�W������B</returns>
        public virtual string GetMbmsgi01(string arg0)
        {
            if (arg0 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }

            return "[MBMSGI01] ���b�Z�[�W��`ID[" + arg0 + "]�̃p�b�P�[�W�����w�肳��Ă��܂���B";
        }

        /// <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B</summary>
        /// <remarks>
        /// <newpara>No.3: </newpara>
        /// <newpara>������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]</newpara>
        /// </remarks>
        /// <param name="arg0">�u��������{0}�̒l�B</param>
        /// <returns>���b�Z�[�W������B</returns>
        public virtual string GetMbmsgi02(string arg0)
        {
            if (arg0 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi02]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }

            return "[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[" + arg0 + "]���w�肳��܂����B";
        }

        /// <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B</summary>
        /// <remarks>
        /// <newpara>No.4: </newpara>
        /// <newpara>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]</newpara>
        /// </remarks>
        /// <param name="arg0">�u��������{0}�̒l�B</param>
        /// <param name="arg1">�u��������{1}�̒l�B</param>
        /// <returns>���b�Z�[�W������B</returns>
        public virtual string GetMbmsgi03(string arg0, string arg1)
        {
            if (arg0 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi03]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }
            if (arg1 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi03]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }

            return "[MBMSGI03] ���b�Z�[�W��`ID[" + arg0 + "]�ɂ����āA�L�[[" + arg1 + "]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B";
        }

        /// <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B</summary>
        /// <remarks>
        /// <newpara>No.5: </newpara>
        /// <newpara>������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]</newpara>
        /// </remarks>
        /// <param name="arg0">�u��������{0}�̒l�B</param>
        /// <param name="arg1">�u��������{1}�̒l�B</param>
        /// <param name="arg2">�u��������{2}�̒l�B</param>
        /// <param name="arg3">�u��������{3}�̒l�B</param>
        /// <returns>���b�Z�[�W������B</returns>
        public virtual string GetMbmsgi04(string arg0, string arg1, string arg2, string arg3)
        {
            if (arg0 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }
            if (arg1 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }
            if (arg2 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }
            if (arg3 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsgi04]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }

            return "[MBMSGI04] ���b�Z�[�W��`ID[" + arg0 + "]�ɂ����āA�L�[[" + arg1 + "]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[" + arg2 + "]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[" + arg3 + "]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B";
        }

        /// <summary>���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B</summary>
        /// <remarks>
        /// <newpara>No.8: </newpara>
        /// <newpara>������[���^�f�B���N�g��[{0}]�����݂��܂���B]</newpara>
        /// </remarks>
        /// <param name="arg0">�u��������{0}�̒l�B</param>
        /// <returns>���b�Z�[�W������B</returns>
        public virtual string GetMbmsga01(string arg0)
        {
            if (arg0 == null) {
                throw new ArgumentException("���\�b�h[GetMbmsga01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
            }

            return "[MBMSGA01] ���^�f�B���N�g��[" + arg0 + "]�����݂��܂���B";
        }
    }
}
