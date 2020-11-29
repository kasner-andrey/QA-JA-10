package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
// Проверка на наличие аргументов в методе MAIN, если аргументы есть, и их не менее 2-х, то идем в первую ветку.
        if (args != null && args.length > 1){
        double firstArgument = Double.parseDouble(args[0]);
        double secondArgument = Double.parseDouble(args[1]);
        int division = (int) (firstArgument/secondArgument);
        int remainder = (int) (((firstArgument/secondArgument) - division) * 10);

            System.out.println("q = " + args[0]);
            System.out.println("w = " + args[1]);
            System.out.println("q/w = " + division);
            System.out.println("r = " + remainder);
        } else {
//просим ввести аргументы в консоли и производим вычисления.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First argument: ");
            double firstArgument = scanner.nextDouble();
            System.out.print("Enter Second argument: ");
            double secondArgument = scanner.nextDouble();
            int division = (int) (firstArgument/secondArgument);
            int remainder = (int) (((firstArgument/secondArgument) - division) * 10);

                System.out.println("q = " + ((int) firstArgument));
                System.out.println("w = " + ((int) secondArgument));
                System.out.println("q/w = " + division);
                System.out.println("r = " + remainder);
        }
    }
}
