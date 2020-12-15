package com.academy.lesson04.HomeWorkOOPQvests;

import java.sql.Array;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//1) ������� ����� CustomDate, ������� ����� ��������� ����:
//		- ����
//		- �����
//		- ���
//
//	��� ���� ������ ���� �������� ������������� private
//		- ����������� ������ � ����� ����� ������ set � get
//		- ���������� public ����� getFormattedDate(); ������� ������ ���� � ����������������� ����, ����. 21.12.2018 (��� 21.12.2018 �������)
//		-* ����������� ����������� ����� validate(int day, int month, int year), ������� ��������� ������������� ��������� ����
//		� ������� true/false (��������� ���������� ���)
//
//		-* ������������ �������� validate, ��� ������� �������� ���� ������� set, � ������ ������ �� ��������� ���������,
//			� ������� ��������� �� ������ �� �������
//		-** ����������� ����������� ����� dayOfWeek(int day, int month, int year), ������� ��������� ������ ���� � ��������� ���� ������. ���� ����� ����� ����������, ����. ���
//			������������ - 0
//			�������� - 1
//			� �.�.
//		- ��������� ������ �������:
//			getFormattedDate()
//			validate()
//			dayOfWeek()
public class CustomDateMain {
    public static void main(String[] args) throws ParseException {
        Scanner date = new Scanner(System.in);
        System.out.print("������� ����: ");
        int day = date.nextInt();
        System.out.print("������� �����: ");
        int month = date.nextInt();
        System.out.print("������� ���: ");
        int year = date.nextInt();

        CustomDate dayAndWeek = new CustomDate(day, month, year);

        System.out.println(dayAndWeek.getFormattedDate());
        System.out.println("****************************************");
        System.out.println(CustomDate.dayOfWeek(day, month, year));
        System.out.println("*******************************************");
        System.out.print("Day: ");
        System.out.println(dayAndWeek.getDay());
        System.out.print("Month: ");
        System.out.println(dayAndWeek.getMonth());
        System.out.print("Year: ");
        System.out.println(dayAndWeek.getYear());



    }
    }

