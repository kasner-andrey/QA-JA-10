package com.academy.lesson06.Component;

import com.academy.lesson06.Component.Button;

public class RoundButton extends Button {

    public RoundButton() {

    }

    public RoundButton(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

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
        return "RoundButton{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }
}
