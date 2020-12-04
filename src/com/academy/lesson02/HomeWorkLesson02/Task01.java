package com.academy.lesson02.HomeWorkLesson02;

import java.text.Format;
import java.util.Scanner;
//Написать программу ввода с клавиатуры последовательно 3 чисел. Вывести
//		минимальное максимальное и средние значения
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberFirst;
        double numberSecond;
        double numberThird;
        System.out.println("After entered 3 numbers, the program displayed min, max and average value.");

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
// решение без перебора
        System.out.println("********************************************************");
            double[] array = new double[]{numberFirst, numberSecond, numberThird};
            double min = array[0];
            double max = 0;
            double average = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] > max){
                    max = array[i];
                }else if(array[i] < min){
                    min = array[i];
                }else{
                    average = array[i];
                }
            }
        System.out.println(String.format("number max = %.0f; number min = %.0f; average = %.0f;", max, min, average));



   }


}
