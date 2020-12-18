package com.academy.lesson06;

public class Button extends Component {


    public Button() {
    }

    public Button(int xPosition, int yPosition, int width, int height, String text) {
        super.xPosition = xPosition;
        super.yPosition = yPosition;
        super.width = width;
        super.height = height;
        super.text = text;
    }

    @Override
    public void draw() {
        System.out.println("---------------------------");
        System.out.println("Button extend Component ");
        System.out.println("------------------------------");
    }

    public void click(){

    }


    //    @Override
//    public void draw() {
//
//    }
//
//    //    @Override
////    public void draw(){
////
////    }
//


}
