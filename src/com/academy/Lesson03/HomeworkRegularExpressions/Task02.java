package com.academy.Lesson03.HomeworkRegularExpressions;
//     2) a) Создать регулярное выражение для поиска несоответствия строки  шаблонy денежного формата:
//        - цифры разделенные точкой или запятой
//        - разделителя может не быть
//        - после разделителя должна быть одна или две цифры
//        - в конце должен находится литерал, обозначающий валюту из набора: грн руб $
//
//        Пример:
//        0.50грн 	=> true
//        0.5грн 		=> true
//        12,45руб 	=> true
//        15,45 руб 	=> false
//        123$ 		=> true
//        123.$		=> false
//        123.00$		=> true
//        a12грн 		=> false
//        0.50грн.	=> false
//        0.50 	=> false
//
//        b)  Написать функцию boolean testCurrencyFormat(String regexFormat);
//        - которая тестирует регулярку на заданных выше примерах
//        - возвращает  true, если все тесты прошли корректно, false - иначе

import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 2.1 **********");
        System.out.println();

        String regex2 = "\\d+(.\\d+)?(руб|грн|\\$)";
        Pattern pattern2 = Pattern.compile(regex2);
        String str5 = "0.50грн";
        String str6 = "0.5грн";
        String str7 = "12,45руб";
        String str8 = "15,45 руб";
        String str9 = "123$";
        String str10 = "123.$";
        String str11 = "123.00$";
        String str12 = "a12грн";
        String str13 = "0.50грн.";
        String str14 = "0.50";
        System.out.println(
                str5 + "    => " + pattern2.matcher(str5).matches()
                        + "\n" + str6 + "     => "   + pattern2.matcher(str6).matches()
                        + "\n" + str7 + "   => "   + pattern2.matcher(str7).matches()
                        + "\n" + str8 + "  => "   + pattern2.matcher(str8).matches()
                        + "\n" + str9 + "       => "   + pattern2.matcher(str9).matches()
                        + "\n" + str10 + "      => "   + pattern2.matcher(str10).matches()
                        + "\n" + str11 + "    => "   + pattern2.matcher(str11).matches()
                        + "\n" + str12 + "     => "   + pattern2.matcher(str12).matches()
                        + "\n" + str13 + "   => "   + pattern2.matcher(str13).matches()
                        + "\n" + str14 + "       => "   + pattern2.matcher(str14).matches()
        );

        System.out.println();
        System.out.println("********** Task - 2.2 **********");
        System.out.println();

        System.out.println("Качество регулярки: \"" + regex2 + "\" - соответствует - " + testCurrencyFormat(regex2));
    }

    //  b)  Написать функцию boolean testCurrencyFormat(String regexFormat);
//        - которая тестирует регулярку на заданных выше примерах
//        - возвращает  true, если все тесты прошли корректно, false - иначе
    private static boolean testCurrencyFormat(String regexFormat){//принимает пользовательскую регулярку
        Pattern pattern = Pattern.compile(regexFormat);//компилирует регулярку
        String[] str = {"0.50грн", "0.5грн", "12,45руб", "15,45 руб", "123$", "123.$", "123.00$", "a12грн", "0.50грн.", "0.50"};//строки, которые проверяются
        Boolean[] result = {true, true, true, false, true, false, true, false, false, false};// заведомо верные ответы которые должны быть при проверке строк в массиве сверху
        int fal = 0;//колличество ошибок в пользовательской регулярке
        // циклом проверяет соответствие регулярки и правильных ответов
        for(int i = 0; i < str.length; i++) if(!pattern.matcher(str[i]).matches() == result[i]) fal++;//если не верно, добавляет ошибку
        return fal == 0;//возврат true если ошибок небыло обнаружено, и false если были ошибки
    }
}
