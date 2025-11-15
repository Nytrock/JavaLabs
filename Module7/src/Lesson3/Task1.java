package Lesson3;


class Animal {
    public void voice() {
        System.out.println("Животное издает звук");
    }
}


class Cat extends Animal {
    private final String breed;
    private final double height;
    private final double weight;

    public Cat(String breed, double height, double weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


class Dog extends Animal {
    private final String breed;
    private final double height;
    private final double weight;

    public Dog(String breed, double height, double weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


class Cow extends Animal {
    private final String breed;
    private final double height;
    private final double weight;

    public Cow(String breed, double height, double weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Мууу");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


class Pig extends Animal {
    private final String breed;
    private final double height;
    private final double weight;

    public Pig(String breed, double height, double weight) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Хрю");
    }

    @Override
    public String toString() {
        return "Pig{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Сиамская", 23.0, 5.0);
        Dog dog = new Dog("Американский стаффордширский терьер", 47.0, 27.0);
        Cow cow = new Cow("Англерская", 130.0, 700.0);
        Pig pig = new Pig("Aнгельнский седлбэк", 87.0, 300.0);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(cow);
        System.out.println(pig);
    }
}
