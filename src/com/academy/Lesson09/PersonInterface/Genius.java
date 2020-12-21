package com.academy.Lesson09.PersonInterface;

public class Genius extends Person1 implements Coder, Fighter, Dancer{

    @Override
    public void coding() {
        System.out.println("Coding - Genius");

    }

    @Override
    public void dance() {
        System.out.println("Dance - Genius");

    }

    @Override
    public void fight() {
        System.out.println("Fight - Genius");

    }
}
