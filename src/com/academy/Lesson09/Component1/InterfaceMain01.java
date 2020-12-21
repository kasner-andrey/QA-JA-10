package com.academy.Lesson09.Component1;

public class InterfaceMain01 {
    public static void main(String[] args) {
        //1) �������� � �������� ������� Component ����� ��������� VisualComponent
//	������������ ����� Component �� VisualComponent
//	(Component implements VisualComponent)
//
//	��������� VisualComponent ������ ����� ���� �����:
//		- void draw();
//
//		-������������������ ������ ������ draw() � ���� �����������

        Component button = new Button();
        Component checkBox = new CheckBox();
        Component label = new label();
        Component roundButton = new RoundButton();

        System.out.println("*************** draw � ���� ����������� ***********");
        roundButton.draw();
        checkBox.draw();
        label.draw();
        button.draw();

//2) �������� ����� ����� �� ��������� � VisualComponent
//		- default void draw3D();
//		- ��������� ����� draw3D � Label
//		- ������������������ ������ ������ draw3D() �� ���� �����������

        System.out.println("*************** draw3D � ���� ����������� Label - �������� ***********");

        roundButton.draw3D();
        checkBox.draw3D();
        label.draw3D();
        button.draw3D();


















    }
}
