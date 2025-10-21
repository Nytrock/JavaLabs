package Lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Двоичная система: " + Integer.toBinaryString(number));
        System.out.println("Восьмеричная система: " + Integer.toOctalString(number));
        System.out.println("Шестнадцатеричная система: " + Integer.toHexString(number));
    }
}
