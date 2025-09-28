package Lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();

        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Наибольшим числом является " + max);
    }
}
