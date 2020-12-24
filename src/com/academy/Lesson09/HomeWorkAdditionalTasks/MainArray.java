package com.academy.Lesson09.HomeWorkAdditionalTasks;
//a) интерфейс ArrayExt (расширaемый массив), кот.
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
public class MainArray {
    public static void main(String[] args) {
        Object[] objects;
        objects = new Object[]{1, 23, "pp", 59, "DDD", 9, null};

        ArrayExtImpl array = new ArrayExtImpl(objects);
        System.out.println("Размер созданного масива: " + array.size());
        System.out.println();
        System.out.println("Массив " + array);
        System.out.println("Элемент по индексу \"2\": " + array.get(2));
        System.out.println("Элемент по индексу которого нет \"-3\": " + array.get(-3));
        System.out.println("Элемент по индексу которого нет \"20\": " + array.get(20));
        System.out.println();
        System.out.print("Добавка элемента в конец вассива элемент \"9999\":  ");
        array.add(9999);
        System.out.println(array);
        System.out.println("Добавка элемента в конец вассива при отсутствии места элемент \"Kasner\": ");
        array.add("Kasner");
        System.out.println(array);
        System.out.println("Добавка элемента на позицию index элемент \"Andrey\": ");
        array.add(3, "Andrey");
        System.out.println(array);
        System.out.println("Удаление элемента по индексу индекс \"2\": ");
        array.remove(2);
        System.out.println(array);
        //Где происходит добавление элемента в массив, массив проходит проверку на длинну и наличие значений null, и при отсутствии места соэдается новый массив.












    }
}
