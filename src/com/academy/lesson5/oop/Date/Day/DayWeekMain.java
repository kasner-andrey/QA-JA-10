package com.academy.lesson5.oop.Date.Day;
//������������ ��� ������������� ���� ������
//		����������� ������������ "���� ������": �����������, �������, ...
//		� ������������ "���� ������" �������� ������ ��������� ��� "������" next() � "�����" before().
//		�������������� ������������ � ������� main() ��������� ������.
public class DayWeekMain {
    public static void main(String[] args) {

        System.out.println("***** next() *****");
        System.out.println();

        DayWeek dayWeek1 = DayWeek.MONDAY;
        DayWeek dayWeek2 = DayWeek.SUNDAY;
        DayWeek dayWeek3 = DayWeek.THURSDAY;

        System.out.println("***** ������ ������ ****");
        System.out.println("MONDAY -> " + dayWeek1.next());

        System.out.println("***** ����������� - ����������� *****");
        System.out.println("SUNDAY -> " + dayWeek2.next());

        System.out.println("***** �������� ������ *****");
        System.out.println("TUESDAY -> " + dayWeek3.next());
        System.out.println();
 //**********************************************************************
        System.out.println("***** before() *****");
        System.out.println();

        System.out.println("***** ����������� - ����������� *****");
        System.out.println("MONDAY -> " + dayWeek1.before());

        System.out.println("***** ����� ������ ****");
        System.out.println("SUNDAY -> " + dayWeek2.before());

        System.out.println("***** �������� ������ *****");
        System.out.println("TUESDAY -> " + dayWeek3.before());











    }
}
