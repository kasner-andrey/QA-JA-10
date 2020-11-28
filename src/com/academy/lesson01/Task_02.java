package com.academy.lesson01;

public class Task_02 {
    public static void main(String[] args) {
        if (args.length == 1) {
            String preFix = args[0];
            //String postFix = args[1];
            System.out.println(preFix + " -- Привет!");
            System.out.println(preFix + " -- Это моя первая программа. Я пишу на Java.");
            System.out.println(preFix + " -- Программировать - это интересно.");
            System.out.println(preFix + " -- Моя цель - научится писать автотесты и применять их.");
        } else if (args.length == 2){
            String preFix = args[0];
            String postFix = args[1];
            System.out.println(preFix + " -- Привет! -- " + postFix);
            System.out.println(preFix + " -- Это моя первая программа. Я пишу на Java. -- " + postFix);
            System.out.println(preFix + " -- Программировать - это интересно. -- " + postFix);
            System.out.println(preFix + " -- Моя цель - научится писать автотесты и применять их. -- " + postFix);

        } else {
            System.out.println("Привет!");
            System.out.println("Это моя первая программа. Я пишу на Java.");
            System.out.println("Программировать - это интересно.");
            System.out.println("Моя цель - научится писать автотесты и применять их.");
        }
    }
}
