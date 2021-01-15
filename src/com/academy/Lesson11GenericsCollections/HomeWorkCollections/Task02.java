package com.academy.Lesson11GenericsCollections.HomeWorkCollections;
//2) List
//	a) ������� ������ ����� �����
//	b) ��������� ������ ���������� ������ ������� �� 1 �� 100 (������ ������ 20 ���������)
//	c) ������� ������ �� �����
//	d) ������� �����������, ����������� ��������
//	e) ������� ����� ����� �� �����
//	f) ����� �������� ����� ������������� �����, ������� ��� ����� � ���-�� ���������� �� �����
//		(���� ����� ��������� � ���������� �������� ����������, �� ������� ����������� �� ���)

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("************ Task 02 - A, B, C ****************");//	a) ������� ������ ����� �����
                                                                              //	b) ��������� ������ ���������� ������ ������� �� 1 �� 100 (������ ������ 20 ���������)
                                                                              //	c) ������� ������ �� �����
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            numbers.add((int)(1 + Math.random() * 10));
        }
        System.out.println("List numbers = " + numbers);
        System.out.println();

        System.out.println("************ Task 02 - D ****************");//	d) ������� �����������, ����������� ��������
        numbers.sort((n1, n2) -> {
            if(n1 > n2) return -1;
            if(n2 > n1) return 1;
            return 0;
        });
        System.out.println("Min = " + numbers.get(numbers.size() - 1));
        System.out.println("Max = " + numbers.get(0));
        System.out.println(numbers);
        System.out.println();

        System.out.println("************ Task 02 - E ****************");//	e) ������� ����� ����� �� �����
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum = " + sum);
        System.out.println();

        System.out.println("************ Task 02 - E ****************");//	f) ����� �������� ����� ������������� �����, ������� ��� ����� � ���-�� ���������� �� �����
        Map<Integer, Integer> repeat = new HashMap<>();                     //	(���� ����� ��������� � ���������� �������� ����������, �� ������� ����������� �� ���)
        int result = 0;
        for (int i = 0; i < numbers.size(); i++){
            result = Collections.frequency(numbers, numbers.get(i));
            if(result > 1){
                repeat.put(numbers.get(i), result );
            }
        }
        System.out.println(repeat);
        int maxRepeat = 0;
        for(Integer value: repeat.values()){
            if(value > maxRepeat){
                maxRepeat = value;
            }
        }
        //Map.Entry<Integer, Integer> map = repeat.entrySet();

        System.out.println("�����: " + repeat.get(maxRepeat) + " ����������� " + maxRepeat + " ����.");







    }
}
