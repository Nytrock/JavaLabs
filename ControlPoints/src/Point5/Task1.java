package Point5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (String word : original.split(" ")) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String newWord = new String(charArray);
            result.append(newWord);
            result.append(" ");
        }

        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }
}
