package com.academy.Lesson09.Component1;

public class InterfaceMain01 {
    public static void main(String[] args) {
        //1) Добавить в иерархию классов Component новый интерфейс VisualComponent
//	унаследовать класс Component от VisualComponent
//	(Component implements VisualComponent)
//
//	Интерфейс VisualComponent должен иметь один метод:
//		- void draw();
//
//		-продемонстрировать работу метода draw() у всех компонентов

        Component button = new Button();
        Component checkBox = new CheckBox();
        Component label = new label();
        Component roundButton = new RoundButton();

        System.out.println("*************** draw у всех компонентов ***********");
        roundButton.draw();
        checkBox.draw();
        label.draw();
        button.draw();

//2) Добавить новый метод по умолчанию в VisualComponent
//		- default void draw3D();
//		- перекрыть метод draw3D у Label
//		- продемонстрировать работу метода draw3D() во всех компонентах

        System.out.println("*************** draw3D у всех компонентов Label - перекрыт ***********");

        roundButton.draw3D();
        checkBox.draw3D();
        label.draw3D();
        button.draw3D();


















    }
}
