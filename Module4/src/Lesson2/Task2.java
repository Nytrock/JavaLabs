package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = sc.nextInt();

        while (n < 3) {
            System.out.println("Размер массива должен быть не менее 3. Введите снова:");
            n = sc.nextInt();
        }

        int[] arr = new int[n];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int countEven = 0;
        for (int num : arr) {
            if (num % 2 == 0){
                countEven++;
            }
        }

        int[] evenArr = new int[countEven];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[index++] = num;
            }
        }

        System.out.print("Исходный массив: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        System.out.print("Массив с четными элементами: ");
        for (int num : evenArr) System.out.print(num + " ");
    }
}
