package com.academy.Lesson03.HomeworkRegularExpressions;
//     1) �������� � �������������� ���������� ���������, ������� ���������, ��� ������ ���������� � ��������� ����� � ������������� ������.
//
//        � ���� �������� ������, => false
//        � ���� ��� �����.		=> false
//        ����� � ����� ��������	=> false
//        ������� ����.			=> true

import java.util.regex.Pattern;

public class Task01 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 1 **********");
        System.out.println();

        String regex1 = "[�-�].*\\.";
        Pattern pattern1 = Pattern.compile(regex1);
        String str1 = "� ���� �������� ������,";
        String str2 = "� ���� ��� �����.";
        String str3 = "����� � ����� ��������";
        String str4 = "������� ����.";

        System.out.println(
                str1 + " => " + pattern1.matcher(str1).matches()
                        + "\n" + str2 + "       => "   + pattern1.matcher(str2).matches()
                        + "\n" + str3 + "  => "   + pattern1.matcher(str3).matches()
                        + "\n" + str4 + "           => "   + pattern1.matcher(str4).matches()
        );
    }
}
