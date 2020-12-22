package com.academy.Lesson09.HomeWork.TaskInterface;
//4) ���������� ����� Subscriber. ���� ������:
//	firstName (���)
//	lastName (�������)
//	gender (���)
//	age (�������)
//
//	������� ������ �� 100 ���������, �������� ��� ���� ���������� �������:
//		- ��� (���� ��� ����)
//		- ������� (�� 4 - 90)
//		- ��� (���� ������� - ��������� ������� ���)
//		- ������� (������� ��� �������)
//
//	������� � ����� ������������ �� ����. �������:
//		������� �������: �������,������,��������,�����,�������,�������,������,�������,�������,������,������,��������,��������,������,������
//		������� �����: �����,��������,�����,����,�����,������,������,������,�������,��������,�������,����,����,��������,������,����
//		������� �������: �������,������,������,������,��������,����������,��������,��������,���������,���������,���������,��������,��������,��������,��������,��������,
//		������� �����: ��������,�����,�����,���,����,�����,����,�����,������,���������,���,����,�����,������,������,����,��������,�������,������,�������


public class Main {
    public static void main(String[] args) {

        Subscriber[] subscriber = new Subscriber[100];

        for (int i = 0; i < subscriber.length; i++) {
            subscriber[i] = new Subscriber();
            int maleFemale = (int) (Math.random() * 101);
            if (maleFemale <= 50) {
                subscriber[i].setFirstName(ManFirstName.values()[(int)(Math.random() * 16)].name());
                subscriber[i].setLastName(ManLastName.values()[(int)(Math.random() * 15)].name());
                subscriber[i].setAge((int) (4 + Math.random() * 86));
                subscriber[i].setGender(Gender.MALE);
            } else {
                subscriber[i].setFirstName(WomanFirstName.values()[(int)(Math.random() * 20)].name());
                subscriber[i].setLastName(WomanLastName.values()[(int)(Math.random() * 16)].name());
                subscriber[i].setAge((int) (4 + Math.random() * 86));
                subscriber[i].setGender(Gender.FEMALE);
            }
            System.out.println("**** Subscriber " + (i + 1) + " ****");
            System.out.println(subscriber[i]);
        }
    }
}
