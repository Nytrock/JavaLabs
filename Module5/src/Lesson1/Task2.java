package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 2;
        System.out.println("Число " + num1 + " в квадрате равно " + squared(num1));
        System.out.println("Число " + num1 + " в кубе равно " + cubed(num1));
        System.out.println();

        int num2 = -2;
        System.out.println("Число " + num2 + " в квадрате равно " + squared(num2));
        System.out.println("Число " + num2 + " в кубе равно " + cubed(num2));
    }

    public static int squared(int number) {
        return number * number;
    }

    public static int cubed(int number) {
        return number * number * number;
    }
}
