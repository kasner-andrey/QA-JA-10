package com.academy.lesson02.HomeWorkLesson02;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Pythagoras Table:");
        System.out.print("x |   ");

        for( int i = 1; i < 10; i++){
            System.out.print(i + "    ");
        }
        System.out.print("\n-------------------------------------------------");

        for (int i = 1; i < 10; i++){
            System.out.print("\n" + i + " |   ");
            for (int j = 1; j < 10; j++){
                if(i * j > 9){
                    System.out.print(i * j + "   ");
                } else {
                    System.out.print(i * j + "    ");
                }
            }
        }
    }
}
