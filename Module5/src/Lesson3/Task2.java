package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        reverseSequence(1, 2, 3, 4, 5);
    }

    public static void reverseSequence(int... numbers) {
        System.out.print("Исходный массив: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Обратный массив: [");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
