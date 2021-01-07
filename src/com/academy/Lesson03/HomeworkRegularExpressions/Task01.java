package com.academy.Lesson03.HomeworkRegularExpressions;
//     1) Написать и протестировать регулярное выражение, которое проверяет, что строка начинается с заглавной буквы и заканчивается точкой.
//
//        В лесу родилась елочка, => false
//        в лесу она росла.		=> false
//        Зимой и летом стройная	=> false
//        Зеленая была.			=> true

import java.util.regex.Pattern;

public class Task01 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 1 **********");
        System.out.println();

        String regex1 = "[А-Я].*\\.";
        Pattern pattern1 = Pattern.compile(regex1);
        String str1 = "В лесу родилась елочка,";
        String str2 = "в лесу она росла.";
        String str3 = "Зимой и летом стройная";
        String str4 = "Зеленая была.";

        System.out.println(
                str1 + " => " + pattern1.matcher(str1).matches()
                        + "\n" + str2 + "       => "   + pattern1.matcher(str2).matches()
                        + "\n" + str3 + "  => "   + pattern1.matcher(str3).matches()
                        + "\n" + str4 + "           => "   + pattern1.matcher(str4).matches()
        );
    }
}
