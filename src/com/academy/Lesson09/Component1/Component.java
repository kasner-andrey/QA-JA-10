package com.academy.Lesson09.Component1;

public class Component implements VisualComponent {
    protected  int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    protected String text;

    public Component(int xPosition, int yPosition, int width, int height, String text) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public Component() {
    }

//    @Override
//    public void draw3D() {
//
//    }

    @Override
    public void draw() {
        System.out.println("draw(): Component");
    }

    public String getProfile(){
        return "xPosition: " + xPosition +
                "\n" + "yPosition: " + yPosition +
                "\n" + "width: " + width +
                "\n" + "height: " + height +
                "\n" + "text: " + text;
    }

    @Override
    public String toString() {
        return getProfile();
    }
}
