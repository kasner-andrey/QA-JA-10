package com.academy.lesson5.oop.Date;
//Перечисление для представления дней недели
//		Реализовать перечисление "День недели": Понедельник, Вторник, ...
//		В перечислении "День недели" добавить методы получения дня "завтра" next() и "вчера" before().
//		Протестировать перечисление в функции main() тестового класса.
public enum DayWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    DayWeek next(){
        int value;
        if(ordinal() + 1 > values().length - 1){
            value = 0;
        }else value = ordinal() + 1;
        DayWeek nextDay = values()[value];
        return nextDay;
    }

    DayWeek before(){
        int value;
        if(ordinal() - 1 < 0){
            value = values().length - 1;
        } else value = ordinal() - 1;
        DayWeek backDay = values()[value];
        return backDay;
    }


}
