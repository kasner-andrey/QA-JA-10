package com.academy.Lesson03.HomeWork.StringAndArray;
//6) ����������� ���������, �������:
//	- ��������� ������
//	- ������� �������� ������ �� �����
//	- ������� ���-�� �������� ��������
//	- ������� ���-�� �������� ���������
public class Task06Method {
    //�������� ������ ��� ��������� ��������� windows-1251 � ����� Task06Main � ����� Task06Method ������ ���� � ���� ���������.
    public static void CountingNumberOfCyrillicAndLatinCharacters(String str) {
        System.out.println("Main string: \'" + str + "\'");
        int numberLatin = 0;
        int numberCyrillic = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= '�' && '�' >= str.charAt(i)) {
                numberCyrillic++;
                } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z'){
                    numberLatin++;
            }
        }
        System.out.println("Number Latin: " + numberLatin);
        System.out.println("Number Cyrillic: " + numberCyrillic);

    }
}
