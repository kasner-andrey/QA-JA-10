package com.academy.lesson04.HomeWorkOOPQvests;
//1) —оздать класс CustomDate, который имеет следующие пол€:
//		- день
//		- мес€ц
//		- год
//
//	¬се пол€ должны быть помечены модификатором private
//		- реализовать доступ к пол€м через методы set и get
//		- реализовть public метод getFormattedDate(); который вернет дату в отформатированном виде, напр. 21.12.2018 (или 21.12.2018 п€тница)
//		-* реализовать статический метод validate(int day, int month, int year), который провер€ет существование введенной даты
//		и выводит true/false (учитывать высокосный год)
//
//		-* использовать проверку validate, при попытке изменить поле методом set, в случае ошибки не проводить изменение,
//			а вывести сообщение об ошибке на консоль
//		-** реализовать статический метод dayOfWeek(int day, int month, int year), который принимает другую дату и вычисл€ет день недели.
//		Ётот метод может возвращать, напр. дл€
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

public class CustomDate {
    private int day = 1;
    private int month = 1;
    private int year = 1999;
    private static boolean flagValidation = false;


//Constructor
    public  CustomDate(int day, int month, int year) {
        if(validate(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public CustomDate() {
    }

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
            System.out.println("Validate: ќшибка в дате!");
            return false;
        }
        CustomDate.flagValidation = true;
        return  true;
    }

    public String getFormattedDate() throws ParseException {
        if(flagValidation) {
            SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
            String date = day + "." + month + "." + year;
            Date dateParse = formatDate.parse(date);
            String dateYear = formatDate.format(dateParse);
            String weekDay = formatWeek.format(dateParse);
            return dateYear + " " + weekDay;
        } else return "Ќе правильна€ дата getFormattedDate.";
    }

    public static String dayOfWeek(int day, int month, int year) throws ParseException {
        if(CustomDate.validate(day, month, year)) {
            String date = day + "." + month + "." + year;
            SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat formatWeek = new SimpleDateFormat("EEEE");
            Date dateParse = formatDate.parse(date);
            return formatWeek.format(dateParse);
        } else return "Ќе павильна€ дата dayOfWeek.";
    }
//Getters

    public String getDay() throws ParseException {
        if(flagValidation){
            String date = day + "";
            SimpleDateFormat day = new SimpleDateFormat("dd");
            Date dayParse = day.parse(date);
            return day.format(dayParse);
        } else return "Ќе правильна€ дата getDay.";
    }

    public String getMonth() throws ParseException {
        if(flagValidation) {
            String date = month + "";
            SimpleDateFormat month = new SimpleDateFormat("MM");
            Date monthParse = month.parse(date);
            return month.format(monthParse);
        } else return "Ќе правильна€ дата getMonth.";
    }

    public String getYear() throws ParseException {
        if(flagValidation) {
            String date = year + "";
            SimpleDateFormat year = new SimpleDateFormat("yyyy");
            Date yearParse = year.parse(date);
            return year.format(yearParse);
        } else return "Ќе правильна€ дата getYear.";
    }

//Setters

    public void setDay(int day){
        if(validate(day, month, year)){
            this.day = day;
        } else System.out.println("Ќе правильный день!");
    }

    public void setMonth(int month) {
        if(validate(day, month, year)){
            this.month = month;
        } else System.out.println("Ќе правильный мес€ц!");
    }

    public void setYear(int year) {
        if(validate(day, month, year)){
            this.year = year;
        } else System.out.println("Ќе правильный год!");
    }
}
