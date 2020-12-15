package com.academy.lesson04.HomeWorkOOPQvests;

import java.sql.Array;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
//		-** реализовать статический метод dayOfWeek(int day, int month, int year), который принимает другую дату и вычисляет день недели. Этот метод может возвращать, напр. для
//			понедельника - 0
//			вторника - 1
//			и т.д.
//		- проверить работу методов:
//			getFormattedDate()
//			validate()
//			dayOfWeek()
public class CustomDateMain {
    public static void main(String[] args) throws ParseException {
        Scanner date = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = date.nextInt();
        System.out.print("Введите месяц: ");
        int month = date.nextInt();
        System.out.print("Введите год: ");
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

