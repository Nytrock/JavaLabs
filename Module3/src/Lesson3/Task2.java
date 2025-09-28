package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int row = 9;
        while (row >= 1) {
            int num = 1;
            while (num <= row) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            row--;
        }
    }
}
