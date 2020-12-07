package com.academy.Lesson03.HomeWork.StringAndArray;

//7) ����������� ���������, ������� ����������, �������� �� ������ �����������.
//��������� - ��� ������, ������� ��������� �������� ��������� � ����� ������������
//(������: "�����" - ���������, "����" - �� ���������).

public class Task07Method {
    //��� ������ � ���������� � ��������� ����� ��������� ��������� � windows-1251.
    public static void  PalindromeString(String str) {
        System.out.println("Main string :" + "\'" + str + "\'");
        char[] palindromeString = new char[str.length()];
        int indexPalindromeArray = 0;

        for(int i = str.length() - 1; i >= 0; i--){
            palindromeString[indexPalindromeArray] = str.charAt(i);
            indexPalindromeArray++;
        }
        int palindrome = 0;
        for(int i =0; i < str.length(); i++){
            if(palindromeString[i] == str.charAt(i)){
                palindrome++;
            }
        }
        if(palindrome == str.length()){
            System.out.println("String IS Palindrome!!!");
        } else System.out.println("String IS NOT Palindrome");
    }
}
