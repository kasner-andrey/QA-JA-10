package com.academy.Lesson09.PersonInterface;


class Choreographer extends Person1 implements Dancer{

    @Override
    public void dance() {
        System.out.println("Choreographer");
    }
}
