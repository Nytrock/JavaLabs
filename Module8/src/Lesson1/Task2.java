package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass("Данные из SomeClass");

        Triple<Integer, Boolean, Double> t1 = new Triple<>(1, true, 1.0);

        Triple<Integer, String, SomeClass> t2 = new Triple<>(2, "Строка", someClass);
        Triple<Integer, SomeClass, Triple<Integer, Integer, Integer>> t3 = new Triple<>(3, someClass,
                new Triple<>(1, 2, 3));
        Triple<Integer, Boolean, Triple<Double, Integer, SomeClass>> t4 = new Triple<>(4, false,
                new Triple<>(4.0, 4, someClass));

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}

class Triple<T1, T2, T3> {
    T1 first;
    T2 second;
    T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}

class SomeClass {
    private final String someField;

    public SomeClass(String someField) {
        this.someField = someField;
    }

    @Override
    public String toString() {
        return "SomeClass{someField='" + someField + "'}";
    }
}
