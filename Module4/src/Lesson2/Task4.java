package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sumNegative = 0;
        int minPositive = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < 0) {
                sumNegative += num;
            } else if (num > 0 && num < minPositive) {
                minPositive = num;
            }
        }

        if (sumNegative < -100 && minPositive != Integer.MAX_VALUE) {
            sumNegative += minPositive;
        }

        System.out.println("Результат: " + sumNegative);
    }
}
