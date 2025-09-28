package Lesson3;

public class Task3 {
    public static void main(String[] args) {
        int n = 1;
        do {
            n++;
        } while (5 * n * n - 1125 * n < 0);
        System.out.println("Наибольшее положительное число равно: " + (n - 1));
    }
}
