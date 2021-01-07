package com.academy.Lesson03.HomeworkRegularExpressions;
//     3) ����. ����� ������ �������������� ����� �������: YYYY/MM/DD HH:MM(:SS)
//
//        �) 	��������� ���� �� ������������ �������:
//        �������:
//        2012/09/18 12:10 � true
//        2013/09/09 09:09 � true
//        2013/9/09 09:09 � false
//
//        �)* ��������� ������������� ���� �� �������� ����� 1000 � 2012 �����. ������� ����� ���� �������.
//        (�������� ������: � ������ ������ 30 ����.)
//        �������:
//        2012/09/18 12:10 � true
//        2013/09/09 09:09 � false  // (����� 2012)

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Task03 {
    public static void main(String[] args) throws ParseException {
        System.out.println();
        System.out.println("********** Task - 3.1 and 3.2 **********");
        System.out.println();

        String regex3A = "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}\\(:\\d{2}\\)"; //��������� ��� �������� ������� YYYY/MM/DD HH:MM(:SS)
        String regex3B = ".*((1\\d{3})|(200\\d)|(201(0|1|2))).*";// �������� ��� ���� 1000 - 2012
        Pattern pattern3A = Pattern.compile(regex3A);
        Pattern pattern3B = Pattern.compile(regex3B);
        int size = 0; //����������� ����������� ��������� �������� � ���
        Object[] options = new Object[]{"������ ���� ������ ���� � �������", "���������� ��������� ����� �������� ��� � �������"}; //�������� ������ � ����
        int n = JOptionPane.showOptionDialog(null, //����� ���� ������� ��� ������ ����� ���� ��� ���������
                "����� ���� �� ������?",
                "����� ������� ���� � �������",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);
        if(n == 0) {//���� ������ ������ �1 - "������ ���� ������ ���� � �������"
            //����� ����������� ���� ��� ����� ���� � ������� ������������
            String dateAndTime = JOptionPane.showInputDialog("������� ���� ������ ���� �������� 23.06.1988 15:36:45: ");
            System.out.print("�� ����� " + dateAndTime); // ����� � ������� ��������� ���� � �������
            System.out.println(" <= ������������ ������� ������� (YYYY/MM/DD HH:MM(:SS)) => " // ����� � ������� �������� ������� ���� � �������
                    + pattern3A.matcher(dateAndTime).matches()
                    + " <= �������� �� 1000 - 2012 ��� => "
                    + pattern3B.matcher(dateAndTime).matches());
        } else {//���� ������ ������ ������ - "���������� ��������� ����� �������� ��� � �������"
            try {
                //����� ����������� ���� ������ ����������� ����������� ������ �������� � ���
                size = Integer.parseInt(JOptionPane.showInputDialog("������� ����������� ����������� ��������"));
            } catch (NumberFormatException e) {
                System.out.println("�� ����� �� �����!!!");//���������, ���� ������������ ���� �� ����� � ���������� ���� + ���������� ������
            }
            for(int i = 0; i < size; i++){//���� ������������ ���
                String dateFormat = dateFormat(); //����� ������, ��� ���������� ������������ ��������� ���� � ��������� �������
                boolean insert3A = pattern3A.matcher(dateFormat).matches(); //�������� �� ������������ ������� YYYY/MM/DD HH:MM(:SS)
                boolean insert3B = pattern3B.matcher(dateFormat).matches(); // �������� �� ������������ ���������� ��� ����� 1000 ����� � 2012 �����
                String arrow3A = ""; // ����������� ��� ����������� ������� ������ ��������  (��������� ����������)
                String arrow3B = ""; // ����, ��� ������� ������ ��� ��� ����� 1000 ����� � 2012 �����
                if(insert3A) arrow3A = " <="; //
                if(insert3B){
                    arrow3A = "";
                    arrow3B = " <= �������� �� 1000 - 2012 ��� => " + insert3B; // ������������ ������ ��� ������������ ���� ����� 1000 ����� � 2012 �����
                }
                System.out.println(dateFormat + " => " + insert3A + arrow3A + arrow3B); // ���������� ����� �������������� ��������
//            System.out.println(dateFormat() + " => " + pattern3A.matcher(dateFormat()).matches() + arrow3A + arrow3B + " - 2"); // � ���� ������� ������-�� �� ��������!!!
            }
        }
    }

    // ����� ��� �������� ���������� ������� ��������� ���� ��� ������� �3
    private static String dateFormat() throws ParseException {
        //������ �������� ��� � ������� ����������� ����������� � ������� ��� ����������� ���������� ������
        String[] formatDate = {"dd.MM.yyyy hh:mm:ss", "MM-dd-yyyy hh:mm:ss", "dd-MM-yyyy hh:mm:ss", "dd/MM/yyyy hh:mm:ss", "dd.MM.yyyy hh:mm:ss",
                "dd/MM/yyyy hh:mm:ss", "dd/MM/yyyy hh:mm:ss", "yyyy-MM-dd hh:mm:ss", "dd-MM-yyyy hh.mm.ss", "dd/MM/yyyy hh.mm.ss",
                "dd/MM/yyyy hh:mm:ss", "yyyy-MM-dd hh:mm:ss", "dd/MM/yyyy hh:mm:ss", "dd-MM-yyyy hh:mm:ss", "dd.MM.yyyy hh:mm:ss",
                "yyyy-MM-dd hh:mm:ss", "dd-MM-yyyy hh:mm:ss", "dd.MM.yyyy hh.mm.ss", "yyyy-MM-dd hh:mm:ss", "yyyy-MM-dd hh:mm:ss",
                "yyyy-MM-dd hh.mm.ss", "dd.MM.yyyy hh:mm:ss", "yyyy-MM-dd hh:mm:ss", "dd.MM.yyyy hh,mm,ss", "yyyy-MM-dd hh.mm.ss",
                "yyyy/MM/dd hh:mm(:ss)", "yyyy/M/dd hh:mm(:ss)", "yyyy/MM/d hh:mm(:ss)", "yyyy/M/d hh:mm(:ss)", "yyy/MM/dd hh:mm(:ss)"};
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss"); //�������� ������ ��� ������������ ���� �� ����
        SimpleDateFormat format = new SimpleDateFormat(formatDate[(int) (Math.random() * 30)]); // ������, �������� �������� �� ������� (����� 29 �����)
        int day = (int) (Math.random() * 1000000); // ��������� ����������� ���� � ����������� �� 1 �������� (�� 0 �� 2 739 ����)
        int seconds = (int) (Math.random() * 86400); // ��������� ����������� ������ (� ������ 86400 ������)
        // ������������ ������ �� ��������� ���� � ������� ��� ��������� ������� ���� (�������� - 568945 ����. 01 �����. 01 ���  � 00 �����: 00 �����: 64800 ������)
        String dayDate = day + ".01.0001 00:00:" + seconds;
        Date dateParse = date.parse(dayDate); // ������������ ���� � ������ Date (����� ��� � ������� ��������� � ����� ��� ����)
        return format.format(dateParse); //���������� ������������������ ��������� ���� � ����������� ������
    }
}
