package com.academy.lesson04.HomeWorkOOPQvests;

import javax.swing.*;
import java.text.ParseException;
import java.util.Locale;

//2) ������� ������ ������� 10, ��������� �� ������� CustomDate
//	- ��������� ������ ���������� ���������� �������������� ���
//	- ������� ��� ���� ������� �� �������
//	- ������� ������ ���� ������ �������
//	- *������� ������ ���� ������������
public class ArrayCustomDate {
    public static CustomDate[] arrayDate;

    public static void main(String[] args) throws ParseException {
        int size = Integer.parseInt(JOptionPane.showInputDialog("������� ������ ������� ��������� ���"));

        ArrayCustomDate.RandomDate(size);
        ArrayCustomDate.Printed();
        ArrayCustomDate.SortMonth();
        ArrayCustomDate.SortWeek();
        System.exit(0);
    }
//*********************** �������� ������� ��� ***************
    public static void RandomDate(int size) {
        arrayDate = new CustomDate[size];
        int dayCustomDate;
        int monthCustomDate;
        int yearCustomDate;
        for (int i = 0; i < arrayDate.length; i++) {
            monthCustomDate = 1 + (int) (Math.random() * 11);
            if (monthCustomDate == 4 || monthCustomDate == 6 || monthCustomDate == 9 || monthCustomDate == 11) {
                dayCustomDate = 1 + (int) (Math.random() * 29);
            } else if (monthCustomDate == 2) {
                dayCustomDate = 1 + (int) (Math.random() * 27);
            } else dayCustomDate = 1 + (int) (Math.random() * 30);
            yearCustomDate = 1990 + (int) (Math.random() * 31);
            arrayDate[i] = new CustomDate(dayCustomDate, monthCustomDate, yearCustomDate);
//            System.out.println("****** Date " + (i+1) + " ******");
//            System.out.println(arrayDate[i].getFormattedDate());
        }
    }
    //*********************** ����� ������� ��� ***************
    public static void Printed() throws ParseException {
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        int i = 1;
        for(CustomDate date:arrayDate){
            System.out.println("****** Date " + i + " ******");
            System.out.println(date.getFormattedDate());
            i++;
        }
    }

    public static void SortMonth() throws ParseException {
        String month = ArrayCustomDate.WindowMonth();
        System.out.println();
        System.out.println("****** ���������� �� ��������� ������ ******");
        for (CustomDate date: arrayDate){
            if(date.getMonth().equals(month)){
                System.out.println("***** Date *****");
                System.out.println(date.getFormattedDate());
            }
        }
    }

    public static void SortWeek() throws ParseException {
        String week = ArrayCustomDate.WindowWeek();
        System.out.println();
        System.out.println("****** ���������� �� ���������� ��� ������ ******");
        for (CustomDate date: arrayDate){
            if(date.getFormattedDate().indexOf(week.toLowerCase()) > 0){
                System.out.println("***** Date *****");
                System.out.println(date.getFormattedDate());
            }
        }
    }


    public static String WindowMonth() {
        String[] month = {"������", "�������", "����", "������", "���", "����", "����", "������", "��������", "�������", "������", "�������"};
        String questMonth = (String) JOptionPane.showInputDialog(null, "�������� ����� ��� ������",
                "�����", JOptionPane.QUESTION_MESSAGE, null, month, month[0]);
        int numberMonth = 0;
        String numberStringMonth = "1";
        for(int i = 0; i < month.length; i++){
            if(month[i].equals(questMonth)){ numberMonth = i + 1;}
        }
        if(numberMonth < 10) {
            numberStringMonth = "0" + numberMonth;
        }else numberStringMonth = "" + numberMonth;
        return numberStringMonth;
    }

    public static String WindowWeek(){
        String[] weekDay = {"�����������", "�������", "�����", "�������", "�������", "�������", "�����������"};
        return (String) JOptionPane.showInputDialog(null, "�������� ���� ������ ��� ������",
                "Array size", JOptionPane.QUESTION_MESSAGE, null, weekDay, weekDay[0]);
    }

}
