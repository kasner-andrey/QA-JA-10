package com.academy.Lesson10Error.HomeWorksError;
//1)
//	a) ������� ����� IllegalDateException, ������� ��������
//		����������� ������ RuntimeException.
//
//	b) �������������� ����� CustomDate, ������� � �����������
//		������������ ���������� IllegalDateException ���
//		������� ������� ������������ (�� ������������ ����)
//
//	c)  �������������� ������ ������������ �� ���������� ������:
//		- new CustomDate(1, 1, 2012);
//		- new CustomDate(17, 2, 2019);
//		- new CustomDate(29, 2, 2020);
//		- new CustomDate(31, 1, 1999);
//		- new CustomDate(13, 6, 1681);
//
//
//		�������������� ������ ������������ �� ���������� ������, �.�.
//			������� ������������ ����������:
//
//		- new CustomDate(-1, 1, 2012); 	// ������������� ����
//		- new CustomDate(31, 2, 2019); 	// ������� �������� ��� ���
//		- new CustomDate(29, 2, 2019); 	// �� ���������� ���
//		- new CustomDate(31, 13, 1999); // 13 ������ �� ����������
//		- new CustomDate(0, 06, 1681); 	// �������� ��� �� ����������

//a) ������� ����� IllegalTimeException, ������� ��������
//		����������� ������ RuntimeException.
//
//	b) �������������� ����� CustomDateTime, ������� � �����������
//		������������ ���������� IllegalTimeException ���
//		������� ������� ������������ (�� ������������ �����)
//
//	c)  �������������� ������ ������������ �� ���������� ������:
//		- new CustomDateTime(..., 12, 12, 12,);
//		- new CustomDateTime(..., 23, 1, 1);
//		- new CustomDateTime(..., 0, 0, 0);
//		- new CustomDateTime(..., 23, 59, 59);
//
//
//		�������������� ������ ������������ �� ���������� ������, �.�.
//			������� ������������ ����������:
//
//		- new CustomDateTime(..., -12, 12, 12); 	// ������������� ������ �� ����-��
//		- new CustomDateTime(..., 23, 1, 60); 		// ������� �������� ��� �������
//		- new CustomDateTime(..., 24, 0, 0); 		// ������� �������� ��� ����
//		- new CustomDateTime(..., 23, 60, 0); 		// ������� �������� ��� ������

import javax.swing.*;

public class ErrorDateAndTimeMain {
    private static int day = 1;
    private static int month = 1;
    private static int year = 1999;
    private static int hour = 0;
    private static int minute = 0;
    private static int second = 0;

