package com.academy.lesson5.oop.Date;

import java.text.ParseException;

//a) ������� ������������ "������ ����" (DateFormat), � ������� ���������� ��������� ��������, ��������:
//		- 	RU 			������						DD.MM.YYYY					24.01.2011
//		- 	USA 		���							MM-DD-YYYY					01-24-2011
//		-	ENG			������������� ����������	DD-MM-YYYY					24-01-2011
//		- 	UK			��������������				DD/MM/YYYY					24/01/2011
//		-* 	CUSTOM		����������������			DD <�������� ������> YYYY�	25 ������ 2011�
//
//	b) �������������� ����� CustomDate �� ����������� �������, ��� ����������� ����������� ���� � �������� �������:
//		- public String getFormattedDate() {} // ���������� ���� � ������� �� ��������� - RU: 24.01.2011
//		- public String getFormattedDate((DateFormat format){} // ���������� ���� � �������� ������� �� ������� �� ������� �)

public class CustomDateMain {
    public static void main(String[] args) throws ParseException {

        CustomDate1 date = new CustomDate1(31, 12, 2020);

        System.out.println("***** date ******");
        System.out.println(date);

        System.out.println("****** date.getFormattedDate() ******** ");
        System.out.println(date.getFormattedDate());
        System.out.println();

        System.out.println("****** date.getFormattedDate(DateFormat.RU) **********");
        System.out.println(date.getFormattedDate(DateFormat.RU));

        System.out.println("****** date.getFormattedDate(DateFormat.ENG) **********");
        System.out.println(date.getFormattedDate(DateFormat.ENG));

        System.out.println("****** date.getFormattedDate(DateFormat.UK) **********");
        System.out.println(date.getFormattedDate(DateFormat.UK));

        System.out.println("****** date.getFormattedDate(DateFormat.USA) **********");
        System.out.println(date.getFormattedDate(DateFormat.USA));

        System.out.println("****** date.getFormattedDate(DateFormat.CUSTOM) **********");
        System.out.println(date.getFormattedDate(DateFormat.CUSTOM));


    }
}
