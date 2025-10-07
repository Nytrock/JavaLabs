package Task2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int amount;
        String input;

        input = JOptionPane.showInputDialog(null, "Введите сумму для размена",
                "Банкомат", JOptionPane.QUESTION_MESSAGE);

        try {
            amount = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Неправильный ввод. Введите число",
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int numberOf5000 = Math.min(20, amount / 5000);
        amount -= 5000 * numberOf5000;
        int numberOf2000 = Math.min(20, amount / 2000);
        amount -= 2000 * numberOf2000;
        int numberOf1000 = Math.min(50, amount / 1000);
        amount -= 1000 * numberOf1000;
        int numberOf500 = Math.min(50, amount / 500);
        amount -= 500 * numberOf500;
        int numberOf200 = Math.min(100, amount / 200);
        amount -= 200 * numberOf200;
        int numberOf100 = Math.min(100, amount / 100);
        amount -= 100 * numberOf100;
        int numberOf50 = Math.min(100, amount / 50);
        amount -= 50 * numberOf50;

        if (amount > 0){
            JOptionPane.showMessageDialog(null, "Невозможно выдать запрашиваемую сумму",
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
        } else {
            String result = String.format("Кол-во купюр по 5000: %d\n " +
                    "Кол-во купюр по 2000: %d\n " +
                    "Кол-во купюр по 1000: %d\n " +
                    "Кол-во купюр по 500: %d\n " +
                    "Кол-во купюр по 200: %d\n " +
                    "Кол-во купюр по 100: %d\n " +
                    "Кол-во купюр по 50: %d",
                    numberOf5000, numberOf2000, numberOf1000, numberOf500, numberOf200, numberOf100, numberOf50);
            JOptionPane.showMessageDialog(null, result,
                    "Результат", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
