package com.academy.Lesson03.HomeWork.StringAndArray;

import java.util.Arrays;
import java.util.Random;

//8) Реализовать программу, которая:
//	- в диалоговом режиме запрашивает размер массива
//	- заполняет массив случайными числами (целые числа)
//	- меняет порядок элементов массива
//	- сортирует массив
//	- выводит исходный массив
//	- выводит перевернутый массив
//	- выводит отсортированный массив
public class Task08Method {
    public static void InputValidation(String size) {
        System.out.println("You entered size: " + size);
        int num = 0;
        int sizeInt = 0;
        for (int i = 0; i < size.length(); i++){
            if (Character.isDigit(size.charAt(i))){
                num++;
            }
        }
        if (num == size.length()){
            sizeInt = Integer.parseInt(size);
            Task08Method.SortAndReverseArray(sizeInt);
        }else {
            System.out.println("Entered symbols is not digits!");
        }
    }

    public static void SortAndReverseArray(int sizeInt) {
        Random rnd = new Random();
        int[] array = new int[sizeInt];
        int[] reverseArray = new int[sizeInt];
        int indexReverse = array.length - 1;
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(100);
            reverseArray[indexReverse] = array[i];
            indexReverse--;
        }
        System.out.println("Your Array: " + Arrays.toString(array));
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray));
        Arrays.sort(array);
        System.out.println("Sort Array: " + Arrays.toString(array));
    }
    //SortAndReverseArray
}
