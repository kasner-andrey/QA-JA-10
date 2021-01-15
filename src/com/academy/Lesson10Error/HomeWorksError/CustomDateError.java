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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CustomDateError {

    private int day = 1;
    private int month = 1;
    private int year = 1999;

//Constructor
    public CustomDateError(int day, int month, int year) throws IllegalDateException {
        if(day < 1 || day > 31) throw new IllegalDateException("���� ������� �� ����� ������ 1 ��� ������ 31");
        else if(day > 30 && (month == 4 || month == 6 || month == 8 || month == 10) ) throw new IllegalDateException("���� ������ 30 � 4 ��� 6 ��� 8 ��� 10 ������");
        else if(month < 1 || month > 12) throw new IllegalDateException("����� ������� �� ����� ������ 1 ��� ������ 12");
        else if(day > 28 && month == 2 && year % 4 != 0) throw new IllegalDateException("�� ���������� ������� ����� 28 ����");
        else if(day > 29 && month == 2) throw new IllegalDateException("���������� ������� ����� 29 ����");
        else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public CustomDateError() {
    }

    public static boolean validate(int day, int month, int year) throws IllegalDateException{
        String date;
        if(day < 10 && month > 9) date = "0" + day + "." + month + "." + year;
        else if(month < 10 && day < 10) date = "0" + day + ".0" + month + "." + year;
        else if(month < 10) date = day + ".0" + month + "." + year;
        else date = day + "." + month + "." + year;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        boolean variant = true;
        try {
            formatDate.setLenient(false);
            Date date1 = formatDate.parse(date);
        } catch (Exception e) {
            System.out.println("CustomDate.validate: ������ � ����!");
            variant = false;
        }
        return  variant;
    }

    public String getFormattedDate() throws ParseException {
        //if(!flagValidation) return "CustomDate.getFormattedDate: �� ���������� ����.";
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
        String date = day + "." + month + "." + year;
        Date dateParse = formatDate.parse(date);
        String dateYear = formatDate.format(dateParse);
        String weekDay = formatWeek.format(dateParse);
        return dateYear + " " + weekDay;
    }

    public static String dayOfWeek(int day, int month, int year) throws ParseException {
        String date = day + "." + month + "." + year;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
        Date dateParse = formatDate.parse(date);
        return formatWeek.format(dateParse);
    }
//Getters

    public String getDay() throws ParseException {
        String date = day + "";
        SimpleDateFormat day = new SimpleDateFormat("dd");
        Date dayParse = day.parse(date);
        return day.format(dayParse);

    }

    public String getMonth() throws ParseException {
        String date = month + "";
        SimpleDateFormat month = new SimpleDateFormat("MM");
        Date monthParse = month.parse(date);
        return month.format(monthParse);
    }

    public String getYear() throws ParseException {
        String date = year + "";
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        Date yearParse = year.parse(date);
        return year.format(yearParse);
    }

//Setters

    public void setDay(int day) throws IllegalDateException{
        if(day < 1 || day > 31) throw new IllegalDateException("���� ������� �� ����� ������ 1 ��� ������ 31");
        else if(day > 30 && (month == 4 || month == 6 || month == 8 || month == 10) ) throw new IllegalDateException("���� ������ 30 � 4 ��� 6 ��� 8 ��� 10 ������");
        else if(day > 28 && month == 2 && year % 4 != 0) throw new IllegalDateException("�� ���������� ������� ����� 28 ����");
        else if(day > 29 && month == 2) throw new IllegalDateException("���������� ������� ����� 29 ����");
        else this.day = day;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) throw new IllegalDateException("����� ������� �� ����� ������ 1 ��� ������ 12");
        else if(day > 28 && month == 2 && year % 4 != 0) throw new IllegalDateException("�� ���������� ������� ����� 28 ����");
        else if(day > 29 && month == 2) throw new IllegalDateException("���������� ������� ����� 29 ����");
        else this.month = month;
    }

    public void setYear(int year) {
        if(day > 28 && month == 2 && year % 4 != 0) throw new IllegalDateException("�� ���������� ������� ����� 28 ����");
        else if(day > 29 && month == 2) throw new IllegalDateException("���������� ������� ����� 29 ����");
        else this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDateError that = (CustomDateError) o;
        return day == that.day && month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        String formattedDate = null;
        try {
            formattedDate = getFormattedDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDate;
    }
}
