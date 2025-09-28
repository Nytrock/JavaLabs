package Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i += 2) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
    }
}
