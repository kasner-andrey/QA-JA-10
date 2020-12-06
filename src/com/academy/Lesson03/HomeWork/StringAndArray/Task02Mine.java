package com.academy.Lesson03.HomeWork.StringAndArray;

//2) Напишите программу, которая:
//        - считывает строку
//        - выводит исходную строку
//        - выводит количество и список слов, которые заканчиваются буквами 'ED'

public class Task02Mine {
    public static void main(String[] args) {

        int numberED = Task02Method.OutputWordsED("hhhhfED jjdjdjdjED  jdjjdED kckckED lklfjjfjfjjfjED");
        System.out.println();
        System.out.println("Number of words finishing with \"ED\"  = " + numberED);

    }
}
