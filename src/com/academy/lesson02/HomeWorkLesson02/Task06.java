package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
     // Ох уж эти Приведения Типов!!!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int anyIntNumber = scanner.nextInt();
        String anyStringNumber = Integer.toString(anyIntNumber);//страшное место.
        int sumAnyNumber = 0;

        for (int i = 0; i < anyStringNumber.length(); i++){
            int j = Character.getNumericValue(anyStringNumber.charAt(i));//еще одно страшное место.
            sumAnyNumber = sumAnyNumber + j;
        }
        System.out.println("Numbers = " + anyIntNumber);
        System.out.println("Numbers of characters = " + anyStringNumber.length());
        System.out.println("Sum characters = " + sumAnyNumber);
    }
}
