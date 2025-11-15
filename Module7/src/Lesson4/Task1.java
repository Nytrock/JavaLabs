package Lesson4;

abstract class Vehicle {
    protected double speed;
    protected double costPerKm;

    public double time(double distance) {
        return distance / speed;
    }

    public double cost() {
        return costPerKm;
    }
}


class Car extends Vehicle {
    public Car() {
        speed = 80;
        costPerKm = 10;
    }
}


class Motorcycle extends Vehicle {
    public Motorcycle() {
        speed = 110;
        costPerKm = 7;
    }
}


class Bicycle extends Vehicle {
    public Bicycle() {
        speed = 15;
        costPerKm = 5;
    }
}


class Cart extends Vehicle {
    public Cart() {
        speed = 10;
        costPerKm = 3;
    }
}

public class Task1 {
    public static void main(String[] args) {
        double distance = 50.0;
        Vehicle[] transports = { new Bicycle(), new Car(), new Motorcycle(), new Cart() };

        System.out.println("Время перевозки каждым транспортом:");
        for (Vehicle v : transports) {
            System.out.printf("class %s %.2f ч\n", v.getClass().getSimpleName(), v.time(distance));
        }

        System.out.println();
        System.out.println("Стоимость перевозки каждым транспортом:");
        for (Vehicle v : transports) {
            System.out.printf("class %s %.2f руб/км]\n", v.getClass().getSimpleName(), v.cost());
        }
    }
}
