package com.academy.Lesson09.HomeWorkAdditionalTasks;
//a) ��������� ArrayExt (������a���� ������), ���.
//		�������� ��������� ������:
//			Object get(int index) - ��������� ������� �� ������� (���������� � ����)
//			int size() - ����� �������
//			void add(Object el) - ��������� ������� � ����� �������
//			void add(int index, Object el) - ��������� ������� �� ������� index
//			void remove(int index) - ������� ������� �� ������� �� �������, ���������� �������� ��������
//
//	�) ����� ArrayExtImpl, ����������� ��������� ArrayExt
//		�������������� ������:
//			toString()
//			equals()
//
//	����� ArrayExtImpl ������ ��� �������� � ������� (��������� ����)
//	��� �������� ������ ��������� ������ ������� = 10
//	(���� ������ �������� � ������������)
//
//	���� ��� ���������� �������� ������� ������� ������������ ��� ��������, ��
//	������� ����� ������ �� 10 ��������� ������ ����������� � ����������� ���
//	��������
//
//	�) ��������� ������ ������ ArrayExtImpl
public class MainArray {
    public static void main(String[] args) {
        Object[] objects;
        objects = new Object[]{1, 23, "pp", 59, "DDD", 9, null};

        ArrayExtImpl array = new ArrayExtImpl(objects);
        System.out.println("������ ���������� ������: " + array.size());
        System.out.println();
        System.out.println("������ " + array);
        System.out.println("������� �� ������� \"2\": " + array.get(2));
        System.out.println("������� �� ������� �������� ��� \"-3\": " + array.get(-3));
        System.out.println("������� �� ������� �������� ��� \"20\": " + array.get(20));
        System.out.println();
        System.out.print("������� �������� � ����� ������� ������� \"9999\":  ");
        array.add(9999);
        System.out.println(array);
        System.out.println("������� �������� � ����� ������� ��� ���������� ����� ������� \"Kasner\": ");
        array.add("Kasner");
        System.out.println(array);
        System.out.println("������� �������� �� ������� index ������� \"Andrey\": ");
        array.add(3, "Andrey");
        System.out.println(array);
        System.out.println("�������� �������� �� ������� ������ \"2\": ");
        array.remove(2);
        System.out.println(array);
        //��� ���������� ���������� �������� � ������, ������ �������� �������� �� ������ � ������� �������� null, � ��� ���������� ����� ��������� ����� ������.












    }
}
