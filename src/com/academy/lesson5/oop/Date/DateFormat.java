package com.academy.lesson5.oop.Date;
//������� ������������ "������ ����" (DateFormat), � ������� ���������� ��������� ��������, ��������:
//		- 	RU 			������						DD.MM.YYYY					24.01.2011
//		- 	USA 		���							MM-DD-YYYY					01-24-2011
//		-	ENG			������������� ����������	DD-MM-YYYY					24-01-2011
//		- 	UK			��������������				DD/MM/YYYY					24/01/2011
//		-* 	CUSTOM		����������������			DD <�������� ������> YYYY�	25 ������ 2011�
//
//	b) �������������� ����� CustomDate �� ����������� �������, ��� ����������� ����������� ���� � �������� �������:
//		- public String getFormattedDate() {} // ���������� ���� � ������� �� ��������� - RU: 24.01.2011
//		- public String getFormattedDate((DateFormat format){} // ���������� ���� � �������� ������� �� ������� �� ������� �)
public enum DateFormat {

    RU("������ | DD.MM.YYYY | 24.01.2011"),
    USA("��� | MM-DD-YYYY | 01-24-2011"),
    ENG("������������� ���������� | DD-MM-YYYY | 24-01-2011"),
    UK("�������������� | DD/MM/YYYY | 24/01/2011"),
    CUSTOM("���������������� | DD <�������� ������> YYYY� | 25 ������ 2011�");

    private String format;

    DateFormat() {

    }

    DateFormat(String format){
        this.format = format;
    }

    public String format(){
        switch (this){
            case RU: return "dd.MM.yyyy";
            case USA: return "MM-dd-yyyy";
            case ENG: return "dd-MM-yyyy";
            case UK: return "dd/MM/yyyy";
            default: return "dd MMMM yyyy'�'";
        }
    }

    public String getFormat(){
        return format;
    }





}
