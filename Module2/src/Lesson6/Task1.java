package Lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину первой фигуры:");
        int length1 = sc.nextInt();
        System.out.println("Введите высоту первой фигуры:");
        int width1 = sc.nextInt();
        System.out.println("Введите длину второй фигуры:");
        int length2 = sc.nextInt();
        System.out.println("Введите высоту второй фигуры:");
        int width2 = sc.nextInt();

        int perimeter1 = 2 * (length1 + width1);
        int area1 = length1 * width1;
        int perimeter2 = 2 * (length2 + width2);
        int area2 = length2 * width2;

        System.out.println("Первый прямоугольник: длина " + length1 + ", ширина " + width1 +
                ", периметр " + perimeter1 + ", площадь " + area1 + ".");
        System.out.println("Второй прямоугольник: длина " + length2 + ", ширина " + width2 +
                ", периметр " + perimeter2 + ", площадь " + area2 + ".");

        System.out.println("Периметр первой фигуры больше второй: " + (perimeter1 > perimeter2));
        System.out.println("Площадь первой фигуры больше второй: " + (area1 > area2));
    }
}
