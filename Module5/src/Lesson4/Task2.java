package Lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("Заполните массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = minimum(array, 0, array[0]);
        System.out.println("Минимальный элемент: " + min);
    }

    public static int minimum(int[] array, int index, int currentMin) {
        if (index == array.length) {
            return currentMin;
        }
        if (array[index] < currentMin) {
            currentMin = array[index];
        }
        return minimum(array, index + 1, currentMin);
    }
}
