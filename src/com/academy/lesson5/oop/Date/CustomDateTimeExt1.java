package com.academy.lesson5.oop.Date;
//Реализовать класс CustomDateTimeExt, который наследуется от класса CustomDateTime
//		Доп поля (private):
//			int ms миллисекунды
//
//		Конструкторы:
//			CustomDateTimeExt() - по умолчанию
//			CustomDateTimeExt(int year, int month, int day, int hour, int minute, int second, int ms) со всеми параметрами
//			CustomDateTimeExt(CustomDateTimeExt customDateTimeExt)копирования
//
//		Методы:
//			set
//			get
//
//			toString
//			equals
//			hashCode
//			getFormattedDate() // 25.01.2017 15:05:35.357

//С возможностью создания даты по умолчанию
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CustomDateTimeExt1 extends CustomDateTime1 {
    private int ms = 0;

    public CustomDateTimeExt1(){ super(); }

    public String getFormattedDate() throws ParseException {
        SimpleDateFormat formatMs = new SimpleDateFormat("SSS");
        String time = Integer.toString(ms);
        Date timeParse = formatMs.parse(time);
        String timeString = formatMs.format(timeParse);
        return super.getFormattedDate() + "." + timeString;
    }

    public CustomDateTimeExt1(int day, int month, int year, int hour, int minute, int second, int ms) {
        super(day, month, year, hour, minute, second);
        this.ms = ms;
    }

    public CustomDateTimeExt1(CustomDateTimeExt1 customDateTimeExt) {
        super();
        this.ms = customDateTimeExt.ms;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomDateTimeExt1 that = (CustomDateTimeExt1) o;
        return ms == that.ms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ms);
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
}
