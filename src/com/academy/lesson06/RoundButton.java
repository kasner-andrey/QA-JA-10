package com.academy.lesson06;

public class RoundButton extends Button {


    public RoundButton() {
    }

    public RoundButton(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public void draw() {
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
