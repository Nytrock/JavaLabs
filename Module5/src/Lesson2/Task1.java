package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        println(10);
        println(10.5);
        println('Д');
        println("Строка");
    }

    public static void println(int value) {
        System.out.println("int " + value);
    }

    public static void println(double value) {
        System.out.println("double " + value);
    }

    public static void println(char value) {
        System.out.println("char " + value);
    }

    public static void println(String value) {
        System.out.println("String " + value);
    }
}
