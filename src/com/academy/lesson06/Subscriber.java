package com.academy.lesson06;

import java.util.Objects;

public class Subscriber extends Person {
    private String phoneNumber;
    private KlassWork operator;

    public Subscriber(){

    }

    public Subscriber(
            String phoneNumber,
            KlassWork operator,
            String firstName,
            String lastName,
            int age,
            char gender){
        super(firstName, lastName, age, gender);//конструктор базового класса должен быть
        // первым super() обращение к конструктору базового класса
       this.phoneNumber = phoneNumber;
       this.operator = operator;


    }



    @Override
    public  String getProfile(){
//        String personInfo = firstName + " " + lastName + " " + age + " " + gender + " " + gender + " " + gender;
//        return (personInfo);// чтоб сделать наследование в базовом классе нужно ставить не private a protected
        String personInfo = super.getProfile() + " " + phoneNumber + " " + operator;//можно оставить поля private
        return (personInfo);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public KlassWork getOperator() {
        return operator;
    }

    //тустринг можно сгенерировать альт + инсерт


    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", operator=" + operator +
                '}';
    }

    //переписываем сравнение
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return phoneNumber.equals(that.phoneNumber) &&
                operator.equals(that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, operator);
    }
}
