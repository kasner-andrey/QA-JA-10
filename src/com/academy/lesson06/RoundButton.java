package com.academy.lesson06;

public class RoundButton extends Button {
    @Override
    public void draw() {
        super.draw();
        System.out.println("---------------------------");
        System.out.println("RoundButton extends Button Draw");
        System.out.println("---------------------------");
    }

    @Override
    public void click() {
        super.click();
    }

    //    @Override
//    public void draw(){
//
//    }
}
