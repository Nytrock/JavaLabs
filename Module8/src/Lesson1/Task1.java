package Lesson1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Shop<Integer> shopIds = new Shop<>(new Integer[] {1, 2, 3, 4, 5});
        Shop<String> shopNames = new Shop<>(new String[] {"Сапоги", "Шарф", "Брюки", "Футболка", "Джемпер"});

        shopIds.printObject();
        shopNames.printObject();
    }
}

class Shop<T> {
    private final T[] array;

    public Shop(T[] array) {
        this.array = array;
    }

    public void printObject() {
        System.out.println(Arrays.toString(array));
    }
}

