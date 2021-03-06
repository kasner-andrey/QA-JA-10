package com.academy.lesson06.Component;

public abstract class Component {
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

    public void draw(){
        System.out.println("draw(): Component");
    }
}
