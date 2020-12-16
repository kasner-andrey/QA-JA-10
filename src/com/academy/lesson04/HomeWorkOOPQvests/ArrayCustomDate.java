package com.academy.lesson04.HomeWorkOOPQvests;

import javax.swing.*;
import java.text.ParseException;
import java.util.Locale;

//2) Создать массив размера 10, состоящий из классов CustomDate
//	- наполнить массив случайными значениями действительных дат
//	- вывести все даты массива на консоль
//	- вывести только даты месяца февраль
//	- *вывести только даты понедельника
public class ArrayCustomDate {
    public static CustomDate[] arrayDate;

    public static void main(String[] args) throws ParseException {
        int size = Integer.parseInt(JOptionPane.showInputDialog("Введите размер массива рандомных дат"));

        ArrayCustomDate.RandomDate(size);
        ArrayCustomDate.Printed();
        ArrayCustomDate.SortMonth();
        ArrayCustomDate.SortWeek();
        System.exit(0);
    }
//*********************** Создание массива дат ***************
    public static void RandomDate(int size) {
        arrayDate = new CustomDate[size];
        int dayCustomDate;
        int monthCustomDate;
        int yearCustomDate;
        for (int i = 0; i < arrayDate.length; i++) {
            monthCustomDate = 1 + (int) (Math.random() * 11);
            if (monthCustomDate == 4 || monthCustomDate == 6 || monthCustomDate == 9 || monthCustomDate == 11) {
                dayCustomDate = 1 + (int) (Math.random() * 29);
            } else if (monthCustomDate == 2) {
                dayCustomDate = 1 + (int) (Math.random() * 27);
            } else dayCustomDate = 1 + (int) (Math.random() * 30);
            yearCustomDate = 1990 + (int) (Math.random() * 31);
            arrayDate[i] = new CustomDate(dayCustomDate, monthCustomDate, yearCustomDate);
//            System.out.println("****** Date " + (i+1) + " ******");
//            System.out.println(arrayDate[i].getFormattedDate());
        }
    }
    //*********************** Вывод массива дат ***************
    public static void Printed() throws ParseException {
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        int i = 1;
        for(CustomDate date:arrayDate){
            System.out.println("****** Date " + i + " ******");
            System.out.println(date.getFormattedDate());
            i++;
        }
    }

    public static void SortMonth() throws ParseException {
        String month = ArrayCustomDate.WindowMonth();
        System.out.println();
        System.out.println("****** Сортировка по выбраному месяцу ******");
        for (CustomDate date: arrayDate){
            if(date.getMonth().equals(month)){
                System.out.println("***** Date *****");
                System.out.println(date.getFormattedDate());
            }
        }
    }

    public static void SortWeek() throws ParseException {
        String week = ArrayCustomDate.WindowWeek();
        System.out.println();
        System.out.println("****** Сортировка по выбранному дню недели ******");
        for (CustomDate date: arrayDate){
            if(date.getFormattedDate().indexOf(week.toLowerCase()) > 0){
                System.out.println("***** Date *****");
                System.out.println(date.getFormattedDate());
            }
        }
    }


    public static String WindowMonth() {
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String questMonth = (String) JOptionPane.showInputDialog(null, "Выберите месяц для отсева",
                "Месяц", JOptionPane.QUESTION_MESSAGE, null, month, month[0]);
        int numberMonth = 0;
        String numberStringMonth = "1";
        for(int i = 0; i < month.length; i++){
            if(month[i].equals(questMonth)){ numberMonth = i + 1;}
        }
        if(numberMonth < 10) {
            numberStringMonth = "0" + numberMonth;
        }else numberStringMonth = "" + numberMonth;
        return numberStringMonth;
    }

    public static String WindowWeek(){
        String[] weekDay = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        return (String) JOptionPane.showInputDialog(null, "Выберите день недели для отсева",
                "Array size", JOptionPane.QUESTION_MESSAGE, null, weekDay, weekDay[0]);
    }

}
