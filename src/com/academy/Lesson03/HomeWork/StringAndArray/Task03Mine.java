package com.academy.Lesson03.HomeWork.StringAndArray;
//3) Напишите программу, которая:
//	- считывает строку
//	- считывает подстроку
//	- выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку

public class Task03Mine {
    public static void main(String[] args) {
        String mainString = "fhkdjdjj kkkdkd kdkkdkdl sskdlls osoos ksllskdl lsldskdlsllskdlls lskdll";
        String subString = "kd";
        Task03Method.OccurrenceOfSubstringInString(mainString, subString);

    }
}
