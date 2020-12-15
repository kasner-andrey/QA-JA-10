package com.academy.lesson04.HomeWorkOOPQvests;

import java.text.ParseException;
import java.util.Scanner;

//2) Создать массив размера 10, состоящий из классов CustomDate
//	- наполнить массив случайными значениями действительных дат
//	- вывести все даты массива на консоль
//	- вывести только даты месяца февраль
//	- *вывести только даты понедельника
public class ArrayCustomDate {
    public static void main(String[] args) throws ParseException {
        Scanner sizeArray = new Scanner(System.in);
        System.out.println("Введите размер массива, который нужно создать: ");
        int size = sizeArray.nextInt();
        System.out.println("Введите месяц, который нужно отсортировать: ");
        int month = sizeArray.nextInt();
        System.out.println("Введите день недели, который нужно отсортировать: ");
        String dayWeek = sizeArray.nextLine();


        CustomDate[] arrayDate = new CustomDate[size];
        int dayCustomDate;
        int monthCustomDate;
        int yearCustomDate;

        for(int i = 0; i < arrayDate.length; i++){
            monthCustomDate = 1 + (int) (Math.random() * 11);
            if(monthCustomDate == 4 || monthCustomDate == 6 || monthCustomDate == 9 || monthCustomDate == 11){
                dayCustomDate = 1 + (int) (Math.random() * 29);
            } else if (monthCustomDate == 2){
                dayCustomDate = 1 + (int) (Math.random() * 27);
            } else dayCustomDate = 1 + (int) (Math.random() * 30);
            yearCustomDate = 1+ (int) (Math.random() * 3000);
            arrayDate[i] = new CustomDate(dayCustomDate, monthCustomDate, yearCustomDate);
        }


    //*********************** Вывод массива дат ***************
    int i = 1;
        for (CustomDate date: arrayDate) {
            System.out.println("*** Date " + i + " ***");
            System.out.println(date.getFormattedDate());
            i++;
        }

    }
}
