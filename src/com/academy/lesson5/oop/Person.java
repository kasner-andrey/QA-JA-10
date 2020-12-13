package com.academy.lesson5.oop;

////Реализовать класс Person:
////		поля
////			firstName; 	// строка
////			lastName; 	// строка
////			age;		// целый тип
////			gender;		// символ 'm' - male 'f' - female
////
////		конструкторы:
////			без параметров
////			со всеми параметрами
////
////		методы:
////			get(); // для всех полей
////			set(); // для всех полей
////			getProfile(); // возвращает строку с информаций об человеке
////
////2) Создать массив размера 10, состоящий из классов Person
////	- наполнить массив значениями
////	- *наполнить случайными данными
////	- вывести информацию о всех абонентах в массиве
////	- вывести только женщин, у которых возраст от 30 до 40 лет.

public class Person {
    private String firstName;
    private    String lastName;
    private    int age;
    private char gender;

    //constructor
    public Person(){
        System.out.println("Not parameters");
    }

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    //methods
    public String getProfile(){
        String personInfo = this.firstName + " " + this.lastName + " " + this.age + " " + this.gender;
        return (personInfo);

    }

//Get

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    //Set


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
