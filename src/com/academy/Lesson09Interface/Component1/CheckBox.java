package com.academy.Lesson09Interface.Component1;

public class CheckBox extends Button {
    protected Boolean checked;

    public CheckBox() {
    }

//    @Override
//    public void draw3D() {
//        System.out.println("draw3D(): CheckBox");
//    }

    public CheckBox(Boolean checked) {
        this.checked = checked;
    }

    public CheckBox(int xPosition, int yPosition, int width, int height, String text, Boolean checked) {
        super(xPosition, yPosition, width, height, text);
        this.checked = checked;
    }

    public  String getProfile(){
        return super.getProfile() + "\n" + checked;
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
        return getProfile();
    }
}




