package com.academy.Lesson11GenericsCollections.HomeWorkGenerics;

//1) ������� ���������� ����� GenArray, �������:
//	a) ������ �������� ������� �������������������� ����.
//		������ ������� ��������� �� ��� ����� ������������� ���������� ������ � ���������������� �� ����� ��������
//		(� ����������� ���������� ���������� ������: public GenArray(Integer[] array) {...}
//
//	b)	����������� ������:
//			T get(int index) - ������� ������ ������� �������
//			void set(int index, T element), ������� ��������� ������� �������
//			����������� ������ toString() � equals();
//
//	c)	������� ����������, ���� index ������� �� ������� ����������� ���������
//
//2) ������� ����� GenArrayTests, � �������:
//	a) �������������� ������ �������
//	b) �������������� ������ ��� ������������ ������� �������, ������������ ����������


import java.util.Arrays;

public class GenArray<TypeArray> {

    private TypeArray[] array;

    public GenArray(TypeArray[] array) {
        this.array = array;
    }

    public TypeArray get(int index) throws Exception{
        if(index >= array.length) throw new Exception("������ ������ ������� �������");
        else if(index < 0) throw new Exception("������ ������ 0");
        else return array[index];
    }

    public void set(int index, TypeArray element) throws Exception{
        if(index >= array.length) throw new Exception("������ ������ ������� �������");
        else if(index < 0) throw new Exception("������ ������ 0");
        else  array[index] = element;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < array.length; i++){
            if(i == array.length - 1) result += array[i] + " ]";
            else result += array[i] + ", ";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenArray<?> genArray = (GenArray<?>) o;
        return Arrays.equals(array, genArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
