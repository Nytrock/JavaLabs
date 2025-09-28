package Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nИзначальный массив: ");
        printArray(arr);

        increase(arr);

        System.out.println("\nУвеличенный массив: ");
        printArray(arr);
    }

    public static void increase(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
