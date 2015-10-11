<?php
/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
/*. DOC <@package blanco.sample.message;>.*/

/*. require_module 'standard'; .*/;

/**
 * ���b�Z�[�W�̃T���v���B���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
 */
class Sample2Message {
    /**
     * ������[���b�Z�[�W�̃T���v���B���̂P�B]
     *
     * No.1:
     */
    const MESSAGE001 = '[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B';

    /**
     * �L�[�l: KEY_MESSAGE001
     *
     * No.1:
     */
    const KEY_MESSAGE001 = 'MESSAGE001';

    /**
     * ������[���b�Z�[�W�u������[{0}]���u������܂��B]
     *
     * No.2:
     */
    const MESSAGE002 = '[MESSAGE002] ���b�Z�[�W�u������[{0}]���u������܂��B';

    /**
     * �L�[�l: KEY_MESSAGE002
     *
     * No.2:
     */
    const KEY_MESSAGE002 = 'MESSAGE002';

    /**
     * ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
     *
     * No.3:
     */
    const MESSAGE003 = '[MESSAGE003] ���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B';

    /**
     * �L�[�l: KEY_MESSAGE003
     *
     * No.3:
     */
    const KEY_MESSAGE003 = 'MESSAGE003';

    /**
     * ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
     *
     * No.4:
     */
    const MESSAGE004 = '[MESSAGE004] �A���������b�Z�[�W�u������{0}{1}�̗�ł��B';

    /**
     * �L�[�l: KEY_MESSAGE004
     *
     * No.4:
     */
    const KEY_MESSAGE004 = 'MESSAGE004';

    /**
     * ������[{0}�擪����u�������񂪂����B]
     *
     * No.5:
     */
    const MESSAGE005 = '[MESSAGE005] {0}�擪����u�������񂪂����B';

    /**
     * �L�[�l: KEY_MESSAGE005
     *
     * No.5:
     */
    const KEY_MESSAGE005 = 'MESSAGE005';

    /**
     * ������[�Ōオ�u��������̗�B{0}]
     *
     * No.6:
     */
    const MESSAGE006 = '[MESSAGE006] �Ōオ�u��������̗�B{0}';

    /**
     * �L�[�l: KEY_MESSAGE006
     *
     * No.6:
     */
    const KEY_MESSAGE006 = 'MESSAGE006';

    /**
     * ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
     *
     * No.7:
     */
    const MESSAGE007 = '[MESSAGE007] ���x�������u������{0}{1}{0}{1}{2}{1}{0}';

    /**
     * �L�[�l: KEY_MESSAGE007
     *
     * No.7:
     */
    const KEY_MESSAGE007 = 'MESSAGE007';

    /**
     * ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
     *
     * No.8:
     */
    const MESSAGE008 = '[MESSAGE008] ��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B';

    /**
     * �L�[�l: KEY_MESSAGE008
     *
     * No.8:
     */
    const KEY_MESSAGE008 = 'MESSAGE008';

    /**
     * ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
     *
     * No.9:
     */
    const MESSAGE009 = '[MESSAGE009] {0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B';

    /**
     * �L�[�l: KEY_MESSAGE009
     *
     * No.9:
     */
    const KEY_MESSAGE009 = 'MESSAGE009';

    /**
     * ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&amp;quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
     *
     * No.10:
     */
    const MESSAGE010 = '[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����\'�A�G���}�[�N\\�B';

    /**
     * �L�[�l: KEY_MESSAGE010
     *
     * No.10:
     */
    const KEY_MESSAGE010 = 'MESSAGE010';

    /**
     * ������[�~]
     *
     * No.11:
     */
    const MESSAGE011 = '[MESSAGE011] �~';

    /**
     * �L�[�l: KEY_MESSAGE011
     *
     * No.11:
     */
    const KEY_MESSAGE011 = 'MESSAGE011';

    /**
     * ������[���s[\n]�̎����B]
     *
     * No.12:
     */
    const MESSAGE012 = '[MESSAGE012] ���s[\n]�̎����B';

