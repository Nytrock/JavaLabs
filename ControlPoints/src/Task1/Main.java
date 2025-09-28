package Task1;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> towers = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n - 1; i++){
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            towers.put(from, to);
        }

        int result = scanner.nextInt();
        while (towers.containsKey(result)){
            result = towers.get(result);
        }

        System.out.println(result);
    }
}
