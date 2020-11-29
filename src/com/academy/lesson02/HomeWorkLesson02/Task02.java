package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightUser;
        System.out.println("Program that calculates weight on the moon.");
//поигрался с типами данных, чтоб на вход принимать Double, а выводить адекватное колличество нулей после запятой.
        System.out.print("Entre your weight: ");
        weightUser = scanner.nextDouble();
        System.out.format("Your weight on Earth = %s kg.", ((int)(weightUser)));
        System.out.format("\nYour weight on Moon = %s kg." , ((float)(weightUser * 0.17)));
    }


}
