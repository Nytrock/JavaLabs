package Lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.print("Первое число после преобразования: ");
        System.out.println((float)number1);
        System.out.print("Второе число после преобразования: ");
        System.out.println((double)number2);
    }
}
