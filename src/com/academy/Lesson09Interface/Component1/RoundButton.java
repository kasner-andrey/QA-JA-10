package com.academy.Lesson09Interface.Component1;



public class RoundButton extends Button {

    public RoundButton() {

    }

    public RoundButton(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    public String getProfile(){
        return super.getProfile() + "\nRoundButton";
    }

//    @Override
//    public void draw3D() {
//        super.draw3D();
//    }

    @Override
    public void draw() {
        System.out.println("draw(): RoundButton");
    }

    @Override
    public void click() {
        super.click();
    }

    @Override
    public String toString() {
        return getProfile();
    }
}
