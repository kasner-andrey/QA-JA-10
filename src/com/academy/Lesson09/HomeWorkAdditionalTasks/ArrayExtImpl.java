package com.academy.Lesson09.HomeWorkAdditionalTasks;
//1) Создать
//	a) интерфейс ArrayExt (расширяемый массив), кот.
//		содержит следующие методы:
//			Object get(int index) - возращает элемент по индексу (индексация с нуля)
//			int size() - длина массива
//			void add(Object el) - добавляет элемент в конец массива
//			void add(int index, Object el) - добавляет элемент на позицию index
//			void remove(int index) - удаляет элемент из массива по индексу, оставшиеся элементы сдвигает
//
//	б) класс ArrayExtImpl, реализующий интерфейс ArrayExt
//		переопределить методы:
//			toString()
//			equals()
//
//	Класс ArrayExtImpl хранит все элементы в массиве (приватное поле)
//	При создании класса начальный размер массива = 10
//	(либо размер задается в конструкторе)
//
//	Если при добавлении элемента размера массива недостаточно для хранения, то
//	создать новый массив на 10 элементов больше предыдущего и скопировать все
//	значения
//
//	в) проверить работу класса ArrayExtImpl
//
//2)** Создать метод
//	String alignment(String str, int width)
//	который выравнивает заданную строку по ширине, растягивая пробелы
//	(аналог выравнивания по ширине word)

import java.util.Arrays;

public class ArrayExtImpl<array> implements ArrayExt {
    private Object[] array;

    public ArrayExtImpl(Object[] array) {
        if (array.length < 1) this.array = new Object[10];
        else this.array = array;
    }

    @Override
    public int size() {
        return array.length;
    }

    private boolean IndexValidation(int index) {
        if (index > array.length) {
            System.out.println("Индекс больше длинны массива");
            return true;
        } else if (index < 0) {
            System.out.println("Индекс имеет отрицательное значение");
            return true;
        } else return false;
    }

    @Override
    public Object get(int index) {//возращает элемент по индексу (индексация с нуля)
        if (IndexValidation(index)) return null;
        return array[index];
    }

    private void newArray(Object[] array, Object el) {
        this.array = new Object[array.length + 10];
        for (int i = 0; i < this.array.length; i++) {
            if (i == array.length)
            {
                this.array[i] = el;
                break;
            }
            this.array[i] = array[i];
        }
    }

    @Override
    public void add(Object el) {//добавляет элемент в конец массива
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                array[i] = el;
                break;
            } else j++;
        }
        if(j == array.length) newArray(array, el);
    }

    @Override
    public void add(int index, Object el) {//добавляет элемент на позицию index
        if (IndexValidation(index)) return;
        Object[] item1 = {" "};
        Object[] item2 = {" "};
        item1[0] = array[index];
        for (int i = index; i < array.length; i++) {
            if(i == index){
                array[i] = el;
                continue;
            }
            item2[0] = array[i];
            array[i] = item1[0];
            item1[0] = item2[0];
            if (item1[0] == null) return;
            else if(i == array.length - 1){
                newArray(array, item1[0]);
                return;
            }
        }
    }

        @Override
        public void remove (int index){//удаляет элемент из массива по индексу, оставшиеся элементы сдвигает
            if (IndexValidation(index)) return;
            for (int i = index; i < array.length; i++){
                if(i + 1 == array.length) array[i] = null;
                else array[i] = array[i + 1];

            }
        }

        @Override
        public String toString () {
            String str = "";
            for (Object a : array) {
                str += a + ", ";
            }
            return str;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ArrayExtImpl<?> arrayExt = (ArrayExtImpl<?>) o;
            return Arrays.equals(array, arrayExt.array);
        }

        @Override
        public int hashCode () {
            return Arrays.hashCode(array);
        }
    }

