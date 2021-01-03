package com.academy.Lesson10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigMain {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("743676438734673464786786437467473");
        BigInteger result = number.add(new BigInteger("668734687474478338839929283272398"));
       // BigInteger resultMulti = number.multiply(result);
        System.out.println(number);
        System.out.println(result);
        //System.out.println(resultMulti);

        try {
            BigInteger num = new BigInteger("abc");
        } catch (Exception e) {
            System.out.println("Ќе число!!");
        }


        BigDecimal d1 = new BigDecimal("1");
        BigDecimal d2 = new BigDecimal("3");
        System.out.println(d1.add(d2));
        System.out.println(d1.divide(d2, 50, RoundingMode.FLOOR));

        BigDecimal d3 = new BigDecimal("2");
        BigDecimal d4 = new BigDecimal("2.0");
        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));
        System.out.println(d3.compareTo(d4) == 0);//возвр 0 если равны
        System.out.println(d1.compareTo(d4));// -1 если меньше
        System.out.println(d4.compareTo(d1));// 1 если больше



    }
}
