package com.academy.lesson04.HomeWorkOOPQvests;
//����������� ����� CustomDateTime, ������� ����������� �� ������ CustomDate.
//		���� (��� ���� private):
//			- hour (����)
//			- minute (������)
//			- second (�������)
//
//		������������:
//			- CustomDateTime() - �� ���������
//			- CustomDateTime(int year, int month, int day, int hour, int minute, int second) �� ����� �����������
//			- CustomDateTime(CustomDateTime dateTime)�����������
//
//		������:
//			- set (��� ������� ����)
//			- get (��� ������� ����)
//
//			getFormattedDate() (�������������� �� �������� ������)
//				������� ���������� ����� � ����: 25.01.2017 15:05:35
//
//			getFormattedDate(boolean isTimeFormat12)
//				������� ���������� ����� � ���� � ����������� �� ����� isTimeFormat12:
//				25.01.2017 3:05 p.m.  // isTimeFormat12 is true
//				25.01.2017 15:05  	  // isTimeFormat12 is false

//		�������������� ������:
//			toString // ���������� ���� � ����� 25.01.2017 15:05:35
//			equals
//			hashCode
//
//		- ����������� ����� validate(), ������� ��������� ������������� ���������� �������
//
//		- ������������ ����� validate(...)
//			��� ������� ������� ���������������� ����� � ������� ������������
//			��� ��� ������� �������������� ���� � ������� ������� set
//
//		- ����������� ������
//			nextSecond();
//			nextMinute();
//			nextHour();
//			������� ����������� �� ������� �������� �������, ������ � ���� ��������������, ��� ��� ���� ���-�� ����� �����������
//			24, �� ������ ����������� �� ������� �������� ���� day �� �������� ������
//
//		-* ����������� ����� addSeconds(int seconds), ������� ��������� ��������� ���-�� ������ � ������� ����

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CustomDateTime extends CustomDate{
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    private static boolean flagValidation = false;

    public CustomDateTime(){
        super();
    }

    public CustomDateTime(int day, int month, int year, int hour, int minute, int second){
        super(day, month, year);
        if(CustomDateTime.validate(hour, minute, second)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public CustomDateTime(CustomDateTime dateTime){       //�����������
        super();
        if(CustomDateTime.validate(dateTime.hour, dateTime.minute, dateTime.second)){
            this.hour = dateTime.hour;
            this.minute = dateTime.minute;
            this.second = dateTime.second;
        }
    }

    public String getFormattedDate() throws ParseException { //(�������������� �� �������� ������) ������� ���������� ����� � ����: 25.01.2017 15:05:35
        if(flagValidation){
            SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
            String time = hour + ":" + minute + ":" + second;
            Date timeParse = formatTime.parse(time);
            String timeString = formatTime.format(timeParse);
            return super.getFormattedDate() + " " + timeString;
        } else  return "getFormattedDate: �� ������ �����";
    }

    public static boolean validate(int hour, int minute, int second){
        String time = hour + ":" + minute + ":" + second;
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            formatTime.setLenient(false);
            date = formatTime.parse(time);
        } catch (Exception e) {
            System.out.println("Validate: ������ �� �������!");
            return false;
        }
        CustomDateTime.flagValidation = true;
        return  true;
    }

    public String getFormattedDate(boolean isTimeFormat12) throws ParseException {
        if(flagValidation){
            SimpleDateFormat formatTime;
            SimpleDateFormat formatParseTime = new SimpleDateFormat("HH:mm:ss");
            if(isTimeFormat12){
                formatTime = new SimpleDateFormat("hh:mm:ss a");
            } else formatTime = new SimpleDateFormat("HH:mm:ss");
            String time = hour + ":" + minute + ":" + second;
            formatTime.setLenient(true);
            Date timeParse = formatParseTime.parse(time);
            String timeString = formatTime.format(timeParse);
            return super.getFormattedDate() + " " + timeString;
        } else  return "getFormattedDate(boolean isTimeFormat12): �� ������ �����";
    }

    public void nextSecond() throws ParseException {
        if(flagValidation){
            second++;
            if(second > 59){
                minute++;
                second = 0;
                if(minute > 59){
                    hour++;
                    minute = 0;
                    if(hour > 23){
                        hour = 0;
                        nextDate(1);
                    }
                }
            }
        }
    }

    public void nextMinute() throws ParseException {
         if(flagValidation){
             minute++;
             if(minute > 59){
                 hour++;
                 minute = 0;
                 if(hour > 23){
                     hour = 0;
                     nextDate(1);
                 }
             }
         }
    }

    public void nextHour() throws ParseException {
        if(flagValidation){
                hour++;
                if(hour > 23){
                     hour = 0;
                     nextDate(1);
                 }
             }
        }

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

//-* ����������� ����� addSeconds(int seconds), ������� ��������� ��������� ���-�� ������ � ������� ����
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
        if(flagValidation){
            String time = hour + "";
            SimpleDateFormat timeHour = new SimpleDateFormat("HH");
            Date timeParse = timeHour.parse(time);
            return timeHour.format(timeParse);
        } else return "�� ���������� ��� getHour.";
    }

    public String getMinute() throws ParseException {
        if(flagValidation){
            String time = minute + "";
            SimpleDateFormat timeMinute = new SimpleDateFormat("mm");
            Date timeParse = timeMinute.parse(time);
            return timeMinute.format(timeParse);
        } else return "�� ���������� ������ getMinute.";
    }

    public String getSecond() throws ParseException {
        if(flagValidation){
            String time = second + "";
            SimpleDateFormat timeSecond = new SimpleDateFormat("ss");
            Date timeParse = timeSecond.parse(time);
            return timeSecond.format(timeParse);
        } else return "�� ���������� ������� getSecond.";
    }
//Setters
    public void setHour(int hour) {
        if(CustomDateTime.validate(hour, minute, second)){
            this.hour = hour;
        } else System.out.println("�� ���������� ���!");
    }

    public void setMinute(int minute) {
        if(CustomDateTime.validate(hour, minute, second)){
            this.minute = minute;
        } else System.out.println("�� ���������� ������!");
    }

    public void setSecond(int second) {
        if(CustomDateTime.validate(hour, minute, second)){
            this.second = second;
        } else System.out.println("�� ���������� �������!");
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
        CustomDateTime that = (CustomDateTime) o;
        return hour == that.hour && minute == that.minute && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }
}
