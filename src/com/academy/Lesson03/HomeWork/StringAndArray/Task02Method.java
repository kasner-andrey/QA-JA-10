package com.academy.Lesson03.HomeWork.StringAndArray;

//2) Напишите программу, которая:
//        - считывает строку
//        - выводит исходную строку
//        - выводит количество и список слов, которые заканчиваются буквами 'ED'

public class Task02Method {

    public static int OutputWordsED(String str){
        System.out.println("source string: \'" + str + "\'");
        System.out.println();
        int numberOfWords = 0;
        int num = 0;
        System.out.println("Words finishing with \"ED\":" );

        for(int i = 0; i < str.length(); i++){
            int sumbolED = str.indexOf("ED ", num);
            int spase = str.lastIndexOf(" ", sumbolED);

            if(spase == -1 && sumbolED != -1){
                System.out.println(str.substring(str.indexOf(str.charAt(0)), sumbolED + 2));
                numberOfWords++;
                num = sumbolED + 1;
            } else if(sumbolED != -1){
                numberOfWords++;
                num = sumbolED + 1;
                System.out.println(str.substring(spase + 1, sumbolED + 2));
            } else if(str.charAt(str.length()-2) == 'E' && str.charAt(str.length() - 1) == 'D'){
                numberOfWords++;
                System.out.println(str.substring((str.lastIndexOf(" ", str.length()) + 1), str.length()));
                break;
            } else {
                break;
            }
        }
        return numberOfWords;
    }
}
