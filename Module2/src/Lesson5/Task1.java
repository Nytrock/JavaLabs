package Lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();

        float y = x * x + 5 * x - 13;
        System.out.print("Результат вычисления функции: ");
        System.out.println(y);
    }
}
