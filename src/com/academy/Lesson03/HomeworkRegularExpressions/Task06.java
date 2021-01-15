package com.academy.Lesson03.HomeworkRegularExpressions;
//6)* Выделить тегом <strong> повторяющиеся слова.
//
//Примеры:
//	Тhis is a test=> this is a test
//	Тhis is is a test => this is <strong>is</strong> a test

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task06 {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("********** Task - 6 **********");
        System.out.println();

        String regex6 = "(\\b[A-Za-z]+\\b)(.*)\\b\\1\\b";
        String input = "This is 12345 321 is a hello a test not test   ";
        input = input.replaceAll(regex6, "$1 $2 <strong>$1</strong>");
        System.out.println(input);
        input.equals(null);
    }
}
