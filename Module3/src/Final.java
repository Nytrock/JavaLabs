import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - сложение");
            System.out.println("2 - умножение");
            System.out.println("3 - деление");
            System.out.println("4 - вычитание");
            System.out.println("0 - выход");
            System.out.println("Введите номер операции:");

            int operation = sc.nextInt();
            if (operation == 0) break;

            System.out.println("Введите первое число:");
            double num1 = sc.nextDouble();
            System.out.println("Введите второе число:");
            double num2 = sc.nextDouble();
            double result = 0;

            switch (operation) {
                case 1 -> result = num1 + num2;
                case 2 -> result = num1 * num2;
                case 3 -> {
                    if (num2 != 0) result = num1 / num2;
                    else {
                        System.out.println("На ноль делить нельзя");
                        result = 0;
                    }
                }
                case 4 -> result = num1 - num2;
                default -> System.out.println("Некорректный выбор");
            }

            System.out.println("Результат: " + result);
        }
    }
}
