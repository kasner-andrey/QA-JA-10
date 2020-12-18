package com.academy.lesson5.oop.Date;
//������������ ��� ������������� ���� ������
//		����������� ������������ "���� ������": �����������, �������, ...
//		� ������������ "���� ������" �������� ������ ��������� ��� "������" next() � "�����" before().
//		�������������� ������������ � ������� main() ��������� ������.
public enum DayWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    DayWeek next(){
        int value;
        if(ordinal() + 1 > values().length - 1){
            value = 0;
        }else value = ordinal() + 1;
        DayWeek nextDay = values()[value];
        return nextDay;
    }

    DayWeek before(){
        int value;
        if(ordinal() - 1 < 0){
            value = values().length - 1;
        } else value = ordinal() - 1;
        DayWeek backDay = values()[value];
        return backDay;
    }


}
