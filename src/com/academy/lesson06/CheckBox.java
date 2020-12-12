package com.academy.lesson06;

public class CheckBox extends Button {
    protected Boolean checked;



    @Override
    public void draw() {
        super.draw();
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
