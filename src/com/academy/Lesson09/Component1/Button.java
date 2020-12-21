package com.academy.Lesson09.Component1;

public class Button extends Component {
    protected String text;



    public Button(String text) {
        super();
    }

    public Button(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    public Button() {
    }

    public String getProfile(){
        return super.getProfile() + "\n" + text;
    }

    @Override
    public void draw() {
        System.out.println("draw(): Button");
    }

    public void click(){

    }

    @Override
    public String toString() {
        return getProfile();
    }
}
