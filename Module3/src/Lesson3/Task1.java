package Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
