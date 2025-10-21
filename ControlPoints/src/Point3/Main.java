package Point3;

import java.util.Random;

public class Main {
    private static void printMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 9;
        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Исходная матрица:");
        printMatrix(matrix, size);

        swapTopAndBottom(matrix, size);

        System.out.println("Изменённая матрица:");
        printMatrix(matrix, size);
    }

    private static void swapTopAndBottom(int[][] arr, int size) {
        for (int i = 0; i < size / 2; i++) {
            int right = size - i - 1;
            for (int j = i + 1; j <  right; j++) {
                int temp = arr[right][j];
                arr[right][j] = arr[i][j];
                arr[i][j] = temp;
            }
        }
    }
}
