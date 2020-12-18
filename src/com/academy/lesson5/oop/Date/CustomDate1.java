package com.academy.lesson5.oop.Date;
//1) Создать класс CustomDate, который имеет следующие поля:
//		- день
//		- месяц
//		- год
//
//	Все поля должны быть помечены модификатором private
//		- реализовать доступ к полям через методы set и get
//		- реализовть public метод getFormattedDate(); который вернет дату в отформатированном виде, напр. 21.12.2018 (или 21.12.2018 пятница)
//		-* реализовать статический метод validate(int day, int month, int year), который проверяет существование введенной даты
//		и выводит true/false (учитывать высокосный год)
//
//		-* использовать проверку validate, при попытке изменить поле методом set, в случае ошибки не проводить изменение,
//			а вывести сообщение об ошибке на консоль
//		-** реализовать статический метод dayOfWeek(int day, int month, int year), который принимает другую дату и вычисляет день недели.
//		Этот метод может возвращать, напр. для
//			понедельника - 0
//			вторника - 1
//			и т.д.
//		- проверить работу методов:
//			getFormattedDate()
//			validate()
//			dayOfWeek()

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

//С возможностью создания даты по умолчанию
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
            System.out.println("CustomDate.validate: Ошибка в дате!");
            return false;
        }
        return  true;
    }
//Вывыод даты с днем недели
    public String getFormattedDate() throws ParseException {
        DateFormat format = DateFormat.RU;
        SimpleDateFormat formatDate = new SimpleDateFormat(format.format());
        SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
        String date = day + "." + month + "." + year;
        Date dateParse = formatDate.parse(date);
        String dateYear = formatDate.format(dateParse);
        String weekDay = formatWeek.format(dateParse);
        return dateYear + " " + weekDay;
    }
//a) Создать перечисление "Формат Даты" (DateFormat), в котором определить несколько форматов, например:
//		- 	RU 			Россия						DD.MM.YYYY					24.01.2011
//		- 	USA 		США							MM-DD-YYYY					01-24-2011
//		-	ENG			Международный английский	DD-MM-YYYY					24-01-2011
//		- 	UK			Великобритания				DD/MM/YYYY					24/01/2011
//		-* 	CUSTOM		Пользовательский			DD <Название месяца> YYYYг	25 января 2011г
//
//	b) Модифицировать класс CustomDate из предыдущего занятия, для фозможности отображения даты в заданном формате:
//		- public String getFormattedDate() {} // возвращает дату в формате по умолчанию - RU: 24.01.2011
//		- public String getFormattedDate((DateFormat format){} // возвращает дату в заданном формате по образцу из задания а)
//******************************************************************************************
    public  String getFormattedDate(DateFormat format) throws ParseException {          //**
        DateFormat formatRu = DateFormat.RU;                                            //**
        SimpleDateFormat formatParse = new SimpleDateFormat(formatRu.format());         //**
        SimpleDateFormat formatDate = new SimpleDateFormat(format.format());            //**
        SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");              //**
        String date = day + "." + month + "." + year;                                   //**
        Date dateParse = formatParse.parse(date);                                       //**
        String dateYear = formatDate.format(dateParse);                                 //**
        String weekDay = formatWeek.format(dateParse);                                  //**
        return dateYear + " " + weekDay;                                                //**
    }                                                                                   //**
//******************************************************************************************
//Вывод дня недели
    public static String dayOfWeek(int day, int month, int year) throws ParseException {
        if(CustomDate1.validate(day, month, year)) {
            String date = day + "." + month + "." + year;
            SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
            Date dateParse = formatDate.parse(date);
            return formatWeek.format(dateParse);
        } else return "CustomDate.dayOfWeek: Не павильная дата.";
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
        } else System.out.println("CustomDate.setDay: Не правильный день!");
    }

    public void setMonth(int month) {
        if(validate(day, month, year)){
            this.month = month;
        } else System.out.println("CustomDate.setMonth: Не правильный месяц!");
    }

    public void setYear(int year) {
        if(validate(day, month, year)){
            this.year = year;
        } else System.out.println("CustomDate.setYear: Не правильный год!");
    }
// Методы equals(), hashCode(), toString()
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
