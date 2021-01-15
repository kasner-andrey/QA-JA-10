package com.academy.Lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("hello");
        list.add("string");

        String el =  list.get(1);
        int size = list.size();


//        for (int i = 0; i < 100; i++){
//            list.add("oter" + i);
//        }



        System.out.println(list);
        System.out.println(el);
        System.out.println(size);//размер соллекции
        System.out.println(list.contains("two"));//содержит ли коллекция элемент
        list.remove(2);
        list.remove("hello");

        ArrayList<Integer> inter = new ArrayList<>(Arrays.asList(1, 2, 3, 264, 4, 10, 8, 5, 55));
        System.out.println(inter);
        inter.sort((n1,n2) -> {
            if(n1 < n2) return  -1;
            if(n2 < n1) return  1;
            return 0;
        });
        System.out.println(inter);
        inter.sort((n1, n2) -> n1.compareTo(n2));

        System.out.println(inter);
        inter.sort(Integer::compareTo);


        System.out.println(inter);
        inter.remove(2);//по индексу удаление при типе коллекции инт
        System.out.println(inter);
        inter.remove((Integer) 1);//по значению удаление
        System.out.println(inter);



        ArrayList<String> list2 = new ArrayList();
        list2.add("Alen");
        list2.add("Peter");
        list2.add("Ann");
        System.out.println(list2);
        list2.add(String.valueOf(list));


        //сортировка
        list2.sort(String::compareTo);
        System.out.println(list2);










    }
}
