package com.academy.Lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    //коллекция множества хранит только уникальные значения
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(44);
        set.add(23);
        set.add(656);
        System.out.println(set);

        List<Integer> integetherList = new ArrayList<>();
        integetherList.add(1);
        integetherList.add(2);
        integetherList.add(44);
        integetherList.add(3);
        integetherList.add(5);
        integetherList.add(2);
        integetherList.add(44);

        Set<Integer> integetherSet = new HashSet<>(integetherList);
        System.out.println(integetherSet);

    }
}
