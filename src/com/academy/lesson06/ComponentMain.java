package com.academy.lesson06;

import java.awt.*;

public class ComponentMain {


    public static void main(String[] args) {
//        Button btn = new Button(12, 23, 18, 56, "hello");
//        btn.draw();
//
//        CheckBox checkBox = new CheckBox(56, 56, 87,12, "Good");
//        checkBox.yPosition = 12;
//        checkBox.draw();
        Button button = new Button();
        label label = new label();
        CheckBox chekBox = new CheckBox();
        RoundButton roundButton = new RoundButton();

        Component[] arrayComp = {button, label, chekBox, roundButton};

        for(int i = 0; i < arrayComp.length; i++){
            arrayComp[i].draw();
        }

    }
}
