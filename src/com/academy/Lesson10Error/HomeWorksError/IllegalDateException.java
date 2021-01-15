package com.academy.Lesson10Error.HomeWorksError;

//1)
//	a) ������� ����� IllegalDateException, ������� ��������
//		����������� ������ RuntimeException.
//
//	b) �������������� ����� CustomDate, ������� � �����������
//		������������ ���������� IllegalDateException ���
//		������� ������� ������������ (�� ������������ ����)
//
//	c)  �������������� ������ ������������ �� ���������� ������:
//		- new CustomDate(1, 1, 2012);
//		- new CustomDate(17, 2, 2019);
//		- new CustomDate(29, 2, 2020);
//		- new CustomDate(31, 1, 1999);
//		- new CustomDate(13, 6, 1681);
//
//
//		�������������� ������ ������������ �� ���������� ������, �.�.
//			������� ������������ ����������:
//
//		- new CustomDate(-1, 1, 2012); 	// ������������� ����
//		- new CustomDate(31, 2, 2019); 	// ������� �������� ��� ���
//		- new CustomDate(29, 2, 2019); 	// �� ���������� ���
//		- new CustomDate(31, 13, 1999); // 13 ������ �� ����������
//		- new CustomDate(0, 06, 1681); 	// �������� ��� �� ����������

public class IllegalDateException extends RuntimeException {
    private String message;

    public IllegalDateException() {
    }

    public IllegalDateException(String message) {
        this.message = message;
    }

    public String toString(){
        return message;
    }

}
