package com.academy.lesson01;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        String firstName = scanner.next();
        System.out.print("Введите Фамилию: ");
        String surName = scanner.next();
        System.out.print("Введите Отчество: ");
        String middleName = scanner.next();
        System.out.print("Введите Возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите Пол: ");
        String sex = scanner.next();
        System.out.print("Введите Номер (10 цифр): ");
        String tell = scanner.next();
        System.out.println("***********************************");
        System.out.println("--------Абонент----------");
        System.out.println(String.format("Имя: %s", firstName));
        System.out.println(String.format("Фамилия: %s", surName));
        System.out.println(String.format("Отчество: %s", middleName));
        System.out.println(String.format("Возраст: %s", age));
        System.out.println(String.format("Пол: %s", sex));
        System.out.println(String.format("Номер: %s", tell));
    }
}
