package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.print("Enter size tree: ");
        Scanner scanner = new Scanner(System.in);
        int sizeTree = scanner.nextInt();
        String tree = "*";

        for (int i = 0; i < sizeTree; i++) {
            System.out.println(tree);
            tree = tree + "*";
        }
    }

}

