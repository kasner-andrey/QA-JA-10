package com.academy.lesson01;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���: ");
        String firstName = scanner.next();
        System.out.print("������� �������: ");
        String surName = scanner.next();
        System.out.print("������� ��������: ");
        String middleName = scanner.next();
        System.out.print("������� �������: ");
        int age = scanner.nextInt();
        System.out.print("������� ���: ");
        String sex = scanner.next();
        System.out.print("������� ����� (10 ����): ");
        String tell = scanner.next();
        System.out.println("***********************************");
        System.out.println("--------�������----------");
        System.out.println(String.format("���: %s", firstName));
        System.out.println(String.format("�������: %s", surName));
        System.out.println(String.format("��������: %s", middleName));
        System.out.println(String.format("�������: %s", age));
        System.out.println(String.format("���: %s", sex));
        System.out.println(String.format("�����: %s", tell));
    }
}
