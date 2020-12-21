package com.academy.Lesson09.PersonInterface;

//3) Разработать следующую иерархию.
//	а) Интерфейсы:
//		- Fighter
//				метод fight();
//		- Coder
//				метод coding();
//		- Dancer
//				метод dance();
//
//	б) Классы:
//		- Person (уже разработан на занятии)
//		- Boxer, наследник от Person и реализует интерфейс Fighter
//		- Programmer, наследник от Person  и реализует интерфейс Coder
//		- Tester наследник от Person и также реализует интерфейс Coder
//		- Choreographer, наследник Person от и реализует интерфейс Dancer
//		- Genius, наследник от Person и реализует все три интерфейса
//
//	в) Создать массив из Person - group и заполнить случайными типами данными (Boxer, Programmer, Choreographer, Genius).
//		 Перебрать массив и посчитать сколько в группе танцоров, тестировщиков, бойцов и гениев.,

public class PersonInterfaceMain {
    public static void main(String[] args) {
        Fighter fighter = new Boxer();
        Coder programmer = new Programmer();
        Dancer dancer = new Choreographer();
        Coder tester = new Tester();

        System.out.println("******************************************");

        Object[] array = {dancer, programmer, fighter, tester};

        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Dancer){
                ((Dancer) array[i]).dance();
            }
        }
        System.out.println("**********************************");

        Coder[] arrCoder = {tester, programmer};

        for (int i = 0; i < arrCoder.length; i++){
                arrCoder[i].coding();
            }

        Person1[] people = {new Boxer(), new Programmer(), new Choreographer(), new Genius()};
        System.out.println(people.toString());

//создание случайного массива group.
        Person1 fighter1 = new Boxer();
        Person1 programmer1 = new Programmer();
        Person1 dancer1 = new Choreographer();
        Person1 tester1 = new Tester();
        Person1 genius = new Genius();

        Person1[] arrRandom = {dancer1, programmer1, fighter1, tester1, genius}; //массим для случайного выбора
        int dancerInt = 0;
        int boxerInt = 0;
        int programmerInt = 0;
        int geniusInt = 0;
        int testerInt = 0;
//создание массива размером от 10 до 100 элементов
        Person1[] group = new Person1[(int) (10 + Math.random() * 90)];
        System.out.println("массив размером " + group.length + " элементов.");
        for(int i = 0; i < group.length; i++) {
            group[i] = arrRandom[(int) (0 + Math.random() * 5)]; //наполнение массива
            //System.out.println(i + 1 + "" + group[i]);
           if (group[i] instanceof Choreographer){
                dancerInt++;
            }else if(group[i] instanceof Boxer){
                boxerInt++;
            }else if(group[i] instanceof Tester){
                testerInt++;
            }else if(group[i] instanceof Programmer){
                programmerInt++;
            }else {
                geniusInt++;
            }
        }
        System.out.println("Колличество танцоров: " + dancerInt +
                "\nКолличество боксеров: " + boxerInt +
                "\nКолличество программистов: " + programmerInt +
                "\nКолличество тестеров: " + testerInt +
                "\nКолличество ГЕНИЕВ: " + geniusInt
        );
    }
}

