package Lesson4;

interface Printable {
    void print();
}

class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Книга");
    }
}

class Newspaper implements Printable {
    @Override
    public void print() {
        System.out.println("Газета");
    }
}

class Leaflet implements Printable {
    @Override
    public void print() {
        System.out.println("Листовка");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Printable[] items = {
                new Book(), new Book(),
                new Newspaper(), new Newspaper(),
                new Leaflet(), new Leaflet()
        };

        System.out.println("Полный список:");
        for (Printable p : items)
            p.print();

        System.out.println();
        System.out.println("Только газеты:");
        printOnlySpecificClass(items, Newspaper.class);

        System.out.println();
        System.out.println("Только книги:");
        printOnlySpecificClass(items, Book.class);

        System.out.println();
        System.out.println("Только листовки:");
        printOnlySpecificClass(items, Leaflet.class);
    }

    public static void printOnlySpecificClass(Printable[] items, Class<?> specificClass) {
        for (Printable item : items)
            if (item.getClass() == specificClass)
                item.print();
    }
}
