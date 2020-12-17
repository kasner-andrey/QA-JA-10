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

//�������������� ������ Date, DateTime � DateTimeExt:
//        - ��� ������������
//        - ����� toString()
//        - ����� equals()
//        - ��� ������ next...()
//        - validate()

import com.academy.lesson5.oop.Date.CustomDate1;
import com.academy.lesson5.oop.Date.CustomDateTime1;
import com.academy.lesson5.oop.Date.CustomDateTimeExt1;

import java.text.ParseException;

public class CustomDateTimeMain {
    public static void main(String[] args) throws ParseException {
        System.out.println("***************** nextSecond() CustomDateTime *******************");
        CustomDateTime date = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date);
        date.nextSecond();
        System.out.println(date);
        System.out.println();

        System.out.println("***************** nextMinute() CustomDateTime *******************");
        CustomDateTime date2 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date2);
        date2.nextMinute();
        System.out.println(date2);
        System.out.println();

        System.out.println("***************** nextHour() CustomDateTime *******************");
        CustomDateTime date3 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date3);
        date3.nextHour();
        System.out.println(date3);
        System.out.println();

        System.out.println("***************** addSeconds() CustomDateTime *************************");
        CustomDateTime date4 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date4);
        date4.addSeconds(965456589);
        System.out.println(date4);
        System.out.println();

        System.out.println("***************** getFormattedDate(boolean isTimeFormat12) *****************************");
        System.out.println(date4.getFormattedDate(true));
        System.out.println();

        System.out.println("***************** getFormattedDate() CustomDateTimeExt ***************************");
        CustomDateTimeExt date5 = new CustomDateTimeExt(31, 12, 2020, 23, 59, 59, 15);
        System.out.println(date5.getFormattedDate());
        System.out.println("toString: " + date5);
        System.out.println();

        System.out.println("***************** equals() CustomDateTimeExt *************************");
        CustomDateTimeExt date6 = new CustomDateTimeExt(31, 12, 2020, 23, 59, 59, 15);
        CustomDateTimeExt date12 = new CustomDateTimeExt(31, 12, 2020, 23, 59, 59, 765);
        System.out.println("equals() true: " + date5.equals(date6));
        System.out.println("equals() false: " + date12.equals(date6));


        System.out.println("***************** equals() CustomDateTime *************************");
        CustomDateTime date7 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        CustomDateTime date8 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println("equals() true: " + date7.equals(date8));
        System.out.println("equals() false: " + date8.equals(date4));

        System.out.println("***************** equals() CustomDate *************************");
        CustomDate date9 = new CustomDate(31, 12, 2020);
        CustomDate date10 = new CustomDate(31, 12, 2020);
        CustomDate date11 = new CustomDate(2, 9, 1998);
        System.out.println("equals() true: " + date9.equals(date10));
        System.out.println("equals() false: " + date9.equals(date11));

        System.out.println("***************** Constructor �� ��������� *************************");
        CustomDateTimeExt date13 = new CustomDateTimeExt();
        System.out.println("CustomDateTimeExt: " + date13);
        CustomDateTime date14 = new CustomDateTime();
        System.out.println("CustomDateTime: " + date14);
        CustomDate date15 = new CustomDate();
        System.out.println("CustomDate: " + date15);













    }
}
