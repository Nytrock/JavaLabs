package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        System.arraycopy(arr1, 1, arr2, 2, 5);

        System.out.println("Результат: " + Arrays.toString(arr2));
    }
}
