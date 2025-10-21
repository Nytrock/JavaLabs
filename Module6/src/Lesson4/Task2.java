package Lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(toShakeCase(test));
    }

    public static String toShakeCase(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            char symbol = str.charAt(i);
            if (Character.isUpperCase(symbol)){
                builder.append('_');
                builder.append(Character.toLowerCase(symbol));
            } else {
                builder.append(symbol);
            }
        }

        return builder.toString();
    }
}
