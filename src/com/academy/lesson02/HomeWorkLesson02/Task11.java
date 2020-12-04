package com.academy.lesson02.HomeWorkLesson02;

import java.util.Scanner;

// Вывести ромб заданной размерности. Пример для размера 3:
//  1
// 121
//12321
// 121
//  1

//работает до цыфры 9, после 10 начинается смещение середины ромба направо.

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Enter number for rhombus: ");
        Scanner scanner = new Scanner(System.in);
        int sizeRhombus = scanner.nextInt();
        int k = sizeRhombus*2;

        for (int i = 1; i < sizeRhombus*2; i++){
            System.out.println();
            k--;
            for(int j = 1; j < sizeRhombus*2; j++){
               if(i <= sizeRhombus){
                   if(j <= sizeRhombus){
                       if(i + j - sizeRhombus < 1){
                           System.out.print(" ");
                       }else{
                           System.out.print(i + j - sizeRhombus);
                       }
                   } else if (j > sizeRhombus){
                       if(sizeRhombus + i - j < 1){
                           System.out.print(" ");
                       }else{
                           System.out.print(sizeRhombus + i - j);
                       }
                   }
               }else if(i > sizeRhombus){
                   if(j <= sizeRhombus){
                       if(k + j - sizeRhombus < 1){
                           System.out.print(" ");
                       }else{
                           System.out.print(k + j - sizeRhombus);
                       }
                   } else if (j > sizeRhombus){
                       if(sizeRhombus + k - j < 1){
                           System.out.print(" ");
                       }else{
                           System.out.print(sizeRhombus + k - j);
                       }
                   }
               }
        }
        }








    }
}
