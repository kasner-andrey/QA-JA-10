package com.academy.lesson5.oop;

public class Button {

    //поля
    public static String Defolt_Text = "def tex";
   private int size; // 0 по умолчанию если не инициализировано
    String text; // null по умолчанию
    //все поля закрываем приватом, методы открываем пабликом


    void  init(){
        size = 20;
        text = "gfhf";
    }

    void init(int size, String text){
        this.size = size;
        this.text = text;
    }

    public void setSize(int size) {
        this.size = size;
    }
//генерация геттер и Сеттер Альт+Инсерт
    public int getSize() {
        return size;
    }

    void setText(String text){
        this.text = text;
    }




    //method
    void printInfo(){
        System.out.println("size: " + size);
        System.out.println("text: " + text);
    }
// конструкторы

    // Button btn = new Button вызов конструктора

    public Button(){
        System.out.println("конструктор класса баттон");
    }

    public Button(int size, String text) {//для задания значений
        this.size = size;
        this.text = text;
    }
}
