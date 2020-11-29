package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three-digit natural number: ");
        int threeDigitNumber = scanner.nextInt();
//Вроде все обошлось! )))
        if (threeDigitNumber > 99 && threeDigitNumber < 1000){
            double doubleNumber = threeDigitNumber;
            int firstDigit = (int) (doubleNumber / 100);
            int secondDigit = (int) ((doubleNumber / 10) - firstDigit * 10);
            int threeDigit = (int) (doubleNumber - (firstDigit * 100) - (secondDigit * 10));
            System.out.println("n = " + firstDigit + secondDigit + threeDigit);
            System.out.println("sum = " + (firstDigit + secondDigit + threeDigit));

        } else System.out.println("This is not three-digit natural number. Bye!");
    }
    }

