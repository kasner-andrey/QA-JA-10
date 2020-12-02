package com.academy.lesson02.HomeWorkLesson02;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Multiplication table:");

        for (int i = 1; i < 10; i++){
            System.out.println("**********");
            for ( int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            }
    }
}
