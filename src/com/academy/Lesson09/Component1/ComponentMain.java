package com.academy.Lesson09.Component1;

//a) Создать массив типа Component (10 элементов), элементы которого могут любые потомки этого класса
//		(Button, Label, CheckBox, RoundButton - см. иерархию в презентации)
//		Component[] components = ...
//
//
//	b) Наполнить массив:
//		(экземплярами классов Button, Label, CheckBox, RoundButton)
//
//	с) В цикле вывести все элемены Component на экран
//	d) В цикле перебрать массив Component и вывести только Button и его потомков

public class ComponentMain {
    public static void main(String[] args) {

        Component button = new Button(12, 25, 163, 235, "Button string");
        Component label = new label(23, 56, 55, 89, "label String");
        Component chekBox = new CheckBox(45, 56, 56, 56 , "ChekBox String", true);
        Component roundButton = new RoundButton(56, 45, 54, 69, "RoundButton String");

        Component[] arrayComp = {button, label, chekBox, roundButton, label, chekBox, button, roundButton, label, chekBox};
        System.out.println("**************************** Все компоненты **********************************");
        System.out.println();

        for(int i = 0; i < arrayComp.length; i++){
            System.out.println(arrayComp[i]);
            arrayComp[i].draw();
            System.out.println("***********************************************************************");
        }

        System.out.println();
        System.out.println("**************************** Button и его потомки ***************************");
        System.out.println();

        for (Component component : arrayComp) {
            if(component instanceof Button){
                System.out.println(component);
                component.draw();
                System.out.println("************************************************************************");
            }
        }

        //



    }
}
