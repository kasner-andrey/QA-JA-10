package com.academy.Lesson09.HomeWork.TaskInterface;

import java.util.Objects;

//4) Доработать класс Subscriber. Поля класса:
//	firstName (имя)
//	lastName (фамилия)
//	gender (пол)
//	age (возраст)
//
//	Создать массив из 100 абонентов, заполнив все поля случайными данными:
//		- пол (мужч или женщ)
//		- возраст (от 4 - 90)
//		- имя (если женщина - случайное женское имя)
//		- фамилия (женская или мужская)
//
//	Фамилии и имена использовать из след. списков:
//		мужские фамилии: Смирнов,Иванов,Кузнецов,Попов,Соколов,Лебедев,Козлов,Новиков,Морозов,Петров,Волков,Соловьёв,Васильев,Зайцев,Павлов
//		мужские имена: Архип,Болеслав,Марат,Семён,Юлиан,Сергей,Нифонт,Максим,Евгений,Геннадий,Володар,Ждан,Марк,Григорий,Леонид,Олег
//		женские фамилии: Ковалёва,Ильина,Гусева,Титова,Кузьмина,Кудрявцева,Баранова,Куликова,Алексеева,Степанова,Яковалева,Сорокина,Сергеева,Романова,Захарова,Борисова,
//		женские имена: Виктория,Дария,Арина,Зоя,Лиза,Мария,Надя,Раиса,Тамара,Октябрина,Рая,Роза,Нелли,Милана,Любовь,Леся,Каролина,Зинаида,Карина,Клавдия

public class Subscriber {

    private String firstName = "123";
    private String lastName = "236";
    private Gender gender;
    private int age;

    public Subscriber() {
    }

    public String getProfile(){
        return "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "gender=" + gender + "\n" +
                "age=" + age;
    }

    public Subscriber(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age);
    }

    @Override
    public String toString() {
        return getProfile();
    }
}
