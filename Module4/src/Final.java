import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerCards = 6;

        System.out.print("Введите количество игроков: ");
        int players = sc.nextInt();

        String[] suits = {"Пик", "Треф", "Бубен", "Червей"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (String rank : ranks) {
            for (String suit : suits) {
                deck[index++] = rank + " " + suit;
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < players * playerCards; i++) {
            System.out.println(deck[i]);
            if ((i + 1) % playerCards == 0) {
                System.out.println();
            }
        }
    }
}
