package com.academy.Lesson03.HomeworkRegularExpressions.Task05;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********** Task - 5 **********");
        System.out.println();

        String regex5 = "^([_A-Za-z0-9-\\+])+([_A-Za-z0-9-]?+)*@([A-Za-z0-9-])+(\\.?[A-Za-z0-9]?+)*(\\.[A-Za-z]{2,})";
        Pattern pattern5 = Pattern.compile(regex5);
        int size5 = 0; //����������� ����������� ��������� �������
        Object[] options4 = new Object[]{"������ ���� E-mail", "���������� ��������� ������ E-mail"}; //�������� ������ � ����
        int n4 = JOptionPane.showOptionDialog(null, //����� ���� ������� ��� ������ ������ ������� �����
                "����� E-mail �� ������?",
                "����� Email",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options4, options4[1]);
        if(n4 == 0) {//���� ������ ������ �1 - "������ ���� �������������� �����"
            //����� ����������� ���� ��� ����� ������� ����� ������������
            String email = JOptionPane.showInputDialog("������� ���� E-mail �������� test@test.test ");
            System.out.print("�� ����� " + email); // ����� � ������� ��������� �����
            boolean mach = pattern5.matcher(email).matches();
            System.out.println(" <= ������������ ������� ������� (test@test.test) => " + mach);// ����� � ������� �������� E-mail

        } else {//���� ������ ������ ������ - "���������� ��������� ����� E-mail"
            try {
                //����� ����������� ���� ������ ����������� ����������� ������ E-mail
                size5 = Integer.parseInt(JOptionPane.showInputDialog("������� ����������� ����������� E-mail"));
            } catch (NumberFormatException e) {
                System.out.println("�� ����� �� �����!!!");//���������, ���� ������������ ���� �� ����� � ���������� ���� + ���������� ������
            }
            for(int i = 0; i < size5; i++){//���� ������������ E-mail
                String randomMail = RandomMail.randomMail(); //����� ������, ��� ���������� ������������ ���������� E-mail
                Matcher matcher = pattern5.matcher(randomMail);
                boolean insert5 = matcher.matches(); //�������� �� ������������ ������� test@test.test
                String arrow4 = ""; // ����������� ��� ����������� ������� ������ ��������  (��������� ����������)
                if(insert5) arrow4 = "   <==================";
                System.out.println(randomMail + " => " + insert5 + arrow4); // ���������� ����� �������������� E-mail
            }
        }

    }
}
