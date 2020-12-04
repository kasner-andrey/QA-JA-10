package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

//Нарисовать квадрат заданного размера. Пример для размера 4:
//****
//*  *
//*  *
//****

public class Task08 {
    public static void main(String[] args) {
        System.out.print("Enter size square: ");
        Scanner scanner = new Scanner(System.in);
        int sizeSquare = scanner.nextInt();
        String[][] square = new String[sizeSquare][sizeSquare];

        for (int i = 0; i < square.length; i++){
            System.out.println();
            for (int j = 0; j < square.length; j++){
                if(i == 0 || i == square.length - 1){
                    square[i][j] = "*";
                } else if(j == 0 || j == square.length - 1){
                    square[i][j] = "*";
                } else {
                    square[i][j] = " ";
                }
                System.out.print(square[i][j]);
            }
        }
//Решение через циклы без массива
            for(int i = 0; i < sizeSquare; i++){
                System.out.println();
                for(int j = 0; j < sizeSquare; j++){
                    if( i == 0 || i == sizeSquare - 1 || j == 0 || j == sizeSquare - 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }


    }
}
