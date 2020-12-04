package com.academy.Lesson03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class klassWork {
    public static void main(String[] args) {
//*******************************************************************************
        //        int a = 10;
//        int b = 5;
//        int actualResult = a + b;
//        int extected = 10;
//
//
//        assert actualResult == extected;
//        System.out.println("FINISH");
        //дляпроверок кода (программа падает если проверка не проходит) для отладки программы.
//*********************************************************************************
        // для обрезки количества знаков после запятой %.2f даже жля double.
//        double duble = 0.875748393;
//        System.out.println(String.format("lalalalalala %.2f", duble));
//**************************************************************************************
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//        int summ = 0;
//        System.out.print("Sum number " + number + " = (");
//        for (int i = 1; i <= number; i++){
//            summ = summ + i;
//            if(i==number){
//                System.out.print(i);
//            }else{
//                System.out.print(i + " + ");
//            }
//        }
//        System.out.println(") = " + summ);

//********************************************************************************
//                                 Массивы
//                int[] numbers = new int[5];
//                numbers[0] = 3;
//                numbers[1] = 9;
//                numbers[2] = 4;
//                numbers[3] = 67;
//                numbers[4] = 155;
//                for (int i = numbers.length - 1; i >= 0; i--){
//                    System.out.println(numbers[i]);
//                }
//        System.out.println("Random 0 - 10");
//
//        Random random = new Random();
//                double[] numbersDouble1 = new double[10];
//
//                for (int i = numbersDouble1.length - 1; i >= 0; i--){
//                    numbersDouble1[i] = random.nextDouble() * 10;
//                }
//        System.out.println("Array = " + Arrays.toString(numbersDouble1));
//        System.out.println();
//        System.out.println("*****************************************************");
//        System.out.println();
//        System.out.println("Random 10 - 100");
//        double[] numbersDouble2 = new double[8];
//
//        for (int i = numbersDouble2.length - 1; i >= 0; i--){
//            numbersDouble2[i] = 10 + random.nextDouble() * 90;
//        }
//        System.out.println("Array = " + Arrays.toString(numbersDouble2));
//
        //для ограничения рандома random.nextInt(bound: 100) только "ИНТ" щт 0 до 99 включительно



        //System.out.println(Arrays.toString(numbers));


        int[][] array = new int[3][2];
        array[1][0] = 5;
        array[2][1] = 10;
        System.out.println(Arrays.deepToString(array));//для вывода вложенных массивов
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
            for (int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }













    }
}
