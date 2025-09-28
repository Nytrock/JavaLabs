package Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.printf("%02d.%02d.%04d", year, month, day);
    }
}
