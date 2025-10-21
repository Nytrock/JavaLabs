package Lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(ends(test));
    }

    public static boolean ends(String str) {
        int length = str.length();
        if (length < 2)
            return false;

        return str.charAt(length - 1) == '!' && str.charAt(length - 2) == '?';
    }
}