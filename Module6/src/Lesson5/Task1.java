package Lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (isSafe(password)) {
            System.out.println("Пароль надежный");
        } else {
            System.out.println("Пароль не надежный");
        }
    }

    public static boolean isSafe(String str) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[A-Za-z0-9_]{8,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
