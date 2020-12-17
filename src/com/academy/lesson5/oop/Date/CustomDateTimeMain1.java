package com.academy.lesson5.oop.Date;
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

import com.academy.lesson04.HomeWorkOOPQvests.CustomDate;
import com.academy.lesson04.HomeWorkOOPQvests.CustomDateTime;
import com.academy.lesson04.HomeWorkOOPQvests.CustomDateTimeExt;

import java.text.ParseException;

public class CustomDateTimeMain1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("***************** nextSecond() CustomDateTime1 *******************");
        CustomDateTime1 date = new CustomDateTime1(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date);
        date.nextSecond();
        System.out.println(date);
        System.out.println();

        System.out.println("***************** nextMinute() CustomDateTime1 *******************");
        CustomDateTime1 date2 = new CustomDateTime1(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date2);
        date2.nextMinute();
        System.out.println(date2);
        System.out.println();

        System.out.println("***************** nextHour() CustomDateTime1 *******************");
        CustomDateTime1 date3 = new CustomDateTime1(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date3);
        date3.nextHour();
        System.out.println(date3);
        System.out.println();

        System.out.println("***************** addSeconds() CustomDateTime *************************");
        CustomDateTime1 date4 = new CustomDateTime1(31, 12, 2020, 23, 59, 59);
        System.out.println("toString: " + date4);
        date4.addSeconds(965456589);
        System.out.println(date4);
        System.out.println();

        System.out.println("***************** getFormattedDate(boolean isTimeFormat12) *****************************");
        System.out.println(date4.getFormattedDate(true));
        System.out.println();

        System.out.println("***************** getFormattedDate() CustomDateTimeExt ***************************");
        CustomDateTimeExt1 date5 = new CustomDateTimeExt1(31, 12, 2020, 23, 59, 59, 15);
        System.out.println(date5.getFormattedDate());
        System.out.println("toString: " + date5);
        System.out.println();

        System.out.println("***************** equals() CustomDateTimeExt *************************");
        CustomDateTimeExt1 date6 = new CustomDateTimeExt1(31, 12, 2020, 23, 59, 59, 15);
        CustomDateTimeExt1 date12 = new CustomDateTimeExt1(31, 12, 2020, 23, 59, 59, 765);
        System.out.println("equals() true: " + date5.equals(date6));
        System.out.println("equals() false: " + date12.equals(date6));


        System.out.println("***************** equals() CustomDateTime *************************");
        CustomDateTime1 date7 = new CustomDateTime1(31, 12, 2020, 23, 59, 59);
        CustomDateTime1 date8 = new CustomDateTime1(31, 12, 2020, 23, 59, 59);
        System.out.println("equals() true: " + date7.equals(date8));
        System.out.println("equals() false: " + date8.equals(date4));

        System.out.println("***************** equals() CustomDate *************************");
        CustomDate1 date9 = new CustomDate1(31, 12, 2020);
        CustomDate1 date10 = new CustomDate1(31, 12, 2020);
        CustomDate1 date11 = new CustomDate1(2, 9, 1998);
        System.out.println("equals() true: " + date9.equals(date10));
        System.out.println("equals() false: " + date9.equals(date11));

        System.out.println("***************** Constructor �� ��������� *************************");
        CustomDateTimeExt1 date13 = new CustomDateTimeExt1();
        System.out.println("CustomDateTimeExt1: " + date13);
        CustomDateTime1 date14 = new CustomDateTime1();
        System.out.println("CustomDateTime1: " + date14);
        CustomDate1 date15 = new CustomDate1();
        System.out.println("CustomDate1: " + date15);
















    }
}
