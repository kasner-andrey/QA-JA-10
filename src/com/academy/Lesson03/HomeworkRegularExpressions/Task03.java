package com.academy.Lesson03.HomeworkRegularExpressions;
//     3) Даты. найти строки сответствующие этому шаблону: YYYY/MM/DD HH:MM(:SS)
//
//        а) 	Проверить дату на соответствие шаблону:
//        Примеры:
//        2012/09/18 12:10 — true
//        2013/09/09 09:09 — true
//        2013/9/09 09:09 — false
//
//        б)* Проверить дополнительно дату на диапазон между 1000 и 2012 годом. Секунды могут быть опущены.
//        (Облегчим задачу: в каждом месяце 30 дней.)
//        Примеры:
//        2012/09/18 12:10 — true
//        2013/09/09 09:09 — false  // (после 2012)

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Task03 {
    public static void main(String[] args) throws ParseException {
        System.out.println();
        System.out.println("********** Task - 3.1 and 3.2 **********");
        System.out.println();

        String regex3A = "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}\\(:\\d{2}\\)"; //регулярка для проверки формата YYYY/MM/DD HH:MM(:SS)
        String regex3B = ".*((1\\d{3})|(200\\d)|(201(0|1|2))).*";// проверка для года 1000 - 2012
        Pattern pattern3A = Pattern.compile(regex3A);
        Pattern pattern3B = Pattern.compile(regex3B);
        int size = 0; //колличество проверяемых рандомных форматов и дат
        Object[] options = new Object[]{"Ввести свой формат даты и времени", "Произвести рандомный выбор форматов дат и времени"}; //название кнопок в окне
        int n = JOptionPane.showOptionDialog(null, //вызов окна диалога для выбора своей даты или рандомной
                "Какую дату Вы хотите?",
                "Выбор вормата даты и времени",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[1]);
        if(n == 0) {//если нажата кнопка №1 - "Ввести свой формат даты и времени"
            //вызов диалогового окна для ввода даты и времени пользователя
            String dateAndTime = JOptionPane.showInputDialog("Введите свой формат даты например 23.06.1988 15:36:45: ");
            System.out.print("Вы ввели " + dateAndTime); // вывод в консоль введенной даты и времени
            System.out.println(" <= Соответствие нужному формату (YYYY/MM/DD HH:MM(:SS)) => " // вывод в консоль проверки формата даты и времени
                    + pattern3A.matcher(dateAndTime).matches()
                    + " <= Проверка на 1000 - 2012 год => "
                    + pattern3B.matcher(dateAndTime).matches());
        } else {//если нажата другая кнопка - "Произвести рандомный выбор форматов дат и времени"
            try {
                //вызов диалогового окна выбора колличества проверяемых разных форматов и дат
                size = Integer.parseInt(JOptionPane.showInputDialog("Введите колличество проверяемых форматов"));
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!!!");//сообщение, если пользователь ввел не число в диалоговом окне + завершение работы
            }
            for(int i = 0; i < size; i++){//цикл формирования дат
                String dateFormat = dateFormat(); //вызов метода, где происходит формирование рандомной даты в рандомном формате
                boolean insert3A = pattern3A.matcher(dateFormat).matches(); //проверка на соответствие формату YYYY/MM/DD HH:MM(:SS)
                boolean insert3B = pattern3B.matcher(dateFormat).matches(); // проверка на соответствие промежутка дат между 1000 годом и 2012 годом
                String arrow3A = ""; // разделители для визуального отличия верных значений  (упрощение восприятия)
                String arrow3B = ""; // тоже, что наверху только для дат между 1000 годом и 2012 годом
                if(insert3A) arrow3A = " <="; //
                if(insert3B){
                    arrow3A = "";
                    arrow3B = " <= Проверка на 1000 - 2012 год => " + insert3B; // формирование строки для соответствия даты между 1000 годом и 2012 годом
                }
                System.out.println(dateFormat + " => " + insert3A + arrow3A + arrow3B); // собственно вывод сформированных значений
//            System.out.println(dateFormat() + " => " + pattern3A.matcher(dateFormat()).matches() + arrow3A + arrow3B + " - 2"); // В этом формате почему-то не работает!!!
            }
        }
    }

    // метод для создания рандомного формата рандомной даты для задания №3
    private static String dateFormat() throws ParseException {
        //список форматов дат и времени европейских государствю в массиве для упрощенного рандомного выбора
        String[] formatDate = {"dd.MM.yyyy hh:mm:ss", "MM-dd-yyyy hh:mm:ss", "dd-MM-yyyy hh:mm:ss", "dd/MM/yyyy hh:mm:ss", "dd.MM.yyyy hh:mm:ss",
                "dd/MM/yyyy hh:mm:ss", "dd/MM/yyyy hh:mm:ss", "yyyy-MM-dd hh:mm:ss", "dd-MM-yyyy hh.mm.ss", "dd/MM/yyyy hh.mm.ss",
                "dd/MM/yyyy hh:mm:ss", "yyyy-MM-dd hh:mm:ss", "dd/MM/yyyy hh:mm:ss", "dd-MM-yyyy hh:mm:ss", "dd.MM.yyyy hh:mm:ss",
                "yyyy-MM-dd hh:mm:ss", "dd-MM-yyyy hh:mm:ss", "dd.MM.yyyy hh.mm.ss", "yyyy-MM-dd hh:mm:ss", "yyyy-MM-dd hh:mm:ss",
                "yyyy-MM-dd hh.mm.ss", "dd.MM.yyyy hh:mm:ss", "yyyy-MM-dd hh:mm:ss", "dd.MM.yyyy hh,mm,ss", "yyyy-MM-dd hh.mm.ss",
                "yyyy/MM/dd hh:mm(:ss)", "yyyy/M/dd hh:mm(:ss)", "yyyy/MM/d hh:mm(:ss)", "yyyy/M/d hh:mm(:ss)", "yyy/MM/dd hh:mm(:ss)"};
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss"); //основной формат для формирования даты из дней
        SimpleDateFormat format = new SimpleDateFormat(formatDate[(int) (Math.random() * 30)]); // формат, выбраный рандомно из массива (всего 29 видов)
        int day = (int) (Math.random() * 1000000); // рандомное колличество дней в колличестве до 1 миллиона (от 0 до 2 739 года)
        int seconds = (int) (Math.random() * 86400); // рандомное колличество секунд (в сутках 86400 секунд)
        // формирование строки из рандомной даты и времени для основного формата даты (например - 568945 дней. 01 месяц. 01 год  и 00 часов: 00 минут: 64800 секунд)
        String dayDate = day + ".01.0001 00:00:" + seconds;
        Date dateParse = date.parse(dayDate); // формирование даты в формат Date (чтобы дни и секунды уложились в числа как надо)
        return format.format(dateParse); //собственно переформатирование рандомной даты в необходимый формат
    }
}
