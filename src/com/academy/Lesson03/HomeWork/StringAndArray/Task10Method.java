package com.academy.Lesson03.HomeWork.StringAndArray;

import javax.swing.*;
import java.util.Arrays;

//Реализовать программу, которая:
//		-принимает строку
//		-выводит массив слов, которые содержат символ @
//
//		Например:
//			Входная строка:
//				"Если возникли вопросы обращайтесь в службу поддержки support@gmail.com или central.office@mail.com"
//			Результат:
//				[support@gmail.com, central.office@mail.com]
public class Task10Method {
    public static void OpenWidowLine() {
        String str = JOptionPane.showInputDialog("Введите строку с E-mail адрессами");
        System.out.println(str);
        if(str.length() == 0){
            System.out.println("Вы не ввели строку");
        } else {
            Task10Method.LineValidation(str);
        }
        System.exit(0);
    }

    public static void LineValidation(String str) {
        int dog1 = str.indexOf("@");
        if (dog1 == -1) {
            System.out.println("В строке нет E-mail адресса!");
        } else Task10Method.Line(str);
    }

    public static void Line(String str) {
        int dog = 0;
        int dogMax = 0;
        int firstDog = 0;
        int secondDog = 0;
        StringBuilder strItemArray = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            dog = str.indexOf("@", secondDog);
            if(dog > dogMax) dogMax = dog;
            if(dog < dogMax) break;
            firstDog = str.lastIndexOf(" ", dog);
            secondDog = str.indexOf(" ", dog);
            if(firstDog == -1 && secondDog == -1){
                strItemArray.append(str);
            } else if(firstDog == -1){
                strItemArray.append(str.substring(0, secondDog)).append(" ");
            } else if(secondDog == -1){
                strItemArray.append(str.substring(firstDog + 1, str.length())).append(" ");
            }else strItemArray.append(str.substring(firstDog + 1, secondDog)).append(" ");
        }
        String[] ArrayEmail = strItemArray.toString().split(" ");
        System.out.println(Arrays.toString(ArrayEmail));

    }
}

