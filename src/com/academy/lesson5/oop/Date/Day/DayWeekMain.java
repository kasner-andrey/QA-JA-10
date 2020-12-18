package com.academy.lesson5.oop.Date.Day;
//Перечисление для представления дней недели
//		Реализовать перечисление "День недели": Понедельник, Вторник, ...
//		В перечислении "День недели" добавить методы получения дня "завтра" next() и "вчера" before().
//		Протестировать перечисление в функции main() тестового класса.
public class DayWeekMain {
    public static void main(String[] args) {

        System.out.println("***** next() *****");
        System.out.println();

        DayWeek dayWeek1 = DayWeek.MONDAY;
        DayWeek dayWeek2 = DayWeek.SUNDAY;
        DayWeek dayWeek3 = DayWeek.THURSDAY;

        System.out.println("***** начало недели ****");
        System.out.println("MONDAY -> " + dayWeek1.next());

        System.out.println("***** воскресенье - понедельник *****");
        System.out.println("SUNDAY -> " + dayWeek2.next());

        System.out.println("***** середина недели *****");
        System.out.println("TUESDAY -> " + dayWeek3.next());
        System.out.println();
 //**********************************************************************
        System.out.println("***** before() *****");
        System.out.println();

        System.out.println("***** понедельник - воскресенье *****");
        System.out.println("MONDAY -> " + dayWeek1.before());

        System.out.println("***** конец недели ****");
        System.out.println("SUNDAY -> " + dayWeek2.before());

        System.out.println("***** середина недели *****");
        System.out.println("TUESDAY -> " + dayWeek3.before());











    }
}
