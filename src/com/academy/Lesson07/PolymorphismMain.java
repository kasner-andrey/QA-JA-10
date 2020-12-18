package com.academy.Lesson07;

import com.academy.lesson06.Person;
import com.academy.lesson06.Subscriber;

import java.sql.Array;
import java.util.Arrays;

public class PolymorphismMain {
    public static void main(String[] args) {
        Long L1 = 23L;
        Integer I1 = 10;

        L1 =I1.longValue();

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        Object[] arr2 = {1, "two", 3};
        System.out.println(Arrays.toString(arr2));

        Person subscriber = new Subscriber(); //����� ������ ���� ����� ��������, � ����� ���������
        //Subscriber sub1 = subscriber;//��� ������ ��������� ���
        Subscriber sub = (Subscriber) subscriber; //����� ���������� ����� ���������� ������������� ������
        subscriber.setFirstName("Peter");
        subscriber.setLastName("Helen");
        subscriber.setGender('m');
        System.out.println(subscriber.getProfile());

        //����� ������� ������ �� �������, ���������� ���������� � ������� ������ ������ Person[] arr = {subscriber, boxer, musician}���� ����
        // ���� ������� ������� (Person ��� �������� ) ����� ����� instanceof ���������� true ���� ���.




    }

}
