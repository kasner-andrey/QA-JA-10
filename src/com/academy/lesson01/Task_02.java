package com.academy.lesson01;

public class Task_02 {
    public static void main(String[] args) {
        if (args.length == 1) {
            String preFix = args[0];
            //String postFix = args[1];
            System.out.println(preFix + " -- ������!");
            System.out.println(preFix + " -- ��� ��� ������ ���������. � ���� �� Java.");
            System.out.println(preFix + " -- ��������������� - ��� ���������.");
            System.out.println(preFix + " -- ��� ���� - �������� ������ ��������� � ��������� ��.");
        } else if (args.length == 2){
            String preFix = args[0];
            String postFix = args[1];
            System.out.println(preFix + " -- ������! -- " + postFix);
            System.out.println(preFix + " -- ��� ��� ������ ���������. � ���� �� Java. -- " + postFix);
            System.out.println(preFix + " -- ��������������� - ��� ���������. -- " + postFix);
            System.out.println(preFix + " -- ��� ���� - �������� ������ ��������� � ��������� ��. -- " + postFix);

        } else {
            System.out.println("������!");
            System.out.println("��� ��� ������ ���������. � ���� �� Java.");
            System.out.println("��������������� - ��� ���������.");
            System.out.println("��� ���� - �������� ������ ��������� � ��������� ��.");
        }
    }
}
