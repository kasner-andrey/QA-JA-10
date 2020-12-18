package com.academy.lesson5.oop.Date;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        Gender gender = Gender.MALE;

        if(gender == Gender.MALE){
            System.out.println("Mane");
        }else System.out.println("Genshina");

        System.out.println("********************************");

        switch (gender){
            case MALE:
                System.out.println("Mane");
                break;
            case FEMALE:
                System.out.println("Genshina");
                break;
        }

        //Трюки

        System.out.println("порядковый номер enum");
        System.out.println(Gender.FEMALE.ordinal());

        System.out.println("Массив");
        Gender[] genders = Gender.values();
        System.out.println(Arrays.toString(genders));

        System.out.println("enum из строки");
        Gender gender2 = Gender.valueOf("FEMALE");
        System.out.println(gender2);

        System.out.println("*******************************");
        System.out.println(gender2.getRu());








    }
}
