package com.academy.Lesson03.HomeworkRegularExpressions.Task05;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 5 **********");
        System.out.println();

        String regex5 = "^([_A-Za-z0-9-\\+])+([_A-Za-z0-9-]?+)*@([A-Za-z0-9-])+(\\.?[A-Za-z0-9]?+)*(\\.[A-Za-z]{2,})";
        Pattern pattern5 = Pattern.compile(regex5);
        int size5 = 0; //колличество проверяемых рандомных имейлов
        Object[] options4 = new Object[]{"Ввести свой E-mail", "Произвести рандомный подбор E-mail"}; //название кнопок в окне
        int n4 = JOptionPane.showOptionDialog(null, //вызов окна диалога для выбора своего формита числа
                "какое E-mail вы хотите?",
                "Выбор Email",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options4, options4[1]);
        if(n4 == 0) {//если нажата кнопка №1 - "Ввести свое форматированое число"
            //вызов диалогового окна для ввода формата числа пользователя
            String email = JOptionPane.showInputDialog("Введите свой E-mail например test@test.test ");
            System.out.print("Вы ввели " + email); // вывод в консоль введеннго числа
            boolean mach = pattern5.matcher(email).matches();
            System.out.println(" <= Соответствие нужному формату (test@test.test) => " + mach);// вывод в консоль проверки E-mail

        } else {//если нажата другая кнопка - "Произвести рандомный выбор E-mail"
            try {
                //вызов диалогового окна выбора колличества проверяемых разных E-mail
                size5 = Integer.parseInt(JOptionPane.showInputDialog("Введите колличество проверяемых E-mail"));
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!!!");//сообщение, если пользователь ввел не число в диалоговом окне + завершение работы
            }
            for(int i = 0; i < size5; i++){//цикл формирования E-mail
                String randomMail = RandomMail.randomMail(); //вызов метода, где происходит формирование рандомного E-mail
                Matcher matcher = pattern5.matcher(randomMail);
                boolean insert5 = matcher.matches(); //проверка на соответствие формату test@test.test
                String arrow4 = ""; // разделители для визуального отличия верных значений  (упрощение восприятия)
                if(insert5) arrow4 = "   <==================";
                System.out.println(randomMail + " => " + insert5 + arrow4); // собственно вывод сформированных E-mail
            }
        }

    }
}
