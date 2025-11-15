package Lesson5;

class MyLine {
    public MyPoint pointStart;
    public MyPoint pointEnd;

    public class MyPoint {
        public double x;
        public double y;

        public MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("[%.2f; %.2f]", x, y);
        }
    }

    public MyLine(double x1, double y1, double x2, double y2) {
        this.pointStart = new MyPoint(x1, y1);
        this.pointEnd = new MyPoint(x2, y2);
    }

    @Override
    public String toString() {
        return String.format("Начальная точка %s; Конечная точка %s", pointStart.toString(), pointEnd.toString());
    }
}

public class Task2 {
    public static void main(String[] args) {
        MyLine line = new MyLine(10, 10, 40, 40);
        System.out.println(line);
    }
}
