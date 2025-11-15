package Lesson5;

public class Task1 {
    public static void main(String[] args) {
        Distance d = new Distance(10);

        System.out.printf("Значение %.2f%n", d.getDistance());
        System.out.printf("Километры в метры: %.2f%n",
                Distance.Converter.kilometersToMeters(d));
        System.out.printf("Километры в мили: %.2f%n",
                Distance.Converter.kilometersToMiles(d));
        System.out.printf("Метры в ярды: %.2f%n",
                Distance.Converter.metersToYards(d));
        System.out.printf("Метры в футы: %.2f%n",
                Distance.Converter.metersToFeet(d));
        System.out.printf("Метры в сантиметры: %.2f%n",
                Distance.Converter.metersToCentimetres(d));
        System.out.printf("Сантиметры в дюйм: %.2f%n%n",
                Distance.Converter.centimetresToInches(d));

        System.out.printf("Метры в километры: %.2f%n",
                Distance.Converter.metersToKilometers(d));
        System.out.printf("Мили в километры: %.2f%n",
                Distance.Converter.mileToKilometers(d));
        System.out.printf("Ярды в метры: %.2f%n",
                Distance.Converter.yardsToMeters(d));
        System.out.printf("Футы в метры: %.2f%n",
                Distance.Converter.feetToMeters(d));
        System.out.printf("Сантиметры в метры: %.2f%n",
                Distance.Converter.centimetresToMeters(d));
        System.out.printf("Дюймы в сантиметры: %.2f%n",
                Distance.Converter.inchesToCentimetres(d));
    }
}

class Distance {
    private final double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public static class Converter {
        public static double kilometersToMeters(Distance d) {
            return d.getDistance() * 1000;
        }

        public static double kilometersToMiles(Distance d) {
            return d.getDistance() * 0.621371;
        }

        public static double metersToYards(Distance d) {
            return d.getDistance() * 1.09361;
        }

        public static double metersToFeet(Distance d) {
            return d.getDistance() * 3.28084;
        }

        public static double metersToCentimetres(Distance d) {
            return d.getDistance() * 100;
        }

        public static double centimetresToInches(Distance d) {
            return d.getDistance() * 0.393701;
        }

        public static double metersToKilometers(Distance d) {
            return d.getDistance() / 1000;
        }

        public static double mileToKilometers(Distance d) {
            return d.getDistance() * 1.60934;
        }

        public static double yardsToMeters(Distance d) {
            return d.getDistance() * 0.9144;
        }

        public static double feetToMeters(Distance d) {
            return d.getDistance() * 0.3048;
        }

        public static double centimetresToMeters(Distance d) {
            return d.getDistance() / 100;
        }

        public static double inchesToCentimetres(Distance d) {
            return d.getDistance() * 2.54;
        }
    }
}
