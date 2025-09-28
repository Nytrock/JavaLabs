package Lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника:");
        int a = sc.nextInt();
        System.out.println("Введите вторую сторону треугольника:");
        int b = sc.nextInt();
        System.out.println("Введите третью сторону треугольника:");
        int c = sc.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Стороны треугольника не могут быть отрицательными");
        } else {
            int perimeter = a + b + c;
            System.out.println("Стороны треугольника: " + a + ", " + b + ", " + c);
            System.out.println("Периметр треугольника равен: " + perimeter);
        }
    }
}
