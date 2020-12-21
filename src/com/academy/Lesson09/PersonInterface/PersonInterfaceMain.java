package com.academy.Lesson09.PersonInterface;

//3) ����������� ��������� ��������.
//	�) ����������:
//		- Fighter
//				����� fight();
//		- Coder
//				����� coding();
//		- Dancer
//				����� dance();
//
//	�) ������:
//		- Person (��� ���������� �� �������)
//		- Boxer, ��������� �� Person � ��������� ��������� Fighter
//		- Programmer, ��������� �� Person  � ��������� ��������� Coder
//		- Tester ��������� �� Person � ����� ��������� ��������� Coder
//		- Choreographer, ��������� Person �� � ��������� ��������� Dancer
//		- Genius, ��������� �� Person � ��������� ��� ��� ����������
//
//	�) ������� ������ �� Person - group � ��������� ���������� ������ ������� (Boxer, Programmer, Choreographer, Genius).
//		 ��������� ������ � ��������� ������� � ������ ��������, �������������, ������ � ������.,

public class PersonInterfaceMain {
    public static void main(String[] args) {
        Fighter fighter = new Boxer();
        Coder programmer = new Programmer();
        Dancer dancer = new Choreographer();
        Coder tester = new Tester();

        System.out.println("******************************************");

        Object[] array = {dancer, programmer, fighter, tester};

        for (int i = 0; i < array.length; i++){
            if(array[i] instanceof Dancer){
                ((Dancer) array[i]).dance();
            }
        }
        System.out.println("**********************************");

        Coder[] arrCoder = {tester, programmer};

        for (int i = 0; i < arrCoder.length; i++){
                arrCoder[i].coding();
            }

        Person1[] people = {new Boxer(), new Programmer(), new Choreographer(), new Genius()};
        System.out.println(people.toString());

//�������� ���������� ������� group.
        Person1 fighter1 = new Boxer();
        Person1 programmer1 = new Programmer();
        Person1 dancer1 = new Choreographer();
        Person1 tester1 = new Tester();
        Person1 genius = new Genius();

        Person1[] arrRandom = {dancer1, programmer1, fighter1, tester1, genius}; //������ ��� ���������� ������
        int dancerInt = 0;
        int boxerInt = 0;
        int programmerInt = 0;
        int geniusInt = 0;
        int testerInt = 0;
//�������� ������� �������� �� 10 �� 100 ���������
        Person1[] group = new Person1[(int) (10 + Math.random() * 90)];
        System.out.println("������ �������� " + group.length + " ���������.");
        for(int i = 0; i < group.length; i++) {
            group[i] = arrRandom[(int) (0 + Math.random() * 5)]; //���������� �������
            //System.out.println(i + 1 + "" + group[i]);
           if (group[i] instanceof Choreographer){
                dancerInt++;
            }else if(group[i] instanceof Boxer){
                boxerInt++;
            }else if(group[i] instanceof Tester){
                testerInt++;
            }else if(group[i] instanceof Programmer){
                programmerInt++;
            }else {
                geniusInt++;
            }
        }
        System.out.println("����������� ��������: " + dancerInt +
                "\n����������� ��������: " + boxerInt +
                "\n����������� �������������: " + programmerInt +
                "\n����������� ��������: " + testerInt +
                "\n����������� ������: " + geniusInt
        );
    }
}

