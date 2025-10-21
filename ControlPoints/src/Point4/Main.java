package Point4;

import java.util.Scanner;

public class Main {
    private static void hanoiTower(int n, int fromPeg, int toPeg){
        if (n == 1) {
            System.out.printf("Move from %d to %d \n", fromPeg, toPeg);
            return;
        }

        int unusedPeg = 6 - fromPeg - toPeg;
        hanoiTower(n - 1, fromPeg, unusedPeg);
        System.out.printf("Move from %d to %d \n", fromPeg, toPeg);
        hanoiTower(n - 1, unusedPeg, toPeg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoiTower(n, 1, 3);
    }
}
