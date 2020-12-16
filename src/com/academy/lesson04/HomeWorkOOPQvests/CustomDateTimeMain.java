package com.academy.lesson04.HomeWorkOOPQvests;
//����������� ����� CustomDateTime, ������� ����������� �� ������ CustomDate.
//		���� (��� ���� private):
//			- hour (����)
//			- minute (������)
//			- second (�������)
//
//		������������:
//			- CustomDateTime() - �� ���������
//			- CustomDateTime(int year, int month, int day, int hour, int minute, int second) �� ����� �����������
//			- CustomDateTime(CustomDateTime dateTime)�����������
//
//		������:
//			- set (��� ������� ����)
//			- get (��� ������� ����)
//
//			getFormattedDate() (�������������� �� �������� ������)
//				������� ���������� ����� � ����: 25.01.2017 15:05:35
//
//			getFormattedDate(boolean isTimeFormat12)
//				������� ���������� ����� � ���� � ����������� �� ����� isTimeFormat12:
//				25.01.2017 3:05 p.m.  // isTimeFormat12 is true
//				25.01.2017 15:05  	  // isTimeFormat12 is false

//		�������������� ������:
//			toString // ���������� ���� � ����� 25.01.2017 15:05:35
//			equals
//			hashCode
//
//		- ����������� ����� validate(), ������� ��������� ������������� ���������� �������
//
//		- ������������ ����� validate(...)
//			��� ������� ������� ���������������� ����� � ������� ������������
//			��� ��� ������� �������������� ���� � ������� ������� set
//
//		- ����������� ������
//			nextSecond();
//			nextMinute();
//			nextHour();
//			������� ����������� �� ������� �������� �������, ������ � ���� ��������������, ��� ��� ���� ���-�� ����� �����������
//			24, �� ������ ����������� �� ������� �������� ���� day �� �������� ������
//
//		-* ����������� ����� addSeconds(int seconds), ������� ��������� ��������� ���-�� ������ � ������� ����

import java.text.ParseException;

public class CustomDateTimeMain {
    public static void main(String[] args) throws ParseException {
        System.out.println("***************** nextSecond CustomDateTime *******************");
        CustomDateTime date = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println(date);
        date.nextSecond();
        System.out.println();

        System.out.println("******************** toString CustomDateTime *************************");
        System.out.println(date);
        System.out.println();

        System.out.println("******************** addSeconds CustomDateTime *************************");
        CustomDateTime date2 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        date2.addSeconds(400000);
        System.out.println(date2);
        System.out.println();

        System.out.println("**************** getFormattedDate(boolean isTimeFormat12) *****************************");
        System.out.println(date2.getFormattedDate(true));
        System.out.println();

        System.out.println("********************** getFormattedDate() CustomDateTimeExt ***************************");
        CustomDateTimeExt date3 = new CustomDateTimeExt(31, 12, 2020, 23, 59, 59, 15);
        System.out.println(date3.getFormattedDate());
        System.out.println();

        System.out.println("******************** toString CustomDateTimeExt *************************");
        System.out.println(date3);






    }
}
