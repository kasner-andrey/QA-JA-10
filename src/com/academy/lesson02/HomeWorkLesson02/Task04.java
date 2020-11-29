package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two-digit natural number: ");
        int twoDigitNumber = scanner.nextInt();
//Вроде Math.round все спас! )))
        if (twoDigitNumber > 9 && twoDigitNumber < 100){
            double doubleNumber = twoDigitNumber;
            int firstDigit = (int) (doubleNumber / 10);
            int secondDigit = (int) Math.round(((doubleNumber / 10) - firstDigit) * 10);
            System.out.println("n = " + firstDigit + secondDigit);
            System.out.println("sum = " + (firstDigit + secondDigit));

        } else System.out.println("This is not two-digit natural number. Bye!");
    }
}
