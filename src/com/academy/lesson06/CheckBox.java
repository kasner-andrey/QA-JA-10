package com.academy.lesson06;

public class CheckBox extends Button {
    protected Boolean checked;

    public CheckBox() {

    }

    public CheckBox(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }


    @Override
    public void draw() {
        System.out.println("---------------------------");
        System.out.println("CheckBox extends Button Draw");
        System.out.println("---------------------------");
    }

    @Override
    public void click() {
        super.click();
    }

    //    public void draw(){
//
//    }
//
//    public void click(){
//
//    }

    public boolean isChecked(){
        return checked;
    }
}
