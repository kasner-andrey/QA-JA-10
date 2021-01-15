package com.academy.Lesson11GenericsCollections;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    //коллекция мап нужен для внесения ключ = значение
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(10,"ten");
        map.put(5,"five");

        System.out.println(map);

        map.put(1,"other");
        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(2));//ничего не ложили по 2


    }
}
