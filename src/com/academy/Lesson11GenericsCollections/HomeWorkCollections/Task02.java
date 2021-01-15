package com.academy.Lesson11GenericsCollections.HomeWorkCollections;
//2) List
//	a) создать список целых чисел
//	b) наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
//	c) вывести список на экран
//	d) вывести минимальное, максимально значения
//	e) вывести сумму чисел на экран
//	f) найти наиболее часто встречающееся число, вывести это число и кол-во повторений на экран
//		(если чисел несколько с одинаковой частотой повторений, то вывести минимальное из них)

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("************ Task 02 - A, B, C ****************");//	a) создать список целых чисел
                                                                              //	b) наполнить список случайными целыми числами от 1 до 100 (размер списка 20 элементов)
                                                                              //	c) вывести список на экран
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            numbers.add((int)(1 + Math.random() * 10));
        }
        System.out.println("List numbers = " + numbers);
        System.out.println();

        System.out.println("************ Task 02 - D ****************");//	d) вывести минимальное, максимально значения
        numbers.sort((n1, n2) -> {
            if(n1 > n2) return -1;
            if(n2 > n1) return 1;
            return 0;
        });
        System.out.println("Min = " + numbers.get(numbers.size() - 1));
        System.out.println("Max = " + numbers.get(0));
        System.out.println(numbers);
        System.out.println();

        System.out.println("************ Task 02 - E ****************");//	e) вывести сумму чисел на экран
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum = " + sum);
        System.out.println();

        System.out.println("************ Task 02 - E ****************");//	f) найти наиболее часто встречающееся число, вывести это число и кол-во повторений на экран
        Map<Integer, Integer> repeat = new HashMap<>();                     //	(если чисел несколько с одинаковой частотой повторений, то вывести минимальное из них)
        int result = 0;
        for (int i = 0; i < numbers.size(); i++){
            result = Collections.frequency(numbers, numbers.get(i));
            if(result > 1){
                repeat.put(numbers.get(i), result );
            }
        }
        System.out.println(repeat);
        int maxRepeat = 0;
        for(Integer value: repeat.values()){
            if(value > maxRepeat){
                maxRepeat = value;
            }
        }
        //Map.Entry<Integer, Integer> map = repeat.entrySet();

        System.out.println("число: " + repeat.get(maxRepeat) + " повторяется " + maxRepeat + " раза.");







    }
}
