package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Enter size tree: ");
        Scanner scanner = new Scanner(System.in);
        int sizeTree = scanner.nextInt();
        String[][] reverseTreeArray = new String[sizeTree][sizeTree];

        for (int i = 0; i < reverseTreeArray.length; i++){
            System.out.println();
            for (int j = 0; j < reverseTreeArray.length; j++){
                if (j < reverseTreeArray.length - 1 - i){
                    reverseTreeArray[i][j] = " ";
                } else {
                    reverseTreeArray[i][j] = "*";
                    }
                System.out.print(reverseTreeArray[i][j]);
            }
        }
    }
}
