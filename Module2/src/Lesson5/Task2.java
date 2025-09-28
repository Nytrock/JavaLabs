package Lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.print("Число равно: ");
        System.out.println(number);

        System.out.print("Квадрат числа равен: ");
        System.out.println(number * number);

        System.out.print("Куб числа равен: ");
        System.out.println(number * number * number);
    }
}
