package Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOne = new int[10];
        System.out.print("Заполните массив: ");
        for (int i = 0; i < 10; i++) {
            arrayOne[i] = sc.nextInt();
        }

        int[] arrayTwo = Arrays.copyOfRange(arrayOne, 0, 5);
        int[] arrayThree = Arrays.copyOfRange(arrayOne, 5, 10);

        Arrays.sort(arrayTwo);

        Integer[] temp = new Integer[5];
        for (int i = 0; i < 5; i++) {
            temp[i] = arrayThree[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            arrayThree[i] = temp[i];
        }

        System.out.println("Первый массив: " + Arrays.toString(arrayOne));
        System.out.println("Второй массив: " + Arrays.toString(arrayTwo));
        System.out.println("Третий массив: " + Arrays.toString(arrayThree));
    }

}
