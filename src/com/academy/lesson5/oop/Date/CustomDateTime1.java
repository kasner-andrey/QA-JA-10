package com.academy.lesson5.oop.Date;
//Реализовать класс CustomDateTime, который наследуется от класса CustomDate.
//		Поля (все поля private):
//			- hour (часы)
//			- minute (минута)
//			- second (секунда)
//
//		Конструкторы:
//			- CustomDateTime() - по умолчанию
//			- CustomDateTime(int year, int month, int day, int hour, int minute, int second) со всеми параметрами
//			- CustomDateTime(CustomDateTime dateTime)копирования
//
//		Методы:
//			- set (для каждого поля)
//			- get (для каждого поля)
//
//			getFormattedDate() (переопределить из базового класса)
//				который отображает время и дату: 25.01.2017 15:05:35
//
//			getFormattedDate(boolean isTimeFormat12)
//				который отображает время и дату в зависимости от флага isTimeFormat12:
//				25.01.2017 3:05 p.m.  // isTimeFormat12 is true
//				25.01.2017 15:05  	  // isTimeFormat12 is false

//		Переопределить методы:
//			toString // отображает дату и время 25.01.2017 15:05:35
//			equals
//			hashCode
//
//		- реализовать метод validate(), который проверяет существование введенного времени
//
//		- использовать метод validate(...)
//			при попытке изменть инициализировать класс с помощью конструктора
//			или при попытке модифицировать поля с помощью методов set
//
//		- реализовать методы
//			nextSecond();
//			nextMinute();
//			nextHour();
//			которые увелечивают на единицу значение секунды, минуты и часа соответственно, при чем если кол-во часов достигается
//			24, то должно увеличиться на единицу значение поля day из базового класса
//
//		-* реализовать метод addSeconds(int seconds), который добавляет указанное кол-во секунд к текущей дате



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
//С возможностью создания даты по умолчанию
public class CustomDateTime1 extends CustomDate1 {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public CustomDateTime1(){
        super();
    }

