package com.academy.Lesson09Interface.PersonInterface;


class Choreographer extends Person1 implements Dancer{

    @Override
    public void dance() {
        System.out.println("Choreographer");
    }
}
