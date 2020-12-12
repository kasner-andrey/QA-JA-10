package com.academy.lesson06;

public class DemoPerson {
    public static void main(String[] args) {
        Subscriber subskriber = new Subscriber();
       // subskriber.getFirstName("Петя");
        String profile = subskriber.getProfile();
        System.out.println(profile);


        Subscriber subscr2 = new Subscriber();
        subscr2.setFirstName("Petya");
        subscr2.setLastName("Ivanov");

        System.out.println("**************************************");
        System.out.println(subscr2);

        System.out.println("*********************************");
        KlassWork operatorLife = new KlassWork("Life", "Kiev");
        KlassWork operatorVodafone = new KlassWork("Vodafone", "Kiev");
        KlassWork operatorLife2 = new KlassWork("Life", "Kiev");
        KlassWork operatorLife3 = operatorLife;
        System.out.println(operatorLife == operatorLife2);// сравнение ссылок
        System.out.println(operatorLife.equals(operatorLife3));//для сравнения объектов



    }




}
