package com.academy.Lesson11GenericsCollections;

import com.academy.lesson5.oop.Date.Gender;
import com.academy.lesson5.oop.Person;

import java.util.ArrayList;

public class SortMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("three");
        list.add("four");



        ArrayList<String> list2 = new ArrayList<>();
        list.add("One");
        list.add("zero");
        list.add("two");
        list.add("fife");

        list.sort(String::compareTo);
        list2.sort(String::compareTo);

        System.out.println(list.equals(list2));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Vasya", "Ivanov", 25, Gender.MALE));
        people.add(new Person("Vasya1", "Ivanov", 23, Gender.MALE));
        people.add(new Person("Vasya2", "Ivanov", 21, Gender.MALE));

        people.sort(new PersonComparator());
        System.out.println(people);

        //через л€ьбда
        people.sort((o1, o2)->{
            if(o1.getAge() < o2.getAge())
                return -1;
            if(o1.getAge() == o2.getAge())
                return 1;
            return 0;

                });

        //усли интеджер у него есть свой реализованый метот смпадже





    }


}
