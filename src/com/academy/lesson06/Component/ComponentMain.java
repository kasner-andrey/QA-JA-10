package com.academy.lesson06.Component;

//a) ������� ������ ���� Component (10 ���������), �������� �������� ����� ����� ������� ����� ������
//		(Button, Label, CheckBox, RoundButton - ��. �������� � �����������)
//		Component[] components = ...
//
//
//	b) ��������� ������:
//		(������������ ������� Button, Label, CheckBox, RoundButton)
//
//	�) � ����� ������� ��� ������� Component �� �����
//	d) � ����� ��������� ������ Component � ������� ������ Button � ��� ��������

public class ComponentMain {
    public static void main(String[] args) {

        Button button = new Button(12, 25, 163, 235, "Button string");
        label label = new label(23, 56, 55, 89, "label String");
        CheckBox chekBox = new CheckBox(45, 56, 56, 56 , "ChekBox String", true);
        RoundButton roundButton = new RoundButton(56, 45, 54, 69, "RoundButton String");

        Component[] arrayComp = {button, label, chekBox, roundButton};
        System.out.println("**************************** ��� ���������� **********************************");
        System.out.println();

        for(int i = 0; i < arrayComp.length; i++){
            System.out.println(arrayComp[i]);
            arrayComp[i].draw();
            System.out.println("***********************************************************************");
        }

        System.out.println();
        System.out.println("**************************** Button � ��� ������� ***************************");
        System.out.println();

        for (Component component : arrayComp) {
            if(component instanceof Button){
                System.out.println(component);
                component.draw();
                System.out.println("************************************************************************");
            }
        }



    }
}
