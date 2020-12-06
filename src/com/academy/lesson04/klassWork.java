package com.academy.lesson04;

import java.util.Arrays;

public class klassWork {
    public static void main(String[] args) {
        char letter = 'a';
        for( char i = 65; i < 91; i++){
            System.out.print(" " + i);
        }
        System.out.println();

        for(char symb = 'a'; symb <= 'z'; symb++){
            System.out.print(" " + symb);
        }
        System.out.println();
        for(int i = 'A'; i <= 'Z'; i++){
            System.out.print(" " + (char)(i));
        }
//сравнение массивов.
        String[] words1 = {"One", "Two", "Three"};
        String[] words2 = {"One", "Two", "Three"};
        //System.out.println(Arrays.equals());

        int n1 = 12;
        Integer n2 = 12;
        n2.byteValue();

        long l1 = 123L;
        Long l2 = 123L;
        l2 = l1;
        l1 = l2;
        l2 = Long.valueOf(l1);//длинная запись

        // над примитивными
        l1 = n1;
        n1 = (int)l1;
// над обертками
        //расширение
        l2 = n2.longValue();
        l2 = (long)n2;

        //сужение
        n2 = l2.intValue();

        // ссылочный тип дает дополнительный функционал

        Character symb1 = 'a';
        Character symb2 = '5';
        System.out.println(Character.isAlphabetic(symb1));// поверка явл ли символ алфавитом True
        System.out.println(Character.isDigit(symb2));//проверка явл ли символ цифрой True

        //СТРОКИ

        String firstName = "Peter";
        String secondName = "Kasner";

        String hello = "Hello World!!!!";
        System.out.println(hello.length());
        System.out.println(hello.charAt(2));//взфть букву 3
        String world = hello.substring(6);// от символа 6 и до конца строки вымет
        System.out.println(world);
        String onlyWord = hello.substring(6, 11);// от 6 до 10 11 не включается
        System.out.println(onlyWord);

        System.out.println("***************************************");

        String item = "id24_12345_vtr_234";
        int firstIndex = item.indexOf("_");
        int lastIndex = item.indexOf("_", 5);

        System.out.println(firstIndex);
        String numberPart = item.substring(firstIndex + 1, lastIndex);
        System.out.println(numberPart);
        int index = "123fjdh".indexOf("_");// если символа нет, возвращает -1
        System.out.println(index);
        int index2 = "123fjdh".indexOf("fj");
        System.out.println(index2);

        System.out.println("*****************************************");
        //Сравнение строк

        String str1 = "hello";
        String str2  = "hello";
        String str3 = "Hello World";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);//так строки сравнивать нельзя
        System.out.println(str1 == str3);//так строки сравнивать нельзя

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //для ссылочных типов нужно использовать метод .equals два знака == работает для примитивных данных.

        //замена подстроки

        String msg = "   Hello Helen!!!   ";
        String ChangeMsg = msg.replaceAll("!!!", "??? YJw");

        System.out.println(msg);
        System.out.println(ChangeMsg);

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println("'" + msg + "'");
        System.out.println("'" + msg.trim() + "'");//убирает пробелы вначале и в конце

        String demoString = "One,Two,Three";
        String[] parts = demoString.split(",");
        System.out.println(Arrays.toString(parts));
        String tmp = Arrays.toString(parts);
        String joined = tmp
                .replaceAll("\\[", "")
                .replaceAll("]", "");
               // .replaceAll();


        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        for (String track : tracks) {
            int ind = track.indexOf("_");
            String number = track.substring(ind + 1);
            //System.out.println(number);

            int numberInt = Integer.parseInt(number);
            if (numberInt >= 10 && numberInt <= 15) {
                System.out.println(numberInt);
            }
        }
        System.out.println("Entered ");

        String str = "as cd dfg cd hcdf cd hg hg cd cd cd";
        String substr = "cd";
        int k = 0;
        int str9 = 0;
        int q = 0;

        for (int i = 0; i < str.length(); i++){
            str9 = str.indexOf( "cd", k) ;
//System.out.println(k + "*");
//            System.out.println(str2 + "__");
            if ( str9 > 0){
                k = str9+2;
                //System.out.println(k);
                q++;
            }
        }

        System.out.println(q);















    }
}
