package Lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(prepare(test));
    }

    public static String prepare(String str) {
        StringBuilder builder = new StringBuilder();
        int letterCode = 0;
        int aCode = 'a';

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '1'){
                builder.append((char) (letterCode + aCode));
                letterCode = 0;
            } else {
                letterCode++;
            }
        }

        return builder.toString().toUpperCase();
    }
}
