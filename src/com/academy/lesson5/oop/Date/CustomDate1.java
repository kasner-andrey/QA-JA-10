package com.academy.lesson5.oop.Date;
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
//		-** ����������� ����������� ����� dayOfWeek(int day, int month, int year), ������� ��������� ������ ���� � ��������� ���� ������.
//		���� ����� ����� ����������, ����. ���
//			������������ - 0
//			�������� - 1
//			� �.�.
//		- ��������� ������ �������:
//			getFormattedDate()
//			validate()
//			dayOfWeek()

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

//� ������������ �������� ���� �� ���������
public class CustomDate1 {
    private int day = 1;
    private int month = 1;
    private int year = 1999;

//Constructor
    public CustomDate1(int day, int month, int year) {
        if(validate(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public CustomDate1() {
    }
//Validation
    public static boolean validate(int day, int month, int year){
        String date;
        if(day < 10 && month > 9){ date = "0" + day + "." + month + "." + year;}
        if(month < 10 && day < 10){ date = "0" + day + ".0" + month + "." + year;}
        else if(day > 9 && month < 10){ date = day + ".0" + month + "." + year;}
        else date = day + "." + month + "." + year;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = null;
        try {
            formatDate.setLenient(false);
            date1 = formatDate.parse(date);
        } catch (Exception e) {
            System.out.println("CustomDate.validate: ������ � ����!");
            return false;
        }
        return  true;
    }
//������ ���� � ���� ������
    public String getFormattedDate() throws ParseException {
            SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
            String date = day + "." + month + "." + year;
            Date dateParse = formatDate.parse(date);
            String dateYear = formatDate.format(dateParse);
            String weekDay = formatWeek.format(dateParse);
            return dateYear + " " + weekDay;
    }
//����� ��� ������
    public static String dayOfWeek(int day, int month, int year) throws ParseException {
        if(CustomDate1.validate(day, month, year)) {
            String date = day + "." + month + "." + year;
            SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
            Date dateParse = formatDate.parse(date);
            return formatWeek.format(dateParse);
        } else return "CustomDate.dayOfWeek: �� ��������� ����.";
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

    public void setDay(int day){
        if(validate(day, month, year)){
            this.day = day;
        } else System.out.println("CustomDate.setDay: �� ���������� ����!");
    }

    public void setMonth(int month) {
        if(validate(day, month, year)){
            this.month = month;
        } else System.out.println("CustomDate.setMonth: �� ���������� �����!");
    }

    public void setYear(int year) {
        if(validate(day, month, year)){
            this.year = year;
        } else System.out.println("CustomDate.setYear: �� ���������� ���!");
    }
// ������ equals(), hashCode(), toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDate1 that = (CustomDate1) o;
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
