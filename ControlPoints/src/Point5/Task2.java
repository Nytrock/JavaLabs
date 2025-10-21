package Point5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        char[] charArray = original.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++){
            char temp = charArray[i * 2];
            charArray[i * 2] = charArray[i * 2 + 1];
            charArray[i * 2 + 1] = temp;
        }

        String result = new String(charArray);
        System.out.println(result);
    }
}
