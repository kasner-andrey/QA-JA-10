package com.academy.Lesson07;

import com.academy.lesson06.Person;
import com.academy.lesson06.Subscriber;

import java.sql.Array;
import java.util.Arrays;

public class PolymorphismMain {
    public static void main(String[] args) {
        Long L1 = 23L;
        Integer I1 = 10;

        L1 =I1.longValue();

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        Object[] arr2 = {1, "two", 3};
        System.out.println(Arrays.toString(arr2));

        Person subscriber = new Subscriber(); //Слева должен быть класс родителя, с права наследник
        //Subscriber sub1 = subscriber;//так нельзя приводить тип
        Subscriber sub = (Subscriber) subscriber; //явное приведение типов расширение родительского класса
        subscriber.setFirstName("Peter");
        subscriber.setLastName("Helen");
        subscriber.setGender('m');
        System.out.println(subscriber.getProfile());

        //чтобы создать массив из классов, необходимо определить у классов общего предка Person[] arr = {subscriber, boxer, musician}если теку
        // если текущий элимент (Person тип Музыкант ) нужно найти instanceof возвращает true если так.




    }

}
