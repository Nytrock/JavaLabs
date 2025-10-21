package Lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (isCorrectUrl(password)) {
            System.out.println("Строка является правильным url адресом");
        } else {
            System.out.println("Строка не является правильным url адресом");
        }
    }

    public static boolean isCorrectUrl(String str) {
        String regex = "^(http|https)://(?:[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*\\.)+[A-Za-z]{2,}(?::\\d{1,5})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
