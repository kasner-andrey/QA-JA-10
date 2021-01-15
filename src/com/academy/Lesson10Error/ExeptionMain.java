package com.academy.Lesson10Error;

public class ExeptionMain {
    public static void main(String[] args) {
        double d1 = 1;
        double d2 = 0;
        double result;
        try {
            //потенциально опасный код
            result = div(d1, d2);
            System.out.println(result);
        } catch (DivisionByZeroError e) {
            //обработка ошибки
            System.out.println("Error: DivisionByZeroError");
            System.out.println("Details: " + e.getMessage());
        }

        System.out.println("FINISH");





        int n1 = 1;
        int n2 = 0;
        try {
            int result1 = div(1, 0);
            System.out.println(result1);
        } catch (Exception e) {
            System.out.println("Common error");
            System.out.println("detail: " + e.getLocalizedMessage());
        }

        System.out.println("Finish");
        //System.out.println(n1/n2);
        System.out.println("**************************");
        Person person = new Person();
        try {
            person.setAge(-5);

        } catch (NegtiveAgeError | TooBigAgeError e) {
            if(e instanceof NegtiveAgeError) System.out.println("¬озраст отрицательный");
            if(e instanceof TooBigAgeError) System.out.println("столько не живут");
        }

        try {
            person.setAge(143);
        } catch (NegtiveAgeError e) {
            System.out.println("¬озраст отрицательный");
        } catch (TooBigAgeError e) {
            System.out.println("столько не живут");
        }


        try {
            person.setAge(24);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            person.setAge(80);
        } catch (TooBigAgeError tooBigAgeError) {
            tooBigAgeError.printStackTrace();
        }

        System.out.println(person.getAge());
        System.out.println("FINISH PERSON");
    }

    public static double div(double d1, double d2) throws DivisionByZeroError{
        if(d2 == 0) throw new DivisionByZeroError("Unsupported DivisionByZeroError");
        return  d1/d2;
    }

    public static int div(int n1, int n2){
        return n1/n2;
    }


}
