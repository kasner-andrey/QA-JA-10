package com.academy.Lesson09Interface.Component1;

public interface VisualComponent {

    public void draw();


    default void draw3D() {
        System.out.println("VisualComponent - draw3D: ");


    }
}
