package com.academy.Lesson03.HomeWork.StringAndArray;
//3) Напишите программу, которая:
//	- считывает строку
//	- считывает подстроку
//	- выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку
public class Task03Method {
    public static void OccurrenceOfSubstringInString(String str, String substr) {
        System.out.println("Main string: " + "\"" + str + "\"");
        System.out.println("Substring: " + "\"" + substr + "\"");
        int numberSubSting = 0;
        int indexSubstring = 0;
        for(int i = 0; i < str.length(); i++){
            indexSubstring = str.indexOf(substr, indexSubstring) + 1;
            if(indexSubstring > 0){
                numberSubSting++;
            } else  break;
        }
        System.out.println("number of occurrences of substring in string = " + numberSubSting);
    }
}
