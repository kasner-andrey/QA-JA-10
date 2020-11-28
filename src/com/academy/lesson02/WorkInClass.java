package com.academy.lesson02;

public class WorkInClass {
    public static void main(String[] args) {
//        double x;
//        double y;
//        double z;
//        double result;
//        x = 1.1;
//        y = 3;
//        z = 5;
//        result = z - y - x;
//        System.out.println(result);//резуьтат меньше чем нужно на 2^-52 степени, течность вычисдения double;
//        System.out.println(result * 10/10);

//        var str2 = "pppe";// type String
//        var inter = 123; // type integether
//
//        var str2 = inter;

        //для деления нужно использовать дабл тип, инт при делении отбрасывает дробную часть
//       y++; //сначала выводит значение, а потом пишет туда +1 в переменную.
//       ++y;//добавляет 1 и сохраняет в переменную (выводит готовое добавление)
//
//        final int finalValue = 10; // защита переменной от бноволения данных. нельзя ее изменить нигде.


        int age = 3;

        if(age > 90){
            System.out.println("долгожитель");
        } else if(age > 19 && age < 89){
            System.out.println(" взрослый");
        } else if (age >= 1 && age <19) {
            System.out.println("несовершеннолетний");
        } else {
            System.out.println("неверный возраст");
        }
// работает с отрицательными числами






    }
}
