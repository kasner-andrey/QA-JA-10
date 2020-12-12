package com.academy.lesson06;

public class ComponentMain {
    public static void main(String[] args) {
        Button btn = new Button(12, 23, 18, 56, "hello");
        btn.draw();

        CheckBox checkBox = new CheckBox(56, 56, 87,12, "Good");
        checkBox.yPosition = 12;
        checkBox.draw();

    }
}
