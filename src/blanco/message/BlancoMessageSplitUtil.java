/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.message;

import java.util.List;

/**
 * blancoMessage�̃��b�Z�[�W�𕪊����邽�߂̃��[�e�B���e�B�ł��B
 * 
 * @author ToshikiIga
 */
class BlancoMessageSplitUtil {
    /**
     * ���b�Z�[�W��u������������ɕ������܂��B
     * 
     * @param listSourceString
     *            ���͂ƂȂ镶����B�����̉ߒ��œ��e���ς��܂��B������ɂ͕�������Ă��܂��B
     * @return ���Ԃ܂Œu�������񂪑��݂������B�ЂƂ����������ꍇ�ɂ� -1���߂�܂��B
     */
    @SuppressWarnings("unchecked")
    public int split(final List listSourceString) {
        for (int number = 0;; number++) {
            final boolean isFound = splitByReplaceString(listSourceString,
                    number);
            if (isFound == false) {
                // ���݂̏����ԍ�-1��߂��܂��B
                // �P�����u�������񂪔�������Ă��Ȃ��ꍇ�ɂ� -1��߂��܂��B
                return number - 1;
            }
        }
    }

    /**
     * �w��ԍ��ɂ��u������������Ƃɕ�����𕪊����܂��B
     * 
     * ����listSourceString�̓��͕�������A{0}, {1}�Ƃ����w��ԍ��ɂ��u��������
     * �����������ʒu�ŕ������AlistSourceString�ɖ߂��܂��B
     * �u���������Integer�^�̐��l�Ƃ���listSourceString�Ɋi�[����܂��B
     * 
     * �Ⴆ�΁A���͂Ƃ���listSourceString.index(0)�Ɂu�u��������{0}�����݂��܂��v �Ƃ��������񂪊i�[����Ă����ꍇ�A<br>
     * listSourceString.index(0) = "�u��������"<br>
     * listSourceString.index(1) = new Integer(0)<br>
     * listSourceString.index(2) = "�����݂��܂�"<br>
     * �̂悤�ɕ�������܂��B
     * 
     * @param listSourceString
     *            ���͂ƂȂ镶����B
     * @param replaceNumber
     *            �u��������̔ԍ��B0�I���W���Ŏw�肵�܂��B
     * @return �u���������������ǂ����̃t���O�B�u�����ꂽ�ꍇ�ɂ�true���A��x���u������Ȃ������ꍇ�ɂ� false���߂�܂��B
     */
    @SuppressWarnings("unchecked")
    private boolean splitByReplaceString(final List listSourceString,
            final int replaceNumber) {
        boolean isFound = false;
        for (int index = 0; index < listSourceString.size(); index++) {
            final Object objLook = listSourceString.get(index);
            if (objLook instanceof Integer) {
                continue;
            }

            final String input = (String) listSourceString.get(index);

            // �u���̍ۂɗ��p���镶����B
            final String replaceNumberString = "{" + replaceNumber + "}";

            final int search = input.indexOf(replaceNumberString);
            if (search >= 0) {
                listSourceString.remove(index);
                listSourceString.add(index, input.substring(0, search));
                listSourceString.add(index + 1, new Integer(replaceNumber));
                listSourceString.add(index + 2, input.substring(search
                        + replaceNumberString.length()));
                isFound = true;
            }
        }

        // �s�v�Ȓ���0�̕���������X�g���珜�����܂��B
        removeUnnecessaryString(listSourceString);

        return isFound;
    }

    /**
     * ���s�����Ƃɕ�����𕪊����܂��B
     * 
     * ����listSourceString�̓��͕���������s(\n)�����������ʒu�ŕ����� listSourceString�ɖ߂��܂��B
     * 
     * �Ⴆ�΁A���͂Ƃ���listSourceString.index(0)�Ɂu���s��\n���݂��܂��v �Ƃ��������񂪊i�[����Ă����ꍇ�A<br>
     * listSourceString.index(0) = "���s��"<br>
     * listSourceString.index(1) = "\n"<br>
     * listSourceString.index(2) = "���݂��܂�"<br>
     * �̂悤�ɕ�������܂��B
     * 
     * @param listSourceString
     *            ���͂ƂȂ镶����B
     */
    @SuppressWarnings("unchecked")
    public void splitByNewLineChar(final List listSourceString) {
        for (int index = 0; index < listSourceString.size(); index++) {
            final Object objLook = listSourceString.get(index);
            if (objLook instanceof Integer) {
                continue;
            }

            final String input = (String) listSourceString.get(index);

            // �u���̍ۂɗ��p���镶����B
            final String newLine = "\n";

            if (newLine.equals(input)) {
                continue;
            }

            final int search = input.indexOf(newLine);
            if (search >= 0) {
                listSourceString.remove(index);
                listSourceString.add(index, input.substring(0, search));
                listSourceString.add(index + 1, newLine);
                listSourceString.add(index + 2, input.substring(search
                        + newLine.length()));
            }
        }

        // �s�v�Ȓ���0�̕���������X�g���珜�����܂��B
        removeUnnecessaryString(listSourceString);
    }

    /**
     * �s�v�Ȓ���0�̕���������X�g���珜�����܂��B
     * 
     * @param listSourceString
     */
    @SuppressWarnings("unchecked")
    private void removeUnnecessaryString(final List listSourceString) {
        for (int index = listSourceString.size() - 1; index >= 0; index--) {
            final Object objLook = listSourceString.get(index);
            if (objLook instanceof Integer) {
                continue;
            }

            final String input = (String) listSourceString.get(index);
            if (input.length() == 0) {
                listSourceString.remove(index);
            }
        }
    }
}
