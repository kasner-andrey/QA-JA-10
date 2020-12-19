package com.academy.Lesson09.Anonymous;

import com.academy.Lesson09.Component1.Button;
import com.academy.Lesson09.Component1.VisualComponent;
import com.academy.Lesson09.PersonInterface.Coder;

public class AnonumousMain {
    public static void main(String[] args) {
        //VisualComponent component = new Button("Login");

        // анонимный класс, живет пока живет переменная comp!
        VisualComponent comp = new VisualComponent() {
            @Override
            public void draw() {
                System.out.println("Anonym : custom component");
            }
        };
//1 способ реализации интерфейса с одним методом через анонимный класс
// анонимный класс, живет пока живет переменная для кодера!
        Coder customCoder = new Coder() {
            @Override
            public void coding() {
                System.out.println("new Coder Anonymous");
            }
        };

        customCoder.coding();

////2 способ реализации интерфейса с одним методом через лямбда выражения
// Лямбда выражения
        customCoder = ()-> System.out.println("Coder lambda");
        customCoder.coding();


  // Лямбда для метода в интерфейсе
        Interface2 oper1 = (i1, i2)-> i1 + i2;
        Interface2 oper2 = (i1, i2)-> i1 * i2;

        System.out.println(oper1.calc(3, 5));
        System.out.println(oper2.calc(6, 4));

        StringInterface strOper = s->s.toUpperCase();
        StringInterface srtOper2 = String::toUpperCase;


        System.out.println(strOper.oper("Hello"));
        System.out.println(srtOper2.oper("Dosvidos"));

        VoidString str2 = s -> System.out.println(s);
        VoidString str3 = System.out::println;

        str2.sout("Helllllllo!!!!");
        str3.sout("Zdarova!!");














    }

}
