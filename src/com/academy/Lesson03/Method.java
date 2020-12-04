package com.academy.Lesson03;

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
//        int n1 = 1;
//        int n2 = 4;
//        int sum = n1 + n2;
//        int sum2 = sum(9, 4);
//        System.out.println(sum);
//        System.out.println(sum2);
       reverseNumbers(32, 56, 74, 47, 985, 7767);
       rNumbers(23, 5657, 767);





    }

    //метод суммы переход в метод F7 - в дебагере.
    public  static  int sum(int arg1, int arg2){
        int sum = arg1 + arg2;
        return  sum;//возврат результата
    }



    //метод выводит 3 аргумента.
    public  static  void  reverseNumbers(int... numbers){//воспринимает как массив
        System.out.println(Arrays.toString(numbers));
    }

    public  static  void  rNumbers(int arg1, int arg2, int arg3){//воспринимает как массив
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
