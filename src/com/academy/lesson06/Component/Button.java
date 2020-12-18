package com.academy.lesson06.Component;

public class Button extends Component {


    public Button() {
        super();
    }

    public Button(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public void draw() {
        System.out.println("draw(): Button");
    }

    public void click(){

    }

    @Override
    public String toString() {
        return "Button{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }
}
