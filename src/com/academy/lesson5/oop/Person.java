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

import com.academy.lesson5.oop.Date.Gender;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    //constructor
    public Person(){
        System.out.println("Not parameters");
    }

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String vasya, String ivanov, int age, com.academy.Lesson09.HomeWork.TaskInterface.Gender male) {
    }

    //methods
    public String getProfile(){
        String personInfo = this.firstName + "\n" + this.lastName + "\n" + this.age + "\n" + this.gender;
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

    public Gender getGender() {
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
