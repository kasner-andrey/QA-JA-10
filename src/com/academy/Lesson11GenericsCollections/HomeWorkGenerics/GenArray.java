package com.academy.Lesson11GenericsCollections.HomeWorkGenerics;

//1) Создать обобщенный класс GenArray, который:
//	a) хранит элементы массива параметризированного типа.
//		Размер массива постоянен во все время существования экземпляра класса и инициализируется во время создания
//		(в конструктор передается конкретный массив: public GenArray(Integer[] array) {...}
//
//	b)	Реализовать методы:
//			T get(int index) - который вернет элемент массива
//			void set(int index, T element), который установит элемент массива
//			перегрузить методы toString() и equals();
//
//	c)	Бросать исключения, если index выходит за пределы допустимого диапазона
//
//2) Создать тесты GenArrayTests, в которых:
//	a) Протестировать работу методов
//	b) Протестировать работу при некорректном индексе массива, перехватывая исключение


import java.util.Arrays;

public class GenArray<TypeArray> {

    private TypeArray[] array;

    public GenArray(TypeArray[] array) {
        this.array = array;
    }

    public TypeArray get(int index) throws Exception{
        if(index >= array.length) throw new Exception("Индекс больше размера массива");
        else if(index < 0) throw new Exception("Индекс меньше 0");
        else return array[index];
    }

    public void set(int index, TypeArray element) throws Exception{
        if(index >= array.length) throw new Exception("Индекс больше размера массива");
        else if(index < 0) throw new Exception("Индекс меньше 0");
        else  array[index] = element;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < array.length; i++){
            if(i == array.length - 1) result += array[i] + " ]";
            else result += array[i] + ", ";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenArray<?> genArray = (GenArray<?>) o;
        return Arrays.equals(array, genArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
