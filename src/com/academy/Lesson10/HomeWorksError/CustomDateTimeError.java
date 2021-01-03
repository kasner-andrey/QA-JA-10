package com.academy.Lesson10.HomeWorksError;
//a) ������� ����� IllegalTimeException, ������� ��������
//		����������� ������ RuntimeException.
//
//	b) �������������� ����� CustomDateTime, ������� � �����������
//		������������ ���������� IllegalTimeException ���
//		������� ������� ������������ (�� ������������ �����)
//
//	c)  �������������� ������ ������������ �� ���������� ������:
//		- new CustomDateTime(..., 12, 12, 12,);
//		- new CustomDateTime(..., 23, 1, 1);
//		- new CustomDateTime(..., 0, 0, 0);
//		- new CustomDateTime(..., 23, 59, 59);
//
//
//		�������������� ������ ������������ �� ���������� ������, �.�.
//			������� ������������ ����������:
//
//		- new CustomDateTime(..., -12, 12, 12); 	// ������������� ������ �� ����-��
//		- new CustomDateTime(..., 23, 1, 60); 		// ������� �������� ��� �������
//		- new CustomDateTime(..., 24, 0, 0); 		// ������� �������� ��� ����
//		- new CustomDateTime(..., 23, 60, 0); 		// ������� �������� ��� ������



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CustomDateTimeError extends CustomDateError {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public CustomDateTimeError(){
        super();
    }

    public CustomDateTimeError(int day, int month, int year, int hour, int minute, int second) throws IllegalTimeException{
        super(day, month, year);
        if(hour < 0 || hour > 23) throw new IllegalTimeException("���� ������� �� ����� ������ 0 ��� ������ 23");
        else this.hour = hour;
        if (minute < 0 || minute > 59) throw  new IllegalTimeException("������ ������� �� ����� ������ 0 ��� ������ 59");
        else this.minute = minute;
        if ( second < 0 || second > 59) throw new IllegalTimeException("������� ������� �� ����� ������ 0 ��� ������ 59");
        else this.second = second;
    }

    public CustomDateTimeError(int hour, int minute, int second) throws IllegalTimeException{
        super();
        if(hour < 0 || hour > 23) throw new IllegalTimeException("���� ������� �� ����� ������ 0 ��� ������ 23");
        else this.hour = hour;
        if (minute < 0 || minute > 59) throw  new IllegalTimeException("������ ������� �� ����� ������ 0 ��� ������ 59");
        else this.minute = minute;
        if ( second < 0 || second > 59) throw new IllegalTimeException("������� ������� �� ����� ������ 0 ��� ������ 59");
        else this.second = second;
    }

    public CustomDateTimeError(CustomDateTimeError dateTime){       //�����������
        super();
        if(CustomDateTimeError.validate(dateTime.hour, dateTime.minute, dateTime.second)){
            this.hour = dateTime.hour;
            this.minute = dateTime.minute;
            this.second = dateTime.second;
        }
    }

    public String getFormattedDate() throws ParseException {
            SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
            String time = hour + ":" + minute + ":" + second;
            Date timeParse = formatTime.parse(time);
            String timeString = formatTime.format(timeParse);
            return super.getFormattedDate() + " " + timeString;
    }

    public static boolean validate(int hour, int minute, int second){
        String time = hour + ":" + minute + ":" + second;
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            formatTime.setLenient(false);
            date = formatTime.parse(time);
        } catch (Exception e) {
            System.out.println("CustomDateTimeError.validate: ������ �� �������!");
            return false;
        }
        return  true;
    }

    public String getFormattedDate(boolean isTimeFormat12) throws ParseException {
            SimpleDateFormat formatTime;
            SimpleDateFormat formatParseTime = new SimpleDateFormat("HH:mm:ss");
            if(isTimeFormat12) formatTime = new SimpleDateFormat("hh:mm:ss a");
            else formatTime = new SimpleDateFormat("HH:mm:ss");
            String time = hour + ":" + minute + ":" + second;
            formatTime.setLenient(true);
            Date timeParse = formatParseTime.parse(time);
            String timeString = formatTime.format(timeParse);
            return super.getFormattedDate() + " " + timeString;
    }

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
// ��������������� ����� ��� ������� next...()
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
        if(CustomDateTimeError.validate(hour, minute, second)){
            this.hour = hour;
        } else throw new IllegalTimeException("���� ������� �� ����� ������ 0 ��� ������ 23");
    }

    public void setMinute(int minute) {
        if(CustomDateTimeError.validate(hour, minute, second)){
            this.minute = minute;
        } else throw  new IllegalTimeException("������ ������� �� ����� ������ 0 ��� ������ 59");
    }

    public void setSecond(int second) {
        if(CustomDateTimeError.validate(hour, minute, second)){
            this.second = second;
        } else throw new IllegalTimeException("������� ������� �� ����� ������ 0 ��� ������ 59");
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
        CustomDateTimeError that = (CustomDateTimeError) o;
        return hour == that.hour && minute == that.minute && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }
}
