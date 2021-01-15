package com.academy.Lesson11GenericsCollections.HomeWorkGenerics;
////1) Создать обобщенный класс GenArray, который:
////	a) хранит элементы массива параметризированного типа.
////		Размер массива постоянен во все время существования экземпляра класса и инициализируется во время создания
////		(в конструктор передается конкретный массив: public GenArray(Integer[] array) {...}
////
////	b)	Реализовать методы:
////			T get(int index) - который вернет элемент массива
////			void set(int index, T element), который установит элемент массива
////			перегрузить методы toString() и equals();
////
////	c)	Бросать исключения, если index выходит за пределы допустимого диапазона
////
////2) Создать тесты GenArrayTests, в которых:
////	a) Протестировать работу методов
////	b) Протестировать работу при некорректном индексе массива, перехватывая исключение

public class GenArrayTests {
    private static final Integer[] arrNumbersInt = {92, 74, 87, 90, 62, 64, 66, 77, 99, 90, 21, 90, 76, 6, 34, 22, 45, 0, 95, 67, 89, 38, 9, 20, 32, 61, 53, 37, 63, 22, 78, 26, 20, 67, 88, 67, 82,
                                                20, 89, 60, 59, 88, 96, 36, 61, 43, 10, 46, 89, 23};

    private static final String[] arrString = {"z.russia", "z.iabb.edu", "z.agroholding", "alcatel", "ams", "chuvashia", "d", "emts", "gab", "intercare", "kharkov", "kirle.sp", "lek", "per.orc",
                                                "pol", "pool-7", "s", "sb.isis.org", "sbs.perm", "usmga", "vsb.samaramail", "z", "z.z", "zet-group", "zlodey.pp", "zun.ulsu", "zxy.spb", "dinet",
                                                "mailcity", "km", "irs", "wizcom", "estart", "mail.raid", "lovers", "aport2000", "ngs", "svetlana.bryansk", "mz.perm", "z-mail", "ezmail", "z-online.ptt",
                                                "donpac", "spb.city.ine", "ascod", "z-yandex", "panorama.irk", "go", "mail.tascom", "mailserver.corvis"};

    private static final Double[] arrNumbersDouble = {89.44082, 86.11964, 14.476167, 94.882126, 85.92025, 98.23472, 31.080427, 75.28222, 40.9574, 99.554, 59.57259, 12.5360365, 49.205036, 5.7048683,
                                                97.25112, 86.59027, 94.226685, 48.806404, 72.04472, 35.751564, 3.469632, 49.288975, 60.481747, 13.751655, 45.655945, 31.69203, 7.6004806,
                                                19.613064, 41.61503, 62.226406, 49.16985, 84.40043, 75.30401, 86.76621, 78.87471, 88.883934, 85.60969, 51.93945, 73.53047, 29.207758, 91.498795,
                                                99.11528, 87.926704, 43.84781, 53.180466, 31.339846, 57.55962, 64.459526, 0.16803251, 66.65147};

    private static final Object[] arrObject = {96, 10, 67, 98.23472, 7.6004806, 90, "per.orc", 53.180466, 75.28222, 62, 67, 78.87471, "mail.tascom", "lovers", "actor", 21, "mailserver.corvis",
                                                7.6004806, "ezmail", 49.16985, "zlodey.pp", 45, "z", "alcatel", "d", "ngs", 36, 90, "zet-group", 74, "actor", "zlodey.pp", 88.883934, "sbs.perm", 31.339846,
                                                "ams", 38, 96, "z.iabb.edu", 86.11964, "d", "chuvashia", 5.7048683, "mail.raid", 89, 49.288975, "zlodey.pp", 53, 90, 60};

    public static void main(String[] args) {
        System.out.println("******** Constructor ********");
        GenArray<Integer> arrayInt = new GenArray<>(arrNumbersInt);
        GenArray<String> arrayString = new GenArray<>(arrString);
        GenArray<Double> arrayDouble = new GenArray<>(arrNumbersDouble);
        GenArray<Object> arrayObject = new GenArray<>(arrObject);

        System.out.println("arrayInt = " + arrayInt);
        System.out.println("arrayString = " + arrayString);
        System.out.println("arrayDouble = " + arrayDouble);
        System.out.println("arrayObject = " + arrayObject);
        System.out.println();

        System.out.println("******* methods get(int index) positive ********");
        try {
            System.out.println(arrayInt.get(20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arrayDouble.get(40));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arrayString.get(30));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arrayObject.get(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

       System.out.println("******* methods get(int index) negative ********");
        try {
            System.out.println(arrayInt.get(52));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arrayDouble.get(60));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arrayString.get(-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arrayObject.get(-100));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("******* methods set(int index) positive ********");
        try {
            arrayInt.set(2, 155);
            System.out.println("arrayInt.set(2, 155)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            arrayDouble.set(3, 25.333);
            System.out.println("arrayDouble.set(3, 25.333);");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            arrayObject.set(2, "Hello");
            System.out.println("arrayObject.set(2, \"Hello\");");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            arrayString.set(2, "XXXXXXX");
            System.out.println("arrayString.set(2, \"XXXXXXX\");");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("arrayInt = " + arrayInt);
        System.out.println("arrayString = " + arrayString);
        System.out.println("arrayDouble = " + arrayDouble);
        System.out.println("arrayObject = " + arrayObject);
        System.out.println();

        System.out.println("******* methods set(int index) negative ********");
        try {
            System.out.print("arrayInt.set(-1, 155); -> ");
            arrayInt.set(-1, 155);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.print("arrayDouble.set(66, 25.333); -> ");
            arrayDouble.set(66, 25.333);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.print("arrayObject.set(-20, \"Hello\"); -> ");
            arrayObject.set(-20, "Hello");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.print("arrayString.set(52, \"XXXXXXX\"); -> ");
            arrayString.set(52, "XXXXXXX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("arrayInt = " + arrayInt);
        System.out.println("arrayString = " + arrayString);
        System.out.println("arrayDouble = " + arrayDouble);
        System.out.println("arrayObject = " + arrayObject);
        System.out.println();



    }
}
