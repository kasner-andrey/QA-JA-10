package com.academy.Lesson09.HomeWork.TaskInterface.Lambda;

import javax.swing.*;

//1) 	��������� ������-���������, ������� ���������� �������� true, ����
//		����� ����������� � ��������� ����� 10-20, ������� ��������� ��������
//
//2)	�������� ������� ������-��������� ��� ���������� ���������� ������ �����.
//		����������������� ��� �������������. (5! = 1*2*3*4*5 = 120)
//
//3)  �������� ������-���������, ������� ��������� ������� ������ � ������� �������.
//		��������� ������ � ������� ������� � ������� ������-���������.
//		��������� ������ � ������� ������� � ������� ������ �� �����.
//
//
//4) �������� ������-���������, ������� ������� ��� ������� �� �������� ������ � ���������� ���������.
//	����������������� ������ ������-���������.
//	"Helen Abdel Leon abc array var jMeter Selenium Yaguar" => "HelenAbdelLeonabcarrayvarjMeterSeleniumYaguar"
//
//5) ��� ������ CustomDateTime (������������� �� ����. ��������) ������� ������-���������, ���. ���
//������� ���� ���������� ����� �� 00:00:00
public class LambdaMain {
    public static void main(String[] args) {
        System.out.println("************** 1 ****************");
        System.out.println();
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("������� �����"));

        LambdaInterface<Boolean, Integer> tenTwenty = i -> (i > 9 && i < 21);

        if(tenTwenty.work(number1)) System.out.println("���� ����� '" + number1 + "' ��������� � ��������� �� 10 �� 20!");
        else System.out.println("���� ����� '" + number1 + "' �� ������ � �������� �� 10 �� 20!");

        System.out.println();
        System.out.println("************** 2 ****************");
        System.out.println();
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("������� ����� ��� ���������� ����������"));

        LambdaInterface<Integer, Integer> factorial = i -> {
            int factor = 1;
            for (int j = 1; j <= i; j++){
                factor *= j;
            }
            return factor;
        };
        System.out.println("��������� ����� " + number2 + " = " + factorial.work(number2));

        System.out.println();
        System.out.println("************** 3 ****************");
        System.out.println();

        LambdaInterface<String, String> upperStringLambda = s -> s.toUpperCase();
        LambdaInterface<String, String> upperStringLink = String::toUpperCase;

        System.out.println("������� � ������� ������� ������ ����������: " + upperStringLambda.work("Hello!"));
        System.out.println("������� � ������� ������� ������� �� �����: " + upperStringLink.work("Goodbye!"));

        System.out.println();
        System.out.println("************** 4 ****************");
        System.out.println();

        LambdaInterface<String, String> stringNotSpace = s -> s.replace(" ", "");

        System.out.println("�������� �������� � ������: " + stringNotSpace.work("Helen Abdel Leon abc array var jMeter Selenium Yaguar"));

        System.out.println();
        System.out.println("************** 5 ****************");
        System.out.println();

        CustomDateTime1 time = new CustomDateTime1(23, 12, 2020, 15, 20, 35);

        LambdaInterface<CustomDateTime1, CustomDateTime1> zeroTime = i -> {
          i.setHour(0);
          i.setMinute(0);
          i.setSecond(0);
          return i;
        };
        System.out.print("����� ������� � ���� " + time);
        System.out.println(" = " + zeroTime.work(time));











    }


}
