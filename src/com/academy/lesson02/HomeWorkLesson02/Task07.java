package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of character on array: ");
        int numberOfCharacterOnArray = scanner.nextInt();
        int[] arrayRandomNumberFor = new int[numberOfCharacterOnArray];
        System.out.println("Start cycle FOR - random 0 -> 1000");
        System.out.print("[");
        for(int i = 0; i < numberOfCharacterOnArray; i++){
            arrayRandomNumberFor[i] = (int) (Math.random() * 1000);
            if(i == numberOfCharacterOnArray - 1){
                System.out.print(arrayRandomNumberFor[i]);
            } else {
                System.out.print(arrayRandomNumberFor[i] + ", ");
            }
        }
        System.out.println("]");
        System.out.println("Finish cycle FOR");
        System.out.println("**************************************************");
        int[] arrayRandomNumberWhile = new int[numberOfCharacterOnArray];
        System.out.println("Start cycle WHILE - random 0 -> 100");
        System.out.print("[");
        int i = 0;
        while (i < numberOfCharacterOnArray){
            arrayRandomNumberWhile[i] = (int) (Math.random() * 100);
            if(i == numberOfCharacterOnArray - 1){
                System.out.print(arrayRandomNumberWhile[i]);
            } else {
                System.out.print(arrayRandomNumberWhile[i] + ", ");
            }
            i++;
        }
        System.out.println("]");
        System.out.println("Finish cycle WHILE");
    }
}
