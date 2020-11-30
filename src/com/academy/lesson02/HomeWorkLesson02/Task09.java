package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.print("Enter size tree: ");
        Scanner scanner = new Scanner(System.in);
        int sizeTree = scanner.nextInt();
        System.out.println("Tree through cycle");
        String tree = "*";

        for (int i = 0; i < sizeTree; i++) {
            System.out.println(tree);
            tree = tree + "*";
        }
// Добавил елочку через массив [][]
        String[][] treeArray = new String[sizeTree][sizeTree];
        System.out.println("\nTree through array");

        for (int i = 0; i < treeArray.length; i++){
            System.out.println();
            for (int j = 0; j < treeArray.length; j++){
                if ( j <= i){
                    treeArray[i][j] = "*";
                }else {
                    treeArray[i][j] = " ";
                }
                System.out.print(treeArray[i][j]);
            }
        }
    }
}

