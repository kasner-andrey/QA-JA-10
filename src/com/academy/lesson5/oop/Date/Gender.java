package com.academy.lesson5.oop.Date;

public enum Gender {
    MALE("�������"),
    FEMALE("�������");

    private String ru;

    Gender(String ru){
        this.ru = ru;
    }

    public String getRu() {
        return ru;
    }

    public  void  saySomething(){
        if(this == MALE){
            System.out.println("� �����!");
        }else System.out.println("� ����!");
    }
}