    public static void main(String[] args) {
        ErrorDateAndTimeMain frame = new ErrorDateAndTimeMain();
        frame.frameDateOrTime(0);
        CustomDateError date = new CustomDateError();
        try {
            date = new CustomDateError(day, month, year);
        } catch (IllegalDateException e) {
            frame.errorMess(day + "." + month + "." + year + " - " + e);
        }
        try {
            date.setYear(year);
        } catch (IllegalDateException e) {
            frame.errorMess("setYear: " + year + " - " + e);
        }
        try {
            date.setMonth(month);
        } catch (IllegalDateException e) {
            frame.errorMess("setMonth: " + month + " - " + e);
        }
        try {
            date.setDay(day);
        } catch (IllegalDateException e) {
            frame.errorMess("setDay: " + day + " - " + e);
        }

        JOptionPane.showMessageDialog(null,
                "�������� ������ ����: "  + date,
                "����",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("�������� ������ ����: "  + date);

        System.out.println("****** �������� ������� ********");

        frame.frameDateOrTime(1);
        CustomDateTimeError time = new CustomDateTimeError();
        try {
            time = new CustomDateTimeError(hour, minute, second);
        } catch (IllegalTimeException e) {
            frame.errorMess(hour + ":" + minute + ":" + second + " - " + e);
        }
        try {
            time.setHour(hour);
        } catch (IllegalTimeException e) {
            frame.errorMess("setHour: " + hour + " - " + e);
        }
        try {
            time.setMinute(minute);
        } catch (IllegalTimeException e) {
            frame.errorMess("setMinute: " + minute + " - " + e);
        }
        try {
            time.setSecond(second);
        } catch (IllegalTimeException e) {
            frame.errorMess("setSecond: " + second + " - " + e);
        }

        JOptionPane.showMessageDialog(null,
                "�������� ������ ���� � �����: " + time,
                "���� � �����",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("�������� ������ ���� � �����: " + time);
  }

  private void errorMess(String message){
      JOptionPane.showMessageDialog(null,
              message,
              "������ � ���� ��� �������",
              JOptionPane.ERROR_MESSAGE);
      System.out.println(message);
  }

  private void frameDateOrTime(int i) {
      Object[] options;
      String message;
      String title;
        if (i == 0){
            options = new Object[]{"������ ���� ����", "������� �������� ����", "������� �� �������� ����"};
            message = "����� ���� �� ������?";
            title = "����� ����";
        }
        else {
            options = new Object[]{"������ ���� �����", "������� �������� �����", "������� �� �������� �����"};
            message = "����� ����� �� ������?";
            title = "����� �������";
        }

        int n = JOptionPane.showOptionDialog(null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if(n == 0) ownDate(i);
        else if(n == 1) validDate(i);
        else notValidDate(i);
    }
    private void ownDate(int i){
        String message;
        String title;
        String oneJOptionPane;
        String twoJOptionPane;
        String threeIOptionPane;
        String delimiter;
        if( i == 0){
            oneJOptionPane = "����";
            twoJOptionPane = "�����";
            threeIOptionPane = "���";
            delimiter = ".";

        } else {
            oneJOptionPane = "���";
            twoJOptionPane = "������";
            threeIOptionPane = "�������";
            delimiter = ":";
        }
        String dayOrHour = JOptionPane.showInputDialog("������� " + oneJOptionPane);
        if (dayOrHour.length() > 1) dayOrHour = dayOrHour.substring(0, 2);
        String monthOrMinute = JOptionPane.showInputDialog("������� " + twoJOptionPane);
        if (monthOrMinute.length() > 1) monthOrMinute = monthOrMinute.substring(0, 2);
        String yearOrSecond = JOptionPane.showInputDialog("������� " + threeIOptionPane);
        if (yearOrSecond.length() > 4) yearOrSecond = yearOrSecond.substring(0, 4);
        if (i == 0) {
            message = "�� ����� ����: " + dayOrHour + delimiter + monthOrMinute + delimiter + yearOrSecond;
            title = "����";
        } else {
            message = "�� ����� �����: " + dayOrHour + delimiter + monthOrMinute + delimiter + yearOrSecond;
            title = "�����";
        }
        JOptionPane.showMessageDialog(null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(message);
        setDateOrTime(dayOrHour + delimiter + monthOrMinute + delimiter + yearOrSecond, i);
    }
    private void validDate(int i){
        String[]options;
        String title;
        String message;
        String own;
        if(i == 0){
            options = new String[]{"01.01.2012", "17.02.2019", "29.02.2020", "31.01.1999", "13.06.1681", "23.02.1985"};
            title = "����� �������� ����";
            message = "�������� �������� ����";
            own = "�� ������� �������� ����: ";
        } else {
            options = new String[]{"12:12:12", "23:1:1", "0:0:0", "23:59:59", "15:06:45", "21:35:35"};
            title = "����� ��������� �������";
            message = "�������� �������� �����";
            own = "�� ������� �������� �����: ";
        }
        String dateOrTime = (String)JOptionPane.showInputDialog(null,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[2]);
        System.out.println(own + dateOrTime);
         setDateOrTime(dateOrTime, i);
    }
    private void notValidDate(int i){
        String[]options;
        String title;
        String message;
        String own;
        if(i == 0){
            options = new String[]{"-1.01.2012", "31.02.2019", "29.02.2019", "31.13.1999", "0.06.1681"};
            title = "����� �� �������� ����";
            message = "�������� �� �������� ����";
            own = "�� ������� �� �������� ����: ";
        } else {
            options = new String[]{"-12:12:12", "23:1:60", "24:0:0", "23:60:0", "24:60:60"};
            title = "����� �� ��������� �������";
            message = "�������� �� �������� �����";
            own = "�� ������� �� �������� �����: ";
        }
        String dateOrTime = (String)JOptionPane.showInputDialog(null,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[2]);
        System.out.println(own + dateOrTime);
        setDateOrTime(dateOrTime, i);
    }
    private static void setDateOrTime(String dateOrTime, int i){
        if (i == 0){
            try {
                String[] number = dateOrTime.split("\\.");
                day = Integer.parseInt(number[0]);
                month = Integer.parseInt(number[1]);
                year = Integer.parseInt(number[2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "�� ����� �����-�� ����!!!",
                        "������ � ����",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                String[] number = dateOrTime.split(":");
                hour = Integer.parseInt(number[0]);
                minute = Integer.parseInt(number[1]);
                second = Integer.parseInt(number[2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "�� ����� �����-�� ����!!!",
                        "������ �� �������",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
