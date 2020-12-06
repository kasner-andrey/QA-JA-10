package com.academy.Lesson03.HomeWork.StringAndArray;

//4) Реализовать программу, которая:
//        - считывает с клавиатуры строку
//        - удаляет из строки все цифры
//        - выводит исходную строку
//        - выводит преобразованную строку
//        - выводит список удаленных символов
public class Task04Method {
    public static void StringWithDigits(String str) {
        System.out.println("You enter string: " + str);
        System.out.println();
        int charLetter = 0;
        int charNumber = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    charNumber++;
                } else {
                    charLetter++;
                }
            }
        if(charLetter == 0 || charNumber == 0){
            if(charLetter == 0){
                System.out.println("String without letters! Goodbye!");
            } else {
                System.out.println("String without digits! Goodbye!");
            }
        } else {
            char[] lettersArray = new char[charLetter];
            char[] digitsArray = new char[charNumber];
            int arrNumberLetter = 0;
            int arrNumberDigit = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isDigit(str.charAt(i))) {
                        digitsArray[arrNumberDigit] = str.charAt(i);
                        arrNumberDigit++;
                    } else {
                        lettersArray[arrNumberLetter] = str.charAt(i);
                        arrNumberLetter++;
                    }
                }
            System.out.println("Converted string: ");
            for(int i: lettersArray)
                System.out.print(Character.toString(i));
            System.out.println();
            System.out.println();
            System.out.println("list of deleted items: ");
            for(int i: digitsArray )
                System.out.print(Character.getNumericValue(i) + "; ");
        }
    }
}
