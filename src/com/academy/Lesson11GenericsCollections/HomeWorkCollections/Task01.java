package com.academy.Lesson11GenericsCollections.HomeWorkCollections;

import java.util.ArrayList;
import java.util.List;

//1) ��� ������ ����: {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max}
//	a) ������� ������ List �� ��������� ������� � ������� �� �����
//	b) �������� 3 ����� ����� � ������ (Philip, Joseph, Leon) � ������� ���� ������ �� �����
//	c) ������� �� ������ ��� �����: Veronica, Leonid � ������� �� �����
//	d) �������� ��� Helen �� Elizabet
//	e) ������������� ����� �� �������� � ������� �� �����
//	f) ������������� ����� � �������� ������� � ������� ����� �� �����
//	g) ��������� ��� ������ ������� � ������� �������
//	h) ������� ��� �����, ������������ �� ����� A
//	i) ���������, �������� �� ������ ��� Andry
//	j) ������� �� ������ ��� ����� ����� Kate � Helen
public class Task01 {
    public static void main(String[] args) {
        System.out.println("*************** Task 01 - A ****************");//a) ������� ������ List �� ��������� ������� � ������� �� �����
        List<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Helen");
        list.add("Andry");
        list.add("Abdel");
        list.add("Kate");
        list.add("Veronica");
        list.add("Leonid");
        list.add("Alex");
        list.add("Max");
        System.out.println("List<String> list = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - B ****************");//	b) �������� 3 ����� ����� � ������ (Philip, Joseph, Leon) � ������� ���� ������ �� �����
        list.add("Philip");
        list.add("Joseph");
        list.add("Leon");
        System.out.println("List<String> list + 3 name = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - C ****************");//	c) ������� �� ������ ��� �����: Veronica, Leonid � ������� �� �����
        list.remove("Veronica");
        list.remove("Leonid");
        System.out.println("List<String> list - 2 name = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - D ****************");//	d) �������� ��� Helen �� Elizabet
        int index = list.indexOf("Helen");
        list.set(index, "Elizabet");
        System.out.println("List<String> list set Helen at Elizabet = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - E ****************");//	e) ������������� ����� �� �������� � ������� �� �����
        list.sort((l1, l2) -> {
            if(l1.charAt(0) < l2.charAt(0)) return -1;
            if(l1.charAt(0) > l2.charAt(0)) return 1;
            return 0;
        });
        System.out.println("list.sort( ���������� ������� ): -> " + list);
        System.out.println();

        System.out.println("*************** Task 01 - F ****************");//	f) ������������� ����� � �������� ������� � ������� ����� �� �����
        list.sort((l1, l2) -> {
            if(l1.charAt(0) < l2.charAt(0)) return 1;
            if(l1.charAt(0) > l2.charAt(0)) return -1;
            return 0;
        });
        System.out.println("list.sort( �������� ����������� ������� ): -> " + list);
        System.out.println();

        System.out.println("*************** Task 01 - G ****************");//	g) ��������� ��� ������ ������� � ������� ������� ( ����� � ������ �������!!)
        for(int i = 0; i < list.size(); i++){
            String firstLetter = "";
            for(int ii = 0; ii < list.get(i).length(); ii++){
                if(ii == 0) firstLetter += Character.toString(list.get(i).charAt(ii)).toLowerCase();
                else firstLetter += Character.toString(list.get(i).charAt(ii));
            }
            list.set(i, firstLetter);
        }
        System.out.println("list ������ ������� ��������� = " + list);
        System.out.println();

        System.out.println("*************** Task 01 - H ****************");//	h) ������� ��� �����, ������������ �� ����� A
        System.out.print("��� �����, ������� ���������� �� \"�\" = ");
        for (String s : list) {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'A')
                System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("*************** Task 01 - I ****************");//	i) ���������, �������� �� ������ ��� Andry
        System.out.println("�������� �� ������� ����� \"Andry\" = " + list.contains("andry"));
        System.out.println();

        System.out.println("*************** Task 01 - J ****************");//	j) ������� �� ������ ��� ����� ����� Kate � Leon
        int ii = 0;
        for(int i = 0; list.size() > 2; i++){
            if(list.get(ii).equals("kate") || list.get(ii).equals("leon") ) {
                ii++;
            }else list.remove(list.get(ii));
        }
        System.out.println(list);
    }
}





