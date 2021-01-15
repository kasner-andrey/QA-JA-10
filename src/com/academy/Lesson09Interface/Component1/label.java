package com.academy.Lesson09Interface.Component1;

public class label extends Component {

    public label() {
    }

    @Override
    public void draw3D() {
        System.out.println("-----------------");
        System.out.print("// ");
        System.out.print("Label - draw3D");
        System.out.println(" //");
        System.out.println("------------------");
    }

    public label(int xPosition, int yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    public String getProfile(){
        return super.getProfile() + "Label";
    }

    @Override
    public void draw() {
        System.out.println("draw(): label");
    }

    @Override
    public String toString() {
        return getProfile();
    }
}
