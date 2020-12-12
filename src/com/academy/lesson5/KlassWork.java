package com.academy.lesson5;

import java.util.Arrays;

public class KlassWork {
    public static void main(String[] args) {
        String data = "18 999 ₴, 29 999 ₴, 19 499 ₴, 26 555 ₴, 22 999 ₴, 27 777 ₴, 36 399 ₴, 23 349 ₴, 57 777 ₴";
        String[] arrayPrice = data.split(" ₴, ");
        int number = 0;
        int[] arrayPriceInt = new int[arrayPrice.length];
        int k = -1;

        for(int i = 0; i < arrayPrice.length; i++){
                String item = arrayPrice[i];
                item = item.replace(" ", "");
                item = item.replace("₴", "");
                number = Integer.parseInt(item);
                arrayPriceInt[i] =number;
                }
        Arrays.sort(arrayPriceInt);
        System.out.println(Arrays.toString(arrayPriceInt));
            }
        }




