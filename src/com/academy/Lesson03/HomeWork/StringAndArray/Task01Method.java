package com.academy.Lesson03.HomeWork.StringAndArray;

import org.jetbrains.annotations.NotNull;

public class Task01Method {

    private static String str;

    public  static void OutputString(String str){
        System.out.println(str);
    }

    public static int OutputWordsD(String str){
        Task01Method.str = str;
        int numberOfWords = 0;
        int num = 0;
        System.out.println("Words starting with \"d\":" );
        int spaceFirst = str.indexOf(" ");
        if(str.charAt(0) == 'd'){
            System.out.println(str.substring(0, spaceFirst));
            numberOfWords++;
        }

        for(int i = 0; i < str.length(); i++){
            int symbolD = str.indexOf(" d", num);
            int space = str.indexOf(" ", symbolD + 2);
            if(symbolD != -1 && space == -1){
                System.out.println(str.substring(symbolD +1, str.length()));
                numberOfWords++;
                break;
            }
            if (symbolD != -1){
                numberOfWords++;
                num = symbolD + 2;
                System.out.println(str.substring(symbolD + 1, space));
            } else {
                break;
            }
        }
        System.out.println();
        return numberOfWords;
    }


}
