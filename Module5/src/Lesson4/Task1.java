package Lesson4;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("[a:1, b:5] -> ");
        recursion(1, 5);
        System.out.println();

        System.out.print("[a:5, b:1] -> ");
        recursion(5, 1);
        System.out.println();

        System.out.print("[a:1, b:1] -> ");
        recursion(1, 1);
        System.out.println();
    }

    public static void recursion(int a, int b) {
        System.out.print(a);
        if (a < b) {
            System.out.print(" ");
            recursion(a + 1, b);
        } else if (a > b) {
            System.out.print(" ");
            recursion(a - 1, b);
        }
    }
}
