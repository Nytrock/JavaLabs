public class Final {
    public static void main(String[] args) {
        final double EARTHS_RADIUS = 6371;
        final double PI = 3.1415926;

        int rotationPeriod = 24 * 60 * 60;
        double rotationSpeed = 2 * PI * EARTHS_RADIUS / rotationPeriod;

        System.out.println("Скорость вращения Земли на экваторе: " + rotationSpeed + " км/с");
    }
}
