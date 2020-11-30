package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

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

    }
}
