package com.academy.Lesson10Error.HomeWorksError;

//1)
//	a) Создать класс IllegalDateException, который является
//		наследником класса RuntimeException.
//
//	b) Модифицировать класс CustomDate, добавив в конструктор
//		выбрасывания исключения IllegalDateException при
//		попытки создать некорректную (не существующую дату)
//
//	c)  протестировать работу конструктора на позитивных кейсах:
//		- new CustomDate(1, 1, 2012);
//		- new CustomDate(17, 2, 2019);
//		- new CustomDate(29, 2, 2020);
//		- new CustomDate(31, 1, 1999);
//		- new CustomDate(13, 6, 1681);
//
//
//		протестировать работу конструктора на негативных кейсах, т.е.
//			ожидаем выбрасывания исключения:
//
//		- new CustomDate(-1, 1, 2012); 	// отрицательный день
//		- new CustomDate(31, 2, 2019); 	// большое значение для дня
//		- new CustomDate(29, 2, 2019); 	// не высокосный год
//		- new CustomDate(31, 13, 1999); // 13 месяца не существует
//		- new CustomDate(0, 06, 1681); 	// нулевого дня не существует

public class IllegalDateException extends RuntimeException {
    private String message;

    public IllegalDateException() {
    }

    public IllegalDateException(String message) {
        this.message = message;
    }

    public String toString(){
        return message;
    }

}
