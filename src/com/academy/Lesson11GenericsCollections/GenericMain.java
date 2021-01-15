package com.academy.Lesson11GenericsCollections;

public class GenericMain {
    public static void main(String[] args) {
        Pair pair = new Pair(10, "string");
        int n = (int)pair.getFirst();
        String str = (String) pair.getSecond();
        System.out.println(n + " -> " + str);

        Pair pair1 = new Pair("string", 10 );
        String n1 = (String) pair1.getFirst();
        int str1 = (int)pair1.getSecond();
        System.out.println(n1 + " -> " + str1);

        System.out.println("*********** Pair2 - Generic **************");

        Pair2<Integer, String> pair2 = new Pair2<>(10, "string");
        int n2 = (int)pair2.getFirst();
        String str2 = (String) pair2.getSecond();
        System.out.println(n2 + " -> " + str2);

        Pair2<String, Integer> pair3 = new Pair2<>("string", 10 );
        String n3 = (String) pair3.getFirst();
        int str3 = (int)pair3.getSecond();
        System.out.println(n3 + " -> " + str3);

        System.out.println("******************** in methods *****************");
            print(1, "Hello");
        System.out.println("******** Ограничения для отброса ненужных значений типов ************");

        double result1 = sum(10, 23);
        double result2 = sum(23.5, 12.4);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("************* ");
        someMethod(pair2);
       // someMethod(pair3); - выдает ошибку так как первый тип должен быть интом или другим числовым

        Pair2<Object, Integer> pair5 = new Pair2<>("[tllo", 32);


    }

    public  static <U, V> void print(U arg1, V arg2){
        System.out.println("first: " + arg1 + " second: " + arg2);
    }

    public static <U extends Number, V extends Number> double sum(U arg1, V arg2){
        return arg1.doubleValue() + arg2.doubleValue();
    }

    public static void someMethod(Pair2<? extends Number, ?> pair2){
        System.out.println(pair2.getFirst() + " : " + pair2.getSecond());
    }




}
