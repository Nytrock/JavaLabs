package Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(b + " ");
        }
    }
}
