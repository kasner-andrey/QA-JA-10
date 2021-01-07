package com.academy.Lesson03.HomeworkRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class proba {
    public static void main(String[] args) {
//        String strings = "stoooooopppppppppppppppppp";
//
//        String regex = "(?i)([a-z])\\1{2,}";
//        Pattern pattern = Pattern.compile(regex);
//        for (String string : strings) {
//            System.out.println(string.replaceAll(regex, "$1$1"));
//        }
//        String string = "sto//o.oooopp,pppp//p pp//pp++ppp--pppp";
        String string = "sto/o.oooopp,pppp/p pp/pp++ppp--pppp";
        String regex1 = "(?=(\\W))";
//        String regex1 = "([a-z])\\1{2,}";

        Pattern pattern1 = Pattern.compile(regex1);


            Matcher matcher = pattern1.matcher(string);
        String str = matcher.replaceAll(" 1 ");
            String reg = string.replaceAll(regex1, " $2 ");
            //String car = string.replace(regex1, '*');
        System.out.println(string);
            System.out.println(reg);
        System.out.println(str);
//            if (matcher.find()) {
////                System.out.println(string + " " + matcher.find() + " pos1 - " + matcher.start());
////                System.out.println(string + " " + matcher.find() + " pos2 - " + matcher.start());
////                System.out.println(string + " " + matcher.find() + " pos3 - " + matcher.start());
////                System.out.println(string + " " + matcher.find() + " pos4 - " + matcher.start());
////                System.out.println(string + " " + matcher.find() + " pos5 - " + matcher.start());
//
//            }

//        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
//        String s = "адреса эл.почты:ivanov@gmail.com, sidorov@bsu.by!";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            System.out.println("e-mail: " + matcher.group());
//        }




    }
}
