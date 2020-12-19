package com.academy.Lesson09.Component1;

import com.academy.lesson06.Component.Button;

public class CheckBox extends Button {
    protected Boolean checked;

    public CheckBox() {
    }

    public CheckBox(Boolean checked) {
        this.checked = checked;
    }

    public CheckBox(int xPosition, int yPosition, int width, int height, String text, Boolean checked) {
        super(xPosition, yPosition, width, height, text);
        this.checked = checked;
    }

    @Override
    public void draw() {
        System.out.println("draw(): CheckBox");
    }

    @Override
    public void click() {
        super.click();
    }

    public boolean isChecked(){
        return checked;
    }

    @Override
    public String toString() {
        return "CheckBox{" +
                "checked=" + checked +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }
}




