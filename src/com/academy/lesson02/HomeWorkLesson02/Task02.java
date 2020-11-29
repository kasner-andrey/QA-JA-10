package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weightUser;
        System.out.println("Program that calculates weight on the moon.");
//использовано входящее число типа INT т.к. double оставляет нули после запятой.
        System.out.print("Entre your weight: ");
        weightUser = scanner.nextInt();
        System.out.format("Your weight on Earth = %s kg.", weightUser);
        System.out.format("\nYour weight on Moon = %s kg." , (weightUser * 0.17));
    }


}
