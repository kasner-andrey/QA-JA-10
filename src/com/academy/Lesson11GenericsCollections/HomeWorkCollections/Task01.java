package com.academy.Lesson11GenericsCollections.HomeWorkCollections;

import java.util.ArrayList;
import java.util.List;

//1) Дан массив имен: {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max}
//	a) Создать список List из элементов массива и вывести на экран
//	b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
//	c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
//	d) Поменять имя Helen на Elizabet
//	e) Отсортировать имена по алфавиту и вывести на экран
//	f) Отсортировать имена в обратном порядке и вывести имена на экран
//	g) Перевести все первые символы в верхний регистр
//	h) Вывести все имена, начинающиеся на букву A
//	i) Проверить, содержит ли список имя Andry
//	j) Удалить из списка все имена кроме Kate и Helen
public class Task01 {
    public static void main(String[] args) {
        System.out.println("*************** Task 01 - A ****************");//a) Создать список List из элементов массива и вывести на экран
        List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Helen");
        list.add("Andry");
        list.add("Abdel");
        list.add("Kate");
        list.add("Veronica");
        list.add("Leonid");
        list.add("Alex");
        list.add("Max");
        System.out.println("List<String> list = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - B ****************");//	b) Добавить 3 новых имени в список (Philip, Joseph, Leon) и вывести весь список на экран
        list.add("Philip");
        list.add("Joseph");
        list.add("Leon");
        System.out.println("List<String> list + 3 name = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - C ****************");//	c) Удалить из списка все имена: Veronica, Leonid и вывести на экран
        list.remove("Veronica");
        list.remove("Leonid");
        System.out.println("List<String> list - 2 name = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - D ****************");//	d) Поменять имя Helen на Elizabet
        int index = list.indexOf("Helen");
        list.set(index, "Elizabet");
        System.out.println("List<String> list set Helen at Elizabet = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - E ****************");//	e) Отсортировать имена по алфавиту и вывести на экран
        list.sort((l1, l2) -> {
            if(l1.charAt(0) < l2.charAt(0)) return -1;
            if(l1.charAt(0) > l2.charAt(0)) return 1;
            return 0;
        });
        System.out.println("list.sort( Алфавитный порядок ): -> " + list);
        System.out.println();

        System.out.println("*************** Task 01 - F ****************");//	f) Отсортировать имена в обратном порядке и вывести имена на экран
        list.sort((l1, l2) -> {
            if(l1.charAt(0) < l2.charAt(0)) return 1;
            if(l1.charAt(0) > l2.charAt(0)) return -1;
            return 0;
        });
        System.out.println("list.sort( Обратный алфавитному порядку ): -> " + list);
        System.out.println();

        System.out.println("*************** Task 01 - G ****************");//	g) Перевести все первые символы в верхний регистр ( лучше в нижний регистр!!)
        for(int i = 0; i < list.size(); i++){
            String firstLetter = "";
            for(int ii = 0; ii < list.get(i).length(); ii++){
                if(ii == 0) firstLetter += Character.toString(list.get(i).charAt(ii)).toLowerCase();
                else firstLetter += Character.toString(list.get(i).charAt(ii));
            }
            list.set(i, firstLetter);
        }
        System.out.println("list первые символы маленькие = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - H ****************");//	h) Вывести все имена, начинающиеся на букву A
        System.out.print("Все имена, которые начинаются на \"А\" = ");
        for (String s : list) {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'A')
                System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("*************** Task 01 - I ****************");//	i) Проверить, содержит ли список имя Andry
        System.out.println("Проверка на наличие имени \"Andry\" = " + list.contains("andry"));
        System.out.println();

        System.out.println("*************** Task 01 - J ****************");//	j) Удалить из списка все имена кроме Kate и Leon
        int ii = 0;
        for(int i = 0; list.size() > 2; i++){
            if(list.get(ii).equals("kate") || list.get(ii).equals("leon") ) {
                ii++;
            }else list.remove(list.get(ii));
        }
        System.out.println(list);
    }
}





