package Lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        System.out.print("Введите количество столбцов: ");
        int m = sc.nextInt();

        int[][] table = new int[n][m];
        System.out.print("Заполните таблицу: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = sc.nextInt();
            }
        }

        System.out.println("Таблица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        boolean pretty = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                int a = table[i][j];
                int b = table[i][j + 1];
                int c = table[i + 1][j];
                int d = table[i + 1][j + 1];
                if ((a == b && b == c && c == d)) {
                    pretty = false;
                    break;
                }
            }

            if (!pretty)
                break;
        }

        if (pretty) {
            System.out.println("Таблица симпатичная");
        } else {
            System.out.println("Таблица не симпатичная");
        }
    }
}