    /**
     * �L�[�l: KEY_MESSAGE012
     *
     * No.12:
     */
    const KEY_MESSAGE012 = 'MESSAGE012';

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE001]�̕�������擾���܂��B
     *
     * No.1:
     * ������[���b�Z�[�W�̃T���v���B���̂P�B]
     *
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage001() {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 0) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage001 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }

        return '[MESSAGE001] ���b�Z�[�W�̃T���v���B���̂P�B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE002]�̕�������擾���܂��B
     *
     * No.2:
     * ������[���b�Z�[�W�u������[{0}]���u������܂��B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage002(/*.string.*/ $arg0) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage002 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage002 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE002] ���b�Z�[�W�u������[' . $arg0 . ']���u������܂��B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE003]�̕�������擾���܂��B
     *
     * No.3:
     * ������[���b�Z�[�W�u������[{0}]�ɉ����A�����ЂƂ�[{1}]���u������܂��B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage003(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 2) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage003 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage003 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage003 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage003]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMessage003]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE003] ���b�Z�[�W�u������[' . $arg0 . ']�ɉ����A�����ЂƂ�[' . $arg1 . ']���u������܂��B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE004]�̕�������擾���܂��B
     *
     * No.4:
     * ������[�A���������b�Z�[�W�u������{0}{1}�̗�ł��B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage004(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 2) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage004 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage004 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage004 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage004]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMessage004]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE004] �A���������b�Z�[�W�u������' . $arg0 . $arg1 . '�̗�ł��B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE005]�̕�������擾���܂��B
     *
     * No.5:
     * ������[{0}�擪����u�������񂪂����B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage005(/*.string.*/ $arg0) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage005 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage005 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage005]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE005] ' . $arg0 . '�擪����u�������񂪂����B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE006]�̕�������擾���܂��B
     *
     * No.6:
     * ������[�Ōオ�u��������̗�B{0}]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage006(/*.string.*/ $arg0) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage006 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage006 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage006]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE006] �Ōオ�u��������̗�B' . $arg0;
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE007]�̕�������擾���܂��B
     *
     * No.7:
     * ������[���x�������u������{0}{1}{0}{1}{2}{1}{0}]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @param string $arg2 �u��������{2}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage007(/*.string.*/ $arg0, /*.string.*/ $arg1, /*.string.*/ $arg2) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 3) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage007 �̃p�����[�^��[3]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage007 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage007 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }
        if (gettype($arg2) !== 'string' && gettype($arg2) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage007 ��3�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg2) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage007]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMessage007]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg2 === null) {
            throw new Exception('���\�b�h[getMessage007]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE007] ���x�������u������' . $arg0 . $arg1 . $arg0 . $arg1 . $arg2 . $arg1 . $arg0;
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE008]�̕�������擾���܂��B
     *
     * No.8:
     * ������[��������̒u�������B{11}{10}{9}{8}{7}{6}{5}{4}{3}{2}{1}{0}��12�B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @param string $arg2 �u��������{2}�̒l�B
     * @param string $arg3 �u��������{3}�̒l�B
     * @param string $arg4 �u��������{4}�̒l�B
     * @param string $arg5 �u��������{5}�̒l�B
     * @param string $arg6 �u��������{6}�̒l�B
     * @param string $arg7 �u��������{7}�̒l�B
     * @param string $arg8 �u��������{8}�̒l�B
     * @param string $arg9 �u��������{9}�̒l�B
     * @param string $arg10 �u��������{10}�̒l�B
     * @param string $arg11 �u��������{11}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage008(/*.string.*/ $arg0, /*.string.*/ $arg1, /*.string.*/ $arg2, /*.string.*/ $arg3, /*.string.*/ $arg4, /*.string.*/ $arg5, /*.string.*/ $arg6, /*.string.*/ $arg7, /*.string.*/ $arg8, /*.string.*/ $arg9, /*.string.*/ $arg10, /*.string.*/ $arg11) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 12) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 �̃p�����[�^��[12]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }
        if (gettype($arg2) !== 'string' && gettype($arg2) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��3�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg2) . ']�^���^�����܂����B');
        }
        if (gettype($arg3) !== 'string' && gettype($arg3) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��4�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg3) . ']�^���^�����܂����B');
        }
        if (gettype($arg4) !== 'string' && gettype($arg4) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��5�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg4) . ']�^���^�����܂����B');
        }
        if (gettype($arg5) !== 'string' && gettype($arg5) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��6�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg5) . ']�^���^�����܂����B');
        }
        if (gettype($arg6) !== 'string' && gettype($arg6) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��7�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg6) . ']�^���^�����܂����B');
        }
        if (gettype($arg7) !== 'string' && gettype($arg7) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��8�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg7) . ']�^���^�����܂����B');
        }
        if (gettype($arg8) !== 'string' && gettype($arg8) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��9�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg8) . ']�^���^�����܂����B');
        }
        if (gettype($arg9) !== 'string' && gettype($arg9) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��10�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg9) . ']�^���^�����܂����B');
        }
        if (gettype($arg10) !== 'string' && gettype($arg10) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��11�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg10) . ']�^���^�����܂����B');
        }
        if (gettype($arg11) !== 'string' && gettype($arg11) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage008 ��12�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg11) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg2 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg3 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg4 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg4]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg5 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg5]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg6 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg6]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg7 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg7]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg8 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg8]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg9 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg9]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg10 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg10]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg11 === null) {
            throw new Exception('���\�b�h[getMessage008]�̃p�����[�^[arg11]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE008] ��������̒u�������B' . $arg11 . $arg10 . $arg9 . $arg8 . $arg7 . $arg6 . $arg5 . $arg4 . $arg3 . $arg2 . $arg1 . $arg0 . '��12�B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE009]�̕�������擾���܂��B
     *
     * No.9:
     * ������[{0}�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B{1}�B���̒�`����0�I���W���ł��B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage009(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 2) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage009 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage009 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage009 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMessage009]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMessage009]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MESSAGE009] ' . $arg0 . '�ԍ�����Ԃƒu��������͕s���Ƃ��Ĕ��f����܂��B' . $arg1 . '�B���̒�`����0�I���W���ł��B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE010]�̕�������擾���܂��B
     *
     * No.10:
     * ������[�G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����&quot;�A�V���O���N�I�[�e�[�V����'�A�G���}�[�N\�B]
     *
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage010() {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 0) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage010 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }

        return '[MESSAGE010] �G�X�P�[�v�����̊m�F�B�_�u���N�I�[�e�[�V����"�A�V���O���N�I�[�e�[�V����\'�A�G���}�[�N\\�B';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE011]�̕�������擾���܂��B
     *
     * No.11:
     * ������[�~]
     *
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage011() {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 0) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage011 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }

        return '[MESSAGE011] �~';
    }

    /**
     * ���b�Z�[�W��`ID[Sample2]�A�L�[[MESSAGE012]�̕�������擾���܂��B
     *
     * No.12:
     * ������[���s[\n]�̎����B]
     *
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMessage012() {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 0) {
            throw new Exception('[ArgumentException]: Sample2Message.getMessage012 �̃p�����[�^��[0]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }

        return '[MESSAGE012] ���s[\n]�̎����B';
    }
}
?>
