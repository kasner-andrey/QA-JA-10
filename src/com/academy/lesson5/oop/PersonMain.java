package com.academy.lesson5.oop;

import com.academy.lesson5.oop.Date.Gender;
import com.academy.lesson5.oop.Person;

import java.util.Arrays;

//����������� ����� Person:
//		����
//			firstName; 	// ������
//			lastName; 	// ������
//			age;		// ����� ���
//			gender;		// ������ 'm' - male 'f' - female
//
//		������������:
//			��� ����������
//			�� ����� �����������
//
//		������:
//			get(); // ��� ���� �����
//			set(); // ��� ���� �����
//			getProfile(); // ���������� ������ � ���������� �� ��������
//
//2) ������� ������ ������� 10, ��������� �� ������� Person
//	- ��������� ������ ����������
//	- *��������� ���������� �������
//	- ������� ���������� � ���� ��������� � �������
//	- ������� ������ ������, � ������� ������� �� 30 �� 40 ���.
public class PersonMain {

    //random firstName and LastName

    private static final String[] arrRandomFirstNameMale = {//������� 95 ����
            "James", "John", "Robert", "Michael", "William", "David", "Richard", "Charles", "Joseph", "Thomas", "Christopher",
            "Daniel", "Paul", "Mark", "Donald", "George", "Kenneth", "Steven", "Edward", "Brian", "Ronald", "Anthony", "Kevin",
            "Matthew", "Danny", "Jose", "Jeffrey", "Frank", "Scott", "Eric", "Andrew", "Raymond", "Gregory", "Joshua", "Jerry",
            "Dennis", "Walter", "Patrick", "Peter", "Harold", "Douglas", "Henry", "Carl", "Arthur", "Ryan", "Roger", "Joe",
            "Juan", "Jack", "Albert", "Jonathan", "Justin", "Terry", "Gerald", "Keith", "Samuel", "Willie", "Ralph", "Lawrence",
            "Nicholas", "Roy", "Benjamin", "Bruce", "Brandon", "Adam", "Harry", "Fred", "Wayne", "Billy", "Steve", "Louis", "Jeremy",
            "Aaron", "Randy", "Howard", "Eugene", "Carlos", "Russell", "Bobby", "Victor", "Martin", "Ernest", "Tony", "Todd",
            "Jesse", "Craig", "Shawn", "Clarence", "Stanley", "Philip", "Chris", "Johnny", "Earl", "Jimmy", "Antonio"
    };

    private static final String[] arrRandomFirstNameFemale = {//������� 100 ����
            "Mary", "Patricia", "Linda", "Barbara", "Elizabeth", "Jennifer", "Maria", "Susan", "Margaret", "Dorothy", "Lisa",
            "Nancy", "Karen", "Betty", "Helen", "Sandra", "Donna", "Carol", "Ruth", "Sharon", "Michelle", "Laura", "Sarah", "Kimberly",
            "Amber", "Jessica", "Shirley", "Cynthia", "Angela", "Melissa", "Brenda", "Amy", "Sherry", "Rebecca", "Virginia", "Kathleen",
            "Pamela", "Martha", "Debra", "Amanda", "Stephanie", "Carolyn", "Christine", "Monica", "Janet", "Catherine", "Frances",
            "Ann", "Joyce", "April", "Alice", "Julie", "Heather", "Teresa", "Doris", "Gloria", "Evelyn", "Jean", "Cheryl", "Mildred",
            "Joan", "Ashley", "Judith", "Rose", "Janice", "Kelly", "Nicole", "Judy", "Sylvia", "Kathy", "Wendy", "Beverly", "Denise", "Tammy",
            "Irene", "Jane", "Lori", "Rachel", "Marilyn", "Andrea", "Tiffany", "Louise", "Lauren", "Cindy", "Jacqueline", "Wanda",
            "Bonnie", "Julia", "Ruby", "Lois", "Tina", "Phyllis", "Norma", "Paula", "Tracy", "Emma", "Lillian", "Emily", "Grace", "Connie"
    };

    private static final String[] arrRandomLastName = {//������� 99 ����
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson",
            "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall",
            "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter",
            "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez",
            "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward",
            "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
            "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Patterson", "Hughes", "Flores", "Washington", "Butler", "Simmons",
            "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes"
    };

    public static void main(String[] args) {

//***************************** �������� ������� ��������� ������������� 99 ������� *****
// **************************** (�� ����� ������� ������ �������������) *****************

        Person person = new Person();
        System.out.println();
        System.out.println(arrRandomLastName.length);

        Person[] personsArray = new Person[arrRandomLastName.length];
        String firstName;
        String lastName;
        int age;
        Gender gender;

        for (int i = 0; i < arrRandomLastName.length; i++) {
            int maleOrFemale = (int) (Math.random() * 100);
            if (maleOrFemale < 50) {     //male
                firstName = arrRandomFirstNameMale[(int) (Math.random() * 95)]; // arrRandomFirstNameMale.length = 95
                lastName = arrRandomLastName[(int) (Math.random() * 99)]; // arrRandomLastName.length = 99
                age = (int) (18 + Math.random() * 100); // �� 18 �� 118 ��� �������
                gender = Gender.MALE;
            } else { //female
                firstName = arrRandomFirstNameFemale[(int) (Math.random() * 100)]; // arrRandomFirstNameFemale.length = 100
                lastName = arrRandomLastName[(int) (Math.random() * 99)]; // arrRandomLastName.length = 99
                age = (int) (18 + Math.random() * 100); // �� 18 �� 118 ��� �������
                gender = Gender.FEMALE;
            }
            personsArray[i] = new Person(firstName, lastName, age, gender);
            //System.out.print(" " + personsArray[i] + " "); // �� ������������
        }
        //System.out.println(Arrays.toString(personsArray)); // �� ������������
 //*********************************************************************************************

 //************************** ����� ������ ������� ******************
        System.out.println("********* Random Abonents ************");
        int i = 1;
        for (Person item : personsArray) {
            firstName = item.getFirstName();
            lastName = item.getLastName();
            age = item.getAge();
            gender = item.getGender();
            System.out.println("******** Abonent " + (i) + " **************");
//            System.out.println(item.getProfile());
//            System.out.println("--------------------------------");
            System.out.println("Firstname: " + firstName);
            System.out.println("Lastname: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            i++;
        }

//***************** �����: ������� 30 - 40 ��� *****************************************
        System.out.println("-----------------------------------------------------");
        System.out.println("******* Female 30 - 40 age *********");
        for (Person value : personsArray) {
            firstName = value.getFirstName();
            lastName = value.getLastName();
            age = value.getAge();
            gender = value.getGender();
            if (gender == Gender.FEMALE && age >= 30 && age <= 40) {
                System.out.println("******** Abonent **************");
//                System.out.println(value.getProfile());
//                System.out.println("-------------------------------");
                System.out.println("Firstname: " + firstName);
                System.out.println("Lastname: " + lastName);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
            }
        }
    }
}