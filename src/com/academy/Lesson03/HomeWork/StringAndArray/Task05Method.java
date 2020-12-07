package com.academy.Lesson03.HomeWork.StringAndArray;
//5) Реализовать программу, которая:
//        - считывает строку
//        - меняет местами порядок символов (напр. "abcd" => "dcba")
//        - выводит исходную строку
//        - выводит перевернутую строку
public class Task05Method {
    public static void InvertedString(String str) {
        System.out.println("Main string: " + "\'" + str + "\'");
        System.out.println();
        System.out.print("Inverted string: \'");
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("\'");
    }



}
