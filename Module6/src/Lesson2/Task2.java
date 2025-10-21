package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(replace(test));
    }

    public static String replace(String str) {
        StringBuilder builder = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            builder.append(word.replace(word.charAt(word.length() - 1), '!'));
            if (i != words.length - 1)
                builder.append(" ");
        }

        return builder.toString();
    }
}
