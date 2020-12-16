package com.academy.lesson04.HomeWorkOOPQvests;

import java.text.ParseException;

public class CustomDateTimeMain {
    public static void main(String[] args) throws ParseException {

        CustomDateTime date = new CustomDateTime(31, 12, 2020, 23, 59, 59);
        System.out.println(date);
        date.nextSecond();
        System.out.println();
        System.out.println("*********************************************");
        System.out.println(date);
        System.out.println("*********************************************");

        CustomDateTime date2 = new CustomDateTime(31, 12, 2020, 23, 59, 59);

        date2.addSeconds(400000);
        System.out.println();
        System.out.println("*********************************************");
        System.out.println(date2);
        System.out.println("*********************************************");
        System.out.println(date2.getFormattedDate(true));







    }
}
