package com.academy.Lesson09.Component1;

import com.academy.lesson06.Component.Component;

public class label extends Component {

    public label() {
    }

    public label(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public void draw() {
        System.out.println("draw(): label");
    }

    @Override
    public String toString() {
        return "label{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }
}
