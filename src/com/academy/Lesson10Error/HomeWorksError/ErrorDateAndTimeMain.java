package com.academy.Lesson10Error.HomeWorksError;
//1)
//	a) Создать класс IllegalDateException, который является
//		наследником класса RuntimeException.
//
//	b) Модифицировать класс CustomDate, добавив в конструктор
//		выбрасывания исключения IllegalDateException при
//		попытки создать некорректную (не существующую дату)
//
//	c)  протестировать работу конструктора на позитивных кейсах:
//		- new CustomDate(1, 1, 2012);
//		- new CustomDate(17, 2, 2019);
//		- new CustomDate(29, 2, 2020);
//		- new CustomDate(31, 1, 1999);
//		- new CustomDate(13, 6, 1681);
//
//
//		протестировать работу конструктора на негативных кейсах, т.е.
//			ожидаем выбрасывания исключения:
//
//		- new CustomDate(-1, 1, 2012); 	// отрицательный день
//		- new CustomDate(31, 2, 2019); 	// большое значение для дня
//		- new CustomDate(29, 2, 2019); 	// не высокосный год
//		- new CustomDate(31, 13, 1999); // 13 месяца не существует
//		- new CustomDate(0, 06, 1681); 	// нулевого дня не существует

//a) Создать класс IllegalTimeException, который является
//		наследником класса RuntimeException.
//
//	b) Модифицировать класс CustomDateTime, добавив в конструктор
//		выбрасывания исключения IllegalTimeException при
//		попытки создать некорректную (не существующее время)
//
//	c)  протестировать работу конструктора на позитивных кейсах:
//		- new CustomDateTime(..., 12, 12, 12,);
//		- new CustomDateTime(..., 23, 1, 1);
//		- new CustomDateTime(..., 0, 0, 0);
//		- new CustomDateTime(..., 23, 59, 59);
//
//
//		протестировать работу конструктора на негативных кейсах, т.е.
//			ожидаем выбрасывания исключения:
//
//		- new CustomDateTime(..., -12, 12, 12); 	// отрицательный минуты не суще-ет
//		- new CustomDateTime(..., 23, 1, 60); 		// большое значение для секунды
//		- new CustomDateTime(..., 24, 0, 0); 		// большое значение для часа
//		- new CustomDateTime(..., 23, 60, 0); 		// большое значение для минуты

import javax.swing.*;

public class ErrorDateAndTimeMain {
    private static int day = 1;
    private static int month = 1;
    private static int year = 1999;
    private static int hour = 0;
    private static int minute = 0;
    private static int second = 0;

