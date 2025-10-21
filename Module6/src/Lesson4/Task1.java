package Lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        System.out.println(packing(test));
    }

    public static String packing(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        char nowSymbol = '-';

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != nowSymbol){
                if (nowSymbol != '-') {
                    builder.append(count);
                    builder.append(nowSymbol);
                }

                count = 1;
                nowSymbol = str.charAt(i);
            } else {
                count++;
            }
        }

        builder.append(count);
        builder.append(nowSymbol);

        return builder.toString();
    }
}
