package com.academy.lesson5.oop.Date;

//�) ������� ������������ "������ �������" (TimeFormat), � ������� ���������� ��������� �������:
//		- H12		12 �������			HH:MM:SS (am|pm)	09:23:45am, 09:23:45pm
//		- H24		24 �������			HH:MM:SS			09:23:45,	21:23:45
//
//	�)�������������� ����� CustomDateTime �� ����. �������(��), ��� ����������� ����������� ������� � �������� �������:
//		- public String getFormattedDate() {} // ���������� ���� � ����� � ������� �� ���������: 24.01.2011	21:23:45
//		- public String getFormattedDate(DateFormat dateFormat, TimeFormat format) {} // ���������� ���� � ����� � �������� ��������


public enum TimeFormat {
    H12("12 ������� | HH:MM:SS (am|pm) | 09:23:45am, 09:23:45pm"),
    H24("24 ������� | HH:MM:SS | 09:23:45, 21:23:45");

    private String format;

    TimeFormat(String format){
        this.format = format;
    }

    TimeFormat() {

    }

    public String getFormat(){
        return format;
    }

    public String format(){
        switch (this){
            case H24: return "HH:mm:ss";
            default: return "hh:mm:ssa";
        }
    }



}
