package com.academy.Lesson03.HomeworkRegularExpressions;
//     2) a) ������� ���������� ��������� ��� ������ �������������� ������  ������y ��������� �������:
//        - ����� ����������� ������ ��� �������
//        - ����������� ����� �� ����
//        - ����� ����������� ������ ���� ���� ��� ��� �����
//        - � ����� ������ ��������� �������, ������������ ������ �� ������: ��� ��� $
//
//        ������:
//        0.50��� 	=> true
//        0.5��� 		=> true
//        12,45��� 	=> true
//        15,45 ��� 	=> false
//        123$ 		=> true
//        123.$		=> false
//        123.00$		=> true
//        a12��� 		=> false
//        0.50���.	=> false
//        0.50 	=> false
//
//        b)  �������� ������� boolean testCurrencyFormat(String regexFormat);
//        - ������� ��������� ��������� �� �������� ���� ��������
//        - ����������  true, ���� ��� ����� ������ ���������, false - �����

import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 2.1 **********");
        System.out.println();

        String regex2 = "\\d+(.\\d+)?(���|���|\\$)";
        Pattern pattern2 = Pattern.compile(regex2);
        String str5 = "0.50���";
        String str6 = "0.5���";
        String str7 = "12,45���";
        String str8 = "15,45 ���";
        String str9 = "123$";
        String str10 = "123.$";
        String str11 = "123.00$";
        String str12 = "a12���";
        String str13 = "0.50���.";
        String str14 = "0.50";
        System.out.println(
                str5 + "    => " + pattern2.matcher(str5).matches()
                        + "\n" + str6 + "     => "   + pattern2.matcher(str6).matches()
                        + "\n" + str7 + "   => "   + pattern2.matcher(str7).matches()
                        + "\n" + str8 + "  => "   + pattern2.matcher(str8).matches()
                        + "\n" + str9 + "       => "   + pattern2.matcher(str9).matches()
                        + "\n" + str10 + "      => "   + pattern2.matcher(str10).matches()
                        + "\n" + str11 + "    => "   + pattern2.matcher(str11).matches()
                        + "\n" + str12 + "     => "   + pattern2.matcher(str12).matches()
                        + "\n" + str13 + "   => "   + pattern2.matcher(str13).matches()
                        + "\n" + str14 + "       => "   + pattern2.matcher(str14).matches()
        );

        System.out.println();
        System.out.println("********** Task - 2.2 **********");
        System.out.println();

        System.out.println("�������� ���������: \"" + regex2 + "\" - ������������� - " + testCurrencyFormat(regex2));
    }

    //  b)  �������� ������� boolean testCurrencyFormat(String regexFormat);
//        - ������� ��������� ��������� �� �������� ���� ��������
//        - ����������  true, ���� ��� ����� ������ ���������, false - �����
    private static boolean testCurrencyFormat(String regexFormat){//��������� ���������������� ���������
        Pattern pattern = Pattern.compile(regexFormat);//����������� ���������
        String[] str = {"0.50���", "0.5���", "12,45���", "15,45 ���", "123$", "123.$", "123.00$", "a12���", "0.50���.", "0.50"};//������, ������� �����������
        Boolean[] result = {true, true, true, false, true, false, true, false, false, false};// �������� ������ ������ ������� ������ ���� ��� �������� ����� � ������� ������
        int fal = 0;//����������� ������ � ���������������� ���������
        // ������ ��������� ������������ ��������� � ���������� �������
        for(int i = 0; i < str.length; i++) if(!pattern.matcher(str[i]).matches() == result[i]) fal++;//���� �� �����, ��������� ������
        return fal == 0;//������� true ���� ������ ������ ����������, � false ���� ���� ������
    }
}
