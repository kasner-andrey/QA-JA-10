package com.academy.Lesson09.HomeWork.TaskInterface.Lambda;

import javax.swing.*;

//1) 	Составьте лямбда-выражение, которое возвращает значение true, если
//		число принадлежит к диапазону чисел 10-20, включая граничные значения
//
//2)	Создайте блочное лямбда-выражение для вычисления факториала целого числа.
//		Продемонстрируйте его использование. (5! = 1*2*3*4*5 = 120)
//
//3)  Создайте лямбда-выражение, которое переводит символы строки в верхний регистр.
//		Перевести строку в верхний регистр с помощью лямбда-выражения.
//		Перевести строку в верхний регистр с помощью ссылки на метод.
//
//
//4) Создайте лямбда-выражение, которое удаляет все пробелы из заданной строки и возвращает результат.
//	Продемонстрируйте работу лямбда-выражения.
//	"Helen Abdel Leon abc array var jMeter Selenium Yaguar" => "HelenAbdelLeonabcarrayvarjMeterSeleniumYaguar"
//
//5) Для класса CustomDateTime (разработанном на пред. занятиях) создать лямбда-выражение, кот. для
//текущей даты сбрасывает время на 00:00:00
public class LambdaMain {
    public static void main(String[] args) {
        System.out.println("************** 1 ****************");
        System.out.println();
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Введите число"));

        LambdaInterface<Boolean, Integer> tenTwenty = i -> (i > 9 && i < 21);

        if(tenTwenty.work(number1)) System.out.println("Ваше число '" + number1 + "' находится в диапазоне от 10 до 20!");
        else System.out.println("Ваше число '" + number1 + "' не входит в диапазон от 10 до 20!");

        System.out.println();
        System.out.println("************** 2 ****************");
        System.out.println();
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Введите число для вычисления факториала"));

        LambdaInterface<Integer, Integer> factorial = i -> {
            int factor = 1;
            for (int j = 1; j <= i; j++){
                factor *= j;
            }
            return factor;
        };
        System.out.println("Факториал числа " + number2 + " = " + factorial.work(number2));

        System.out.println();
        System.out.println("************** 3 ****************");
        System.out.println();

        LambdaInterface<String, String> upperStringLambda = s -> s.toUpperCase();
        LambdaInterface<String, String> upperStringLink = String::toUpperCase;

        System.out.println("Перевод в верхний регистр лямбда выражением: " + upperStringLambda.work("Hello!"));
        System.out.println("Перевод в верхний регистр ссылкой на метод: " + upperStringLink.work("Goodbye!"));

        System.out.println();
        System.out.println("************** 4 ****************");
        System.out.println();

        LambdaInterface<String, String> stringNotSpace = s -> s.replace(" ", "");

        System.out.println("Удаление пробелов в строке: " + stringNotSpace.work("Helen Abdel Leon abc array var jMeter Selenium Yaguar"));

        System.out.println();
        System.out.println("************** 5 ****************");
        System.out.println();

        CustomDateTime1 time = new CustomDateTime1(23, 12, 2020, 15, 20, 35);

        LambdaInterface<CustomDateTime1, CustomDateTime1> zeroTime = i -> {
          i.setHour(0);
          i.setMinute(0);
          i.setSecond(0);
          return i;
        };
        System.out.print("Сброс времени в дате " + time);
        System.out.println(" = " + zeroTime.work(time));











    }


}
