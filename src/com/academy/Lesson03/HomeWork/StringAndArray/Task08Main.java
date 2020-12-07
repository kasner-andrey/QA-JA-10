package com.academy.Lesson03.HomeWork.StringAndArray;

import javax.swing.*;

//8) Реализовать программу, которая:
//	- в диалоговом режиме запрашивает размер массива
//	- заполняет массив случайными числами (целые числа)
//	- меняет порядок элементов массива
//	- сортирует массив
//	- выводит исходный массив
//	- выводит перевернутый массив
//	- выводит отсортированный массив
public class Task08Main {
    public static void main(String[] args) {
        String sizeArray = JOptionPane.showInputDialog("Enter size Array");
        Task08Method.InputValidation(sizeArray);
        System.exit(0);
    }
}