    public static void main(String[] args) {
        ErrorDateAndTimeMain frame = new ErrorDateAndTimeMain();
        frame.frameDateOrTime(0);
        CustomDateError date = new CustomDateError();
        try {
            date = new CustomDateError(day, month, year);
        } catch (IllegalDateException e) {
            frame.errorMess(day + "." + month + "." + year + " - " + e);
        }
        try {
            date.setYear(year);
        } catch (IllegalDateException e) {
            frame.errorMess("setYear: " + year + " - " + e);
        }
        try {
            date.setMonth(month);
        } catch (IllegalDateException e) {
            frame.errorMess("setMonth: " + month + " - " + e);
        }
        try {
            date.setDay(day);
        } catch (IllegalDateException e) {
            frame.errorMess("setDay: " + day + " - " + e);
        }

        JOptionPane.showMessageDialog(null,
                "Конечная верная дата: "  + date,
                "Дата",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Конечная верная дата: "  + date);

        System.out.println("****** Проверка времени ********");

        frame.frameDateOrTime(1);
        CustomDateTimeError time = new CustomDateTimeError();
        try {
            time = new CustomDateTimeError(hour, minute, second);
        } catch (IllegalTimeException e) {
            frame.errorMess(hour + ":" + minute + ":" + second + " - " + e);
        }
        try {
            time.setHour(hour);
        } catch (IllegalTimeException e) {
            frame.errorMess("setHour: " + hour + " - " + e);
        }
        try {
            time.setMinute(minute);
        } catch (IllegalTimeException e) {
            frame.errorMess("setMinute: " + minute + " - " + e);
        }
        try {
            time.setSecond(second);
        } catch (IllegalTimeException e) {
            frame.errorMess("setSecond: " + second + " - " + e);
        }

        JOptionPane.showMessageDialog(null,
                "Конечная верная дата и время: " + time,
                "Дата и Время",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Конечная верная дата и время: " + time);
  }

  private void errorMess(String message){
      JOptionPane.showMessageDialog(null,
              message,
              "Ошибка в дате или времени",
              JOptionPane.ERROR_MESSAGE);
      System.out.println(message);
  }

  private void frameDateOrTime(int i) {
      Object[] options;
      String message;
      String title;
        if (i == 0){
            options = new Object[]{"Ввести свою дату", "Выбрать валидную дату", "Выбрать не валидную дату"};
            message = "Какую дату Вы хотите?";
            title = "Выбор даты";
        }
        else {
            options = new Object[]{"Ввести свое время", "Выбрать валидное время", "Выбрать не валидное время"};
            message = "Какое время Вы хотите?";
            title = "Выбор времени";
        }

        int n = JOptionPane.showOptionDialog(null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        if(n == 0) ownDate(i);
        else if(n == 1) validDate(i);
        else notValidDate(i);
    }
    private void ownDate(int i){
        String message;
        String title;
        String oneJOptionPane;
        String twoJOptionPane;
        String threeIOptionPane;
        String delimiter;
        if( i == 0){
            oneJOptionPane = "день";
            twoJOptionPane = "месяц";
            threeIOptionPane = "год";
            delimiter = ".";

        } else {
            oneJOptionPane = "час";
            twoJOptionPane = "минуту";
            threeIOptionPane = "секунду";
            delimiter = ":";
        }
        String dayOrHour = JOptionPane.showInputDialog("Введите " + oneJOptionPane);
        if (dayOrHour.length() > 1) dayOrHour = dayOrHour.substring(0, 2);
        String monthOrMinute = JOptionPane.showInputDialog("Введите " + twoJOptionPane);
        if (monthOrMinute.length() > 1) monthOrMinute = monthOrMinute.substring(0, 2);
        String yearOrSecond = JOptionPane.showInputDialog("Введите " + threeIOptionPane);
        if (yearOrSecond.length() > 4) yearOrSecond = yearOrSecond.substring(0, 4);
        if (i == 0) {
            message = "Вы ввели дату: " + dayOrHour + delimiter + monthOrMinute + delimiter + yearOrSecond;
            title = "Дата";
        } else {
            message = "Вы ввели время: " + dayOrHour + delimiter + monthOrMinute + delimiter + yearOrSecond;
            title = "Время";
        }
        JOptionPane.showMessageDialog(null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(message);
        setDateOrTime(dayOrHour + delimiter + monthOrMinute + delimiter + yearOrSecond, i);
    }
    private void validDate(int i){
        String[]options;
        String title;
        String message;
        String own;
        if(i == 0){
            options = new String[]{"01.01.2012", "17.02.2019", "29.02.2020", "31.01.1999", "13.06.1681", "23.02.1985"};
            title = "Выбор валидной даты";
            message = "Выберите валидную дату";
            own = "Вы выбрали валидную дату: ";
        } else {
            options = new String[]{"12:12:12", "23:1:1", "0:0:0", "23:59:59", "15:06:45", "21:35:35"};
            title = "Выбор валидного времени";
            message = "Выберите валидное время";
            own = "Вы выбрали валидное время: ";
        }
        String dateOrTime = (String)JOptionPane.showInputDialog(null,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[2]);
        System.out.println(own + dateOrTime);
         setDateOrTime(dateOrTime, i);
    }
    private void notValidDate(int i){
        String[]options;
        String title;
        String message;
        String own;
        if(i == 0){
            options = new String[]{"-1.01.2012", "31.02.2019", "29.02.2019", "31.13.1999", "0.06.1681"};
            title = "Выбор не валидной даты";
            message = "Выберите не валидную дату";
            own = "Вы выбрали не валидную дату: ";
        } else {
            options = new String[]{"-12:12:12", "23:1:60", "24:0:0", "23:60:0", "24:60:60"};
            title = "Выбор не валидного времени";
            message = "Выберите не валидное время";
            own = "Вы выбрали не валидное время: ";
        }
        String dateOrTime = (String)JOptionPane.showInputDialog(null,
                message,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[2]);
        System.out.println(own + dateOrTime);
        setDateOrTime(dateOrTime, i);
    }
    private static void setDateOrTime(String dateOrTime, int i){
        if (i == 0){
            try {
                String[] number = dateOrTime.split("\\.");
                day = Integer.parseInt(number[0]);
                month = Integer.parseInt(number[1]);
                year = Integer.parseInt(number[2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Вы ввели какой-то бред!!!",
                        "Ошибка в дате",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                String[] number = dateOrTime.split(":");
                hour = Integer.parseInt(number[0]);
                minute = Integer.parseInt(number[1]);
                second = Integer.parseInt(number[2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Вы ввели какой-то бред!!!",
                        "Ошибка во времени",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