    public CustomDateTime1(int day, int month, int year, int hour, int minute, int second){
        super(day, month, year);
        if(CustomDateTime1.validate(hour, minute, second)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public CustomDateTime1(CustomDateTime1 dateTime){       //копирования
        super();
        if(CustomDateTime1.validate(dateTime.hour, dateTime.minute, dateTime.second)){
            this.hour = dateTime.hour;
            this.minute = dateTime.minute;
            this.second = dateTime.second;
        }
    }
//Вывод даты и времени
    public String getFormattedDate() throws ParseException { //(переопределить из базового класса) который отображает время и дату: 25.01.2017 15:05:35
        TimeFormat timeFormat = TimeFormat.H24;
        SimpleDateFormat formatTime = new SimpleDateFormat(timeFormat.format());
        String time = hour + ":" + minute + ":" + second;
        Date timeParse = formatTime.parse(time);
        String timeString = formatTime.format(timeParse);
        return super.getFormattedDate() + " " + timeString;
    }
//Валидация
    public static boolean validate(int hour, int minute, int second){
        String time = hour + ":" + minute + ":" + second;
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            formatTime.setLenient(false);
            date = formatTime.parse(time);
        } catch (Exception e) {
            System.out.println("CustomDateTime.validate: Ошибка во времени!");
            return false;
        }
        return  true;
    }
    //а) Создать перечисление "Формат времени" (TimeFormat), в котором определить следующие форматы:
    //		- H12		12 часовой			HH:MM:SS (am|pm)	09:23:45am, 09:23:45pm
    //		- H24		24 часовой			HH:MM:SS			09:23:45,	21:23:45
    //
    //	б)Модифицировать класс CustomDateTime из пред. занятия(ий), для возможности отображения времени в заданном формате:
    //		- public String getFormattedDate() {} // возвращает дату и время в формате по умолчанию: 24.01.2011	21:23:45
    //		- public String getFormattedDate(DateFormat dateFormat, TimeFormat format) {} // возвращает дату и время в заданном форматах
//Вывод даты и времени 12 - 24 часа
    public String getFormattedDate(DateFormat dateFormat, TimeFormat format) throws ParseException {
        TimeFormat timeFormat = TimeFormat.H24;
        SimpleDateFormat formatTime = new SimpleDateFormat(format.format());
        SimpleDateFormat formatParseTime = new SimpleDateFormat(timeFormat.format());
        String time = hour + ":" + minute + ":" + second;
        formatTime.setLenient(true);
        Date timeParse = formatParseTime.parse(time);
        String timeString = formatTime.format(timeParse);
        return super.getFormattedDate(dateFormat) + " " + timeString.toLowerCase();
    }
    //****************************************************************************************************

//Методы Next....
    public void nextSecond() throws ParseException {
        second++;
        if(second > 59){
            second = 0;
            nextMinute();
        }
    }


    public void nextMinute() throws ParseException {
    minute++;
    if(minute > 59){
        minute = 0;
        nextHour();
    }
}

    public void nextHour() throws ParseException {
        hour++;
        if(hour > 23){
            hour = 0;
            nextDate(1);
        }
    }


// вспомогательный метод для методов next...()
    public void nextDate(int day) throws ParseException {
        int nextDay = Integer.parseInt(super.getDay()) + day;
        String date = nextDay + "." + super.getMonth() + "." + super.getYear();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        formatDate.setLenient(true);
        Date dateParse = formatDate.parse(date);
        String nextDate = formatDate.format(dateParse);
        super.setYear(Integer.parseInt(nextDate.substring(6)));
        super.setMonth(Integer.parseInt(nextDate.substring(3, 5)));
        super.setDay(Integer.parseInt(nextDate.substring(0, 2)));
    }

//-* реализовать метод addSeconds(int seconds), который добавляет указанное кол-во секунд к текущей дате
    public void addSeconds(int seconds) throws ParseException {
        int nextSecond = this.second + seconds;
        String timeDate = super.getFormattedDate() + " " + hour + ":" + minute + ":" + nextSecond;
        SimpleDateFormat formatTime = new SimpleDateFormat("dd.MM.yyyy EEEE HH:mm:ss");
        formatTime.setLenient(true);
        Date timeParse = formatTime.parse(timeDate);
        String timeString = formatTime.format(timeParse);
        super.setDay(Integer.parseInt(timeString.substring(0, 2)));
        super.setMonth(Integer.parseInt(timeString.substring(3, 5)));
        super.setYear(Integer.parseInt(timeString.substring(6, 10)));
        setSecond(Integer.parseInt(timeString.substring(timeString.length() - 2)));
        setMinute(Integer.parseInt(timeString.substring(timeString.length() - 5, timeString.length() - 3)));
        setHour(Integer.parseInt(timeString.substring(timeString.length() - 8, timeString.length() - 6)));
    }

//Getters
    public String getHour() throws ParseException {
            String time = Integer.toString(hour);
            SimpleDateFormat timeHour = new SimpleDateFormat("HH");
            Date timeParse = timeHour.parse(time);
            return timeHour.format(timeParse);
    }

    public String getMinute() throws ParseException {
            String time = Integer.toString(minute);
            SimpleDateFormat timeMinute = new SimpleDateFormat("mm");
            Date timeParse = timeMinute.parse(time);
            return timeMinute.format(timeParse);
    }

    public String getSecond() throws ParseException {
            String time = Integer.toString(second);
            SimpleDateFormat timeSecond = new SimpleDateFormat("ss");
            Date timeParse = timeSecond.parse(time);
            return timeSecond.format(timeParse);
    }
//Setters
    public void setHour(int hour) {
        if(CustomDateTime1.validate(hour, minute, second)){
            this.hour = hour;
        } else System.out.println("CustomDateTime.setHour: Не правильный час!");
    }

    public void setMinute(int minute) {
        if(CustomDateTime1.validate(hour, minute, second)){
            this.minute = minute;
        } else System.out.println("CustomDateTime.setMinute: Не правильные минуты!");
    }

    public void setSecond(int second) {
        if(CustomDateTime1.validate(hour, minute, second)){
            this.second = second;
        } else System.out.println("CustomDateTime.setSecond: Не правильные секунды!");
    }

    @Override
    public String toString() {
        String formattedDate = null;
        try {
            formattedDate = getFormattedDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formattedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDateTime1 that = (CustomDateTime1) o;
        return hour == that.hour && minute == that.minute && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }
}
