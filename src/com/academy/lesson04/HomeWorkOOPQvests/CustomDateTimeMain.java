package com.academy.lesson04.HomeWorkOOPQvests;
//Реализовать класс CustomDateTime, который наследуется от класса CustomDate.
//		Поля (все поля private):
//			- hour (часы)
//			- minute (минута)
//			- second (секунда)
//
//		Конструкторы:
//			- CustomDateTime() - по умолчанию
//			- CustomDateTime(int year, int month, int day, int hour, int minute, int second) со всеми параметрами
//			- CustomDateTime(CustomDateTime dateTime)копирования
//
//		Методы:
//			- set (для каждого поля)
//			- get (для каждого поля)
//
//			getFormattedDate() (переопределить из базового класса)
//				который отображает время и дату: 25.01.2017 15:05:35
//
//			getFormattedDate(boolean isTimeFormat12)
//				который отображает время и дату в зависимости от флага isTimeFormat12:
//				25.01.2017 3:05 p.m.  // isTimeFormat12 is true
//				25.01.2017 15:05  	  // isTimeFormat12 is false

//		Переопределить методы:
//			toString // отображает дату и время 25.01.2017 15:05:35
//			equals
//			hashCode
//
//		- реализовать метод validate(), который проверяет существование введенного времени
//
//		- использовать метод validate(...)
//			при попытке изменть инициализировать класс с помощью конструктора
//			или при попытке модифицировать поля с помощью методов set
//
//		- реализовать методы
//			nextSecond();
//			nextMinute();
//			nextHour();
//			которые увелечивают на единицу значение секунды, минуты и часа соответственно, при чем если кол-во часов достигается
//			24, то должно увеличиться на единицу значение поля day из базового класса
//
//		-* реализовать метод addSeconds(int seconds), который добавляет указанное кол-во секунд к текущей дате

import java.text.ParseException;

public class CustomDateTimeMain {
    public static void main(String[] args) throws ParseException {
        System.out.println("***************** nextSecond CustomDateTime *******************");
        CustomDateTime date = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println(date);
        date.nextSecond();
        System.out.println();

        System.out.println("******************** toString CustomDateTime *************************");
        System.out.println(date);
        System.out.println();

        System.out.println("******************** addSeconds CustomDateTime *************************");
        CustomDateTime date2 = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        date2.addSeconds(400000);
        System.out.println(date2);
        System.out.println();

        System.out.println("**************** getFormattedDate(boolean isTimeFormat12) *****************************");
        System.out.println(date2.getFormattedDate(true));
        System.out.println();

        System.out.println("********************** getFormattedDate() CustomDateTimeExt ***************************");
        CustomDateTimeExt date3 = new CustomDateTimeExt(31, 12, 2020, 23, 59, 59, 15);
        System.out.println(date3.getFormattedDate());
        System.out.println();

        System.out.println("******************** toString CustomDateTimeExt *************************");
        System.out.println(date3);






    }
}
