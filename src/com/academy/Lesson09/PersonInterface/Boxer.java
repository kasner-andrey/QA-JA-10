package com.academy.Lesson09.PersonInterface;

public class Boxer extends Person1 implements Fighter{
    @Override
    public void fight() {
        System.out.println("Boxer");
    }


}
