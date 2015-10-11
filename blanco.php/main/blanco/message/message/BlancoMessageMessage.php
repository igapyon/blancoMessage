<?php
/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
/*. DOC <@package blanco.message.message;>.*/

/*. require_module 'standard'; .*/;

/**
 * blancoMessage�������I�ɗ��p���郁�b�Z�[�W�N���X�ł��B
 */
class BlancoMessageMessage {
    /**
     * ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
     *
     * No.2:
     */
    const MBMSGI01 = '[MBMSGI01] ���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B';

    /**
     * �L�[�l: KEY_MBMSGI01
     *
     * No.2:
     */
    const KEY_MBMSGI01 = 'MBMSGI01';

    /**
     * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
     *
     * No.3:
     */
    const MBMSGI02 = '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B';

    /**
     * �L�[�l: KEY_MBMSGI02
     *
     * No.3:
     */
    const KEY_MBMSGI02 = 'MBMSGI02';

    /**
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
     *
     * No.4:
     */
    const MBMSGI03 = '[MBMSGI03] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B';

    /**
     * �L�[�l: KEY_MBMSGI03
     *
     * No.4:
     */
    const KEY_MBMSGI03 = 'MBMSGI03';

    /**
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
     *
     * No.5:
     */
    const MBMSGI04 = '[MBMSGI04] ���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B';

    /**
     * �L�[�l: KEY_MBMSGI04
     *
     * No.5:
     */
    const KEY_MBMSGI04 = 'MBMSGI04';

    /**
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * No.8:
     */
    const MBMSGA01 = '[MBMSGA01] ���^�f�B���N�g��[{0}]�����݂��܂���B';

    /**
     * �L�[�l: KEY_MBMSGA01
     *
     * No.8:
     */
    const KEY_MBMSGA01 = 'MBMSGA01';

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI01]�̕�������擾���܂��B
     *
     * No.2:
     * ������[���b�Z�[�W��`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMbmsgi01(/*.string.*/ $arg0) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi01 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi01 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMbmsgi01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MBMSGI01] ���b�Z�[�W��`ID[' . $arg0 . ']�̃p�b�P�[�W�����w�肳��Ă��܂���B';
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI02]�̕�������擾���܂��B
     *
     * No.3:
     * ������[�T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[{0}]���w�肳��܂����B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMbmsgi02(/*.string.*/ $arg0) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi02 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi02 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMbmsgi02]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MBMSGI02] �T�|�[�g���Ȃ��o�̓v���O���~���O���ꏈ���n[' . $arg0 . ']���w�肳��܂����B';
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI03]�̕�������擾���܂��B
     *
     * No.4:
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMbmsgi03(/*.string.*/ $arg0, /*.string.*/ $arg1) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 2) {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi03 �̃p�����[�^��[2]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi03 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi03 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMbmsgi03]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMbmsgi03]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MBMSGI03] ���b�Z�[�W��`ID[' . $arg0 . ']�ɂ����āA�L�[[' . $arg1 . ']��2��ȏ゠����܂����B�����L�[��2��ȏ�w�肷�邱�Ƃ͂ł��܂���B';
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGI04]�̕�������擾���܂��B
     *
     * No.5:
     * ������[���b�Z�[�W��`ID[{0}]�ɂ����āA�L�[[{1}]�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{2}]�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[{3}]�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @param string $arg1 �u��������{1}�̒l�B
     * @param string $arg2 �u��������{2}�̒l�B
     * @param string $arg3 �u��������{3}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMbmsgi04(/*.string.*/ $arg0, /*.string.*/ $arg1, /*.string.*/ $arg2, /*.string.*/ $arg3) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 4) {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 �̃p�����[�^��[4]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }
        if (gettype($arg1) !== 'string' && gettype($arg1) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��2�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg1) . ']�^���^�����܂����B');
        }
        if (gettype($arg2) !== 'string' && gettype($arg2) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��3�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg2) . ']�^���^�����܂����B');
        }
        if (gettype($arg3) !== 'string' && gettype($arg3) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsgi04 ��4�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg3) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMbmsgi04]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg1 === null) {
            throw new Exception('���\�b�h[getMbmsgi04]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg2 === null) {
            throw new Exception('���\�b�h[getMbmsgi04]�̃p�����[�^[arg2]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }
        if ($arg3 === null) {
            throw new Exception('���\�b�h[getMbmsgi04]�̃p�����[�^[arg3]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MBMSGI04] ���b�Z�[�W��`ID[' . $arg0 . ']�ɂ����āA�L�[[' . $arg1 . ']�̃��b�Z�[�W���s���ł��B���b�Z�[�W��`�Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' . $arg2 . ']�ƃ��\�[�X�o���h���Ƃ��Ĕ��f�����ꍇ�̒u��������̌�[' . $arg3 . ']�Ƃ��قȂ�܂��B�u��������̔ԍ��͔��ł��܂��Ă��܂��񂩁H�������t�H�[�}�b�g��`���Ă��������B';
    }

    /**
     * ���b�Z�[�W��`ID[BlancoMessage]�A�L�[[MBMSGA01]�̕�������擾���܂��B
     *
     * No.8:
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * @param string $arg0 �u��������{0}�̒l�B
     * @return string ���b�Z�[�W������B
     */
    public /*.string.*/ function getMbmsga01(/*.string.*/ $arg0) {
        /* �p�����[�^�̐��A�^�`�F�b�N���s���܂��B */
        if (func_num_args() !== 1) {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsga01 �̃p�����[�^��[1]�ł���K�v������܂��B���������ۂɂ�[' . func_num_args() .  ']�̃p�����[�^�𔺂��ČĂяo����܂����B');
        }
        if (gettype($arg0) !== 'string' && gettype($arg0) !== 'NULL') {
            throw new Exception('[ArgumentException]: BlancoMessageMessage.getMbmsga01 ��1�Ԗڂ̃p�����[�^��[string]�^�łȂ��Ă͂Ȃ�܂���B���������ۂɂ�[' . gettype($arg0) . ']�^���^�����܂����B');
        }

        if ($arg0 === null) {
            throw new Exception('���\�b�h[getMbmsga01]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B');
        }

        return '[MBMSGA01] ���^�f�B���N�g��[' . $arg0 . ']�����݂��܂���B';
    }
}
?>
