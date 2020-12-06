package com.academy.Lesson03.HomeWork.StringAndArray;

import java.util.Scanner;

//4) Реализовать программу, которая:
//        - считывает с клавиатуры строку
//        - удаляет из строки все цифры
//        - выводит исходную строку
//        - выводит преобразованную строку
//        - выводит список удаленных символов
public class Task04Mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(If you want to use the default string, enter 1 character) Enter string with digits: ");
        String mainStringWithDigits = "55fghhhdjdk123899 dsdssddsds 22222 55d ddddsds55d5dfgg5g55f7";
        String stringWithDigits = scanner.nextLine();
        if(stringWithDigits.length() > 1){
            Task04Method.StringWithDigits(stringWithDigits);
        } else {
            Task04Method.StringWithDigits(mainStringWithDigits);

        }
    }
}
