package Lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final String password = "qwerty123";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String input = sc.nextLine();

        if (password.equals(input)) {
            System.out.println("Пароль совпадает");
        } else {
            System.out.println("Пароль не совпадает");
        }
    }
}
