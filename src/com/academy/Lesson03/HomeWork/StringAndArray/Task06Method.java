package com.academy.Lesson03.HomeWork.StringAndArray;
//6) Реализовать программу, которая:
//	- считывает строку
//	- выводит исходную строку на экран
//	- выводит кол-во символов латиницы
//	- выводит кол-во символов кириллицы
public class Task06Method {
    //работает только при установке кодировки windows-1251 и класс Task06Main и класс Task06Method должен быть в этой кодировке.
    public static void CountingNumberOfCyrillicAndLatinCharacters(String str) {
        System.out.println("Main string: \'" + str + "\'");
        int numberLatin = 0;
        int numberCyrillic = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'А' && 'я' >= str.charAt(i)) {
                numberCyrillic++;
                } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z'){
                    numberLatin++;
            }
        }
        System.out.println("Number Latin: " + numberLatin);
        System.out.println("Number Cyrillic: " + numberCyrillic);

    }
}
