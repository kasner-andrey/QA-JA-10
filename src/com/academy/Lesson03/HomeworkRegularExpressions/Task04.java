package com.academy.Lesson03.HomeworkRegularExpressions;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//     4) Проверить, число на соответствие формату:
//        цифрые группами по три могут быть разделены запятой, пробелом или символом подчеркивания.
//
//        Примеры:
//        8,205,500 => true
//        8 205 500 => true
//        8_205_500 => true
//        8-205-500 => true
//        1,5826,000 => false (4 цифры)
//        15826 => true
//        1-826,000 => false (разные разделители)
//
public class Task04 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 4 **********");//срабатывает в 98 процентах случаев при рандоме да 100 000 000; и 100% при рандоме до 10 000 000
        System.out.println();

//        String regex4 = "(^\\d+$)|(^\\d\\D\\1\\d{3}\\D\\1\\d{1,3})"; //  \d{3}\D\d{1,3}\D?\d{1,3}?))
        String regex4 = "((\\d+)|(\\d/\\d{3}/\\d{1,3}/?.*)|(\\d\\*\\d{3}\\*\\d{1,3}\\*?.*)|(\\d-\\d{3}-\\d{1,3}-?.*)|" +
                "(\\d_\\d{3}_\\d{1,3}_?.*)|(\\d\\+\\d{3}\\+\\d{1,3}\\+?.*)|(\\d\\.\\d{3}\\.\\d{1,3}\\.?.*)|(\\d\\s\\d{3}\\s\\d{1,3}\\s?.*)|" +
                "(\\d,\\d{3},\\d{1,3},?.*))"; //регулярка для проверки формата числа
        Pattern pattern4 = Pattern.compile(regex4);
        int size4 = 0; //колличество проверяемых рандомных чисел
        Object[] options4 = new Object[]{"Ввести свое форматированое число", "Произвести рандомный подбор числа и формата"}; //название кнопок в окне
        int n4 = JOptionPane.showOptionDialog(null, //вызов окна диалога для выбора своего формита числа
                "какое число выхотите?",
                "Выбор числа",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options4, options4[1]);
        if(n4 == 0) {//если нажата кнопка №1 - "Ввести свое форматированое число"
            //вызов диалогового окна для ввода формата числа пользователя
            String number = JOptionPane.showInputDialog("Введите свой формат числа например 8,265,459 ");
            System.out.print("Вы ввели " + number); // вывод в консоль введеннго числа
            boolean mach = pattern4.matcher(number).find();
            System.out.println(" <= Соответствие нужному формату (NNN,NNN,NNN) => " // вывод в консоль проверки формата числа
                    + mach);
        } else {//если нажата другая кнопка - "Произвести рандомный выбор форматов чисел"
            try {
                //вызов диалогового окна выбора колличества проверяемых разных форматов чисел
                size4 = Integer.parseInt(JOptionPane.showInputDialog("Введите колличество проверяемых форматов"));
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!!!");//сообщение, если пользователь ввел не число в диалоговом окне + завершение работы
            }
            for(int i = 0; i < size4; i++){//цикл формирования чисел
                StringBuilder formatNumber = numberFormat(); //вызов метода, где происходит формирование рандомного числа в рандомном формате
                Matcher matcher = pattern4.matcher(formatNumber);
                boolean insert4 = matcher.find(); //проверка на соответствие формату NNN,NNN,NNN
                String arrow4 = ""; // разделители для визуального отличия верных значений  (упрощение восприятия)
                if(insert4) arrow4 = "   <=";
                System.out.println(formatNumber + " => " + insert4 + arrow4); // собственно вывод сформированных значений
            }
        }
    }
    // метод для создания рандомного формата рандомной даты для задания №4
    private static StringBuilder numberFormat(){
        String[] arrows = {" ", ",", ".", "/", "-", "_", "+", "*", ""};
        StringBuilder formatNumber = new StringBuilder();
        String number =Integer.toString((int) ( Math.random() * 10000000));
        int random = (int) (Math.random() * 100);
        int element = (int) (2 + Math.random() * 3);
        String arrow1 = arrows[(int) (Math.random() * 9)];
        String arrow2 = arrows[(int) (Math.random() * 9)];
        String arrow3 = arrows[(int) (Math.random() * 9)];
        for(int i = 0; i < number.length(); i++) {
            if(i == number.length() - 1){
                formatNumber.append(number.charAt(i));
                continue;
            }
            if (random < 70 && i == 0) formatNumber.append(number.charAt(i)).append(arrow1);
            else if (random < 70 && i < 4) {
                formatNumber.append(number.charAt(i));
                if (i == 3) formatNumber.append(arrow1);
            } else if (random < 70 && i < 7) {
                formatNumber.append(number.charAt(i));
                if (i == 6) formatNumber.append(arrow1);
            } else if (random < 70 && i < 10) formatNumber.append(number.charAt(i));

            if (random > 69 && random < 85 && i == 0) formatNumber.append(number.charAt(i)).append(arrow1);
            else if (random > 69 && random < 85 && i < 4) {
                formatNumber.append(number.charAt(i));
                if (i == 3) formatNumber.append(arrow2);
            } else if (random > 69 && random < 85 && i < 7) {
                formatNumber.append(number.charAt(i));
                if (i == 6) formatNumber.append(arrow3);
            }else if(random > 69 && random < 85 && i < 10) formatNumber.append(number.charAt(i));

            if (random > 84 && random < 100 && i == 0) formatNumber.append(number.charAt(i)).append(arrow1);
            else if (random > 84 && random < 100 && i < 1 + element) {
                formatNumber.append(number.charAt(i));
                if (i == element) formatNumber.append(arrow1);
            } else if (random > 84 && random < 100 && i < 1 + element * 2) {
                formatNumber.append(number.charAt(i));
                if (i == element * 2) formatNumber.append(arrow1);
            }else if(random > 84 && random < 100 && i < 10) formatNumber.append(number.charAt(i));
        }
        return formatNumber;
    }
}
