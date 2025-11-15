package Lesson6;

public class Task1 {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;

        System.out.println("Любимое время года: Я люблю " + favorite);
        System.out.println("Информация о любимом времени года: " + Season.getDescription(favorite));
        System.out.println();

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season + ". " + Season.getDescription(season) +
                    ". Средняя температура: " + season.getAvgTemp());
        }
    }
}

enum Season {
    SUMMER(20.0),
    WINTER(-15.0),
    AUTUMN(4.0),
    SPRING(10.0);

    private final double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public static String getDescription(Season season) {
        if (season == SUMMER || season == SPRING) {
            return "Это теплое время года";
        } else {
            return "Это холодное время года";
        }
    }

    public static String getFavoriteSeason(Season season) {
        return "Я люблю " + season;
    }
}
