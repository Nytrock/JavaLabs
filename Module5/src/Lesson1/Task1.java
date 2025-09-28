package Lesson1;

public class Task1 {
    public static void main(String[] args) {
        double a1 = 5.0, b1 = 5.0, c1 = 5.0;
        System.out.println("Сторона a равна " + a1);
        System.out.println("Сторона b равна " + b1);
        System.out.println("Сторона c равна " + c1);
        System.out.println("Периметр равен " + perimeter(a1, b1, c1));
        System.out.println();

        double a2 = 4.0, b2 = 5.0, c2 = 10.0;
        System.out.println("Сторона a равна " + a2);
        System.out.println("Сторона b равна " + b2);
        System.out.println("Сторона c равна " + c2);
        System.out.println("Периметр равен " + perimeter(a2, b2, c2));
    }

    public static double perimeter(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        } else {
            return -1.0;
        }
    }
}
