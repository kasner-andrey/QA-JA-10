package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberFirst;
        double numberSecond;
        double numberThird;
        System.out.println("After entered 3 numbers, the program displayed min, max and average value.");

        //Программа воспринимает дробные числа только которые написаны через "," если через точку "." то выдает ошибку.

            System.out.print("Entered First argument: ");
            numberFirst = scanner.nextDouble();
            System.out.print("Entered Second argument: ");
            numberSecond = scanner.nextDouble();
            System.out.print("Entered Third argument: ");
            numberThird = scanner.nextDouble();
            if(numberFirst > numberSecond && numberFirst > numberThird){
                System.out.println("Max = " + numberFirst);
            } else if (numberSecond > numberFirst && numberSecond > numberThird){
                System.out.println("Max = " + numberSecond);
            } else if (numberThird > numberFirst && numberThird > numberSecond){
                System.out.println("Max = " + numberThird);
            }
            if((numberFirst > numberSecond && numberFirst < numberThird) || (numberFirst < numberSecond && numberFirst > numberThird)){
                System.out.println("Average = " + numberFirst);
            } else if ((numberSecond > numberFirst && numberSecond < numberThird) || (numberSecond > numberThird && numberSecond < numberFirst)){
                System.out.println("Average = " + numberSecond);
            } else if ((numberThird > numberSecond && numberThird < numberFirst) || (numberThird > numberFirst && numberThird < numberSecond)) {
                System.out.println("Average = " + numberThird);
            }
            if(numberFirst < numberSecond && numberFirst < numberThird){
                System.out.println("Min = " + numberFirst);
            } else if (numberSecond < numberFirst && numberSecond < numberThird){
                System.out.println("Min = " + numberSecond);
            } else if (numberThird < numberFirst && numberThird < numberSecond){
                System.out.println("Min = " + numberThird);
            }
            if (numberFirst == numberSecond && numberFirst == numberThird){
                System.out.println("All numbers equal " + numberFirst + " = " + numberSecond + " = " + numberThird);
            } else if (numberFirst == numberSecond && numberFirst > numberThird){
                System.out.println("Numbers equal " + numberFirst + " = " + numberSecond);
            } else if (numberFirst == numberSecond && numberFirst < numberThird){
                System.out.println("Numbers equal " + numberFirst + " = " + numberSecond);
            } else if (numberFirst == numberThird && numberFirst > numberSecond){
                System.out.println("Numbers equal " + numberFirst + " = " + numberThird);
            } else if (numberFirst == numberThird && numberFirst < numberSecond){
                System.out.println("Numbers equal " + numberFirst + " = " + numberThird);
            } else if (numberSecond == numberThird && numberThird > numberFirst){
                System.out.println("Numbers equal " + numberThird + " = " + numberSecond);
            } else if (numberThird == numberSecond && numberThird < numberFirst) {
                System.out.println("Numbers equal " + numberThird + " = " + numberSecond);
            }
   }
}
