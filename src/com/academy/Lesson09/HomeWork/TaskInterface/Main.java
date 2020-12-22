package com.academy.Lesson09.HomeWork.TaskInterface;
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


public class Main {
    public static void main(String[] args) {

        Subscriber[] subscriber = new Subscriber[100];

        for (int i = 0; i < subscriber.length; i++) {
            subscriber[i] = new Subscriber();
            int maleFemale = (int) (Math.random() * 101);
            if (maleFemale <= 50) {
                subscriber[i].setFirstName(ManFirstName.values()[(int)(Math.random() * 16)].name());
                subscriber[i].setLastName(ManLastName.values()[(int)(Math.random() * 15)].name());
                subscriber[i].setAge((int) (4 + Math.random() * 86));
                subscriber[i].setGender(Gender.MALE);
            } else {
                subscriber[i].setFirstName(WomanFirstName.values()[(int)(Math.random() * 20)].name());
                subscriber[i].setLastName(WomanLastName.values()[(int)(Math.random() * 16)].name());
                subscriber[i].setAge((int) (4 + Math.random() * 86));
                subscriber[i].setGender(Gender.FEMALE);
            }
            System.out.println("**** Subscriber " + (i + 1) + " ****");
            System.out.println(subscriber[i]);
        }
    }
}
