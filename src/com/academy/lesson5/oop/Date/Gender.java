package com.academy.lesson5.oop.Date;

public enum Gender {
    MALE("Мужчина"),
    FEMALE("Женщина");

    private String ru;

    Gender(String ru){
        this.ru = ru;
    }

    public String getRu() {
        return ru;
    }

    public  void  saySomething(){
        if(this == MALE){
            System.out.println("Я мужик!");
        }else System.out.println("Я Баба!");
    }
}
