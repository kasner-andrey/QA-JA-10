package com.academy.Lesson03.HomeWork.StringAndArray;

//9) Реализовать программу, которая:
//	- в диалоговом режиме запрашивает размер двумерного массива
//	- в диалоговом режиме считывает элементы массива (дробные трехзначные числа с двумя знаками после запятой)
//	- выводите массив в виде отформатированном виде (оставляя два знака после запятой), напр. для массива размером 3:
//
//		|3.14   2.7    124.45|
//		|15.55  112.76 4.45  |
//		|5      0      -66   |
//
//	- определяет и выводит на экран:
//		-- минимальный элемент (-66)
//		-- максимальный (124.45)
//		-- номер строки, сумма элементов которой максимальна (в данном примере 2-ая строка)
//		-- номер строки, сумма которых минимальна (в данном примере 3)



import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task09Method extends Component {
    public static void OpenWindowSize() {
        Integer[] size = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sizeTwoArray = (Integer) JOptionPane.showInputDialog(null, "Select array size",
                "Array size", JOptionPane.QUESTION_MESSAGE, null, size, size[0]);
        Task09Method.NumberValidation(sizeTwoArray);
        System.exit(0);
    }

    public static void NumberValidation(int sizeInt) {
        String elementsArray = JOptionPane.showInputDialog(
                "Введите дробные числа в колличестве " + (sizeInt * sizeInt) + " штук.\n" +
                        "Если числа будут не корректны или Вы откажетесь, \n" +
                        "произойдет подстановка рандомных значений."
        );
        if (elementsArray.length() == 0) {
            Task09Method.RandomEmpty(sizeInt);

        } else {
            Task09Method.RandomNotNull(sizeInt, elementsArray);
        }
        System.exit(0);
    }

    public static void RandomEmpty(int sizeInt) {
        Random random = new Random();
        Double[][] array = new Double[sizeInt][sizeInt];
        double max = 0;
        double min = 0;
        double maxColumn = 0;
        double maxC = 0;
        int columnMax = 0;
        double maxString = 0;
        double maxS = 0;
        int stringMax = 0;

        for(int i = 0; i < array.length; i++){
            System.out.print("|");
            for (int j = 0; j <array[i].length; j++){
                String one = "";
                String two = " ";
                array[i][j] = -1000 + random.nextDouble() * 2000;
                if(array[i][j] > max){
                    max = array[i][j];
                }
                if(array[i][j] < min){
                    min = array[i][j];
                }
                if(array[i][j] < 100 && array[i][j] > 9){
                    two += " ";
                    one += " ";
                }else if(array[i][j] >=0 && array[i][j] <=9){
                    two += "  ";
                    one += " ";
                } else if(array[i][j] >= 0){
                    one += " ";
                }else if(array[i][j] > -100 && array[i][j] < -10){
                    two += " ";
                }else if(array[i][j] < 0 && array[i][j] > -10){
                    two += "  ";
                }
                System.out.printf("%s%.2f%s", one, array[i][j], two);
            }
            System.out.println("|");
        }

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j <array[i].length; j++) {
                maxS += array[i][j];
                maxC += array[j][i];
            }
            if(maxC > maxColumn){
                maxColumn = maxC;
                columnMax = i + 1;

            }
            if(maxS > maxString){
                maxString = maxS;
                stringMax = i + 1;
            }
            maxC = 0;
            maxS = 0;
        }
        System.out.println();
        System.out.printf("-- Minimum item = %.2f%n", min);
        System.out.printf("-- Maximum item = %.2f%n", max);
        System.out.printf("-- Column number, maximum amount = %s: %.2f%n", columnMax, maxColumn);
        System.out.printf("-- Line number, maximum amount = %s: %.2f%n", stringMax, maxString);
    }

    public static void RandomNotNull(int sizeInt, String elementsArray) {
        Random random = new Random();
        String[] arrayNumbersOneString = new String[sizeInt * sizeInt];
        System.out.println(elementsArray);
        StringBuilder itemArrayString = new StringBuilder();
        int indexItemArrayString = 0;
        double max = 0;
        double min = 0;
        double maxColumn = 0;
        double maxC = 0;
        int columnMax = 0;
        double maxString = 0;
        double maxS = 0;
        int stringMax = 0;
        for(int i = 0; i < elementsArray.length(); i++){
            if(Character.isDigit(elementsArray.charAt(i))){
                itemArrayString.append(elementsArray.charAt(i));

            }else if(elementsArray.charAt(i) == '-' || elementsArray.charAt(i)== '.'){
                itemArrayString.append(elementsArray.charAt(i));

            }else if(!Character.isDigit(elementsArray.charAt(i)) || elementsArray.charAt(i)== ' '){
                arrayNumbersOneString[indexItemArrayString] = itemArrayString.toString();
                indexItemArrayString++;
                itemArrayString = new StringBuilder();
            }
        }
        double[][] array = new double[sizeInt][sizeInt];
        int k = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                try {
                    Double.parseDouble(arrayNumbersOneString[k]);
                }
                catch (NumberFormatException | NullPointerException nfe) {
                    array[i][j] = -1000 + random.nextDouble() * 2000;
                    k++;
                    continue;
                }
                array[i][j] = Double.parseDouble(arrayNumbersOneString[k]);
                k++;
            }
        }
        for (double[] doubles : array) {
            System.out.print("|");
            for (double aDouble : doubles) {
                String one = "";
                String two = " ";
                if (aDouble > max) {
                    max = aDouble;
                }
                if (aDouble < min) {
                    min = aDouble;
                }
                if (aDouble < 100 && aDouble > 9) {
                    two += " ";
                    one += " ";
                } else if (aDouble >= 0 && aDouble <= 9) {
                    two += "  ";
                    one += " ";
                } else if (aDouble >= 0) {
                    one += " ";
                } else if (aDouble > -100 && aDouble < -10) {
                    two += " ";
                } else if (aDouble < 0 && aDouble > -10) {
                    two += "  ";
                }
                System.out.printf("%s%.2f%s", one, aDouble, two);
            }
            System.out.println("|");
        }

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j <array[i].length; j++) {
                maxS += array[i][j];
                maxC += array[j][i];
            }
            if(maxC > maxColumn){
                maxColumn = maxC;
                columnMax = i + 1;

            }
            if(maxS > maxString){
                maxString = maxS;
                stringMax = i + 1;
            }
            maxC = 0;
            maxS = 0;
        }
        System.out.println();
        System.out.printf("-- Minimum item = %.2f%n", min);
        System.out.printf("-- Maximum item = %.2f%n", max);
        System.out.printf("-- Column number, maximum amount = %s: %.2f%n", columnMax, maxColumn);
        System.out.printf("-- Line number, maximum amount = %s: %.2f%n", stringMax, maxString);

    }
}






