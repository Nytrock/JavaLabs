package Lesson2;

class Driver extends Person {
    private final int experience;
    private final String category;

    public Driver(String fullName, int age, String gender, int experience, String category) {
        super(fullName, age, gender);
        this.experience = experience;
        this.category = category;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Стаж вождения: " + experience + " года(лет)");
        System.out.println("Категория водительских прав: " + category);
    }
}

class Engine {
    private final double volume;
    private final int horsepower;

    public Engine(double volume, int horsepower) {
        this.volume = volume;
        this.horsepower = horsepower;
    }

    public void info() {
        System.out.println("Объем двигателя: " + volume + " литра(литров)");
        System.out.println("Мощность: " + horsepower + " лошадиных сил");
    }
}

class Person {
    protected String fullName;
    protected int age;
    protected String gender;

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public void info() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Возраст: " + age + " года(лет)");
        System.out.println("Пол: " + gender);
    }
}

class Car {
    protected final String brand;
    protected final String model;
    protected final int weight;
    protected final Driver driver;
    protected final Engine engine;

    public Car(String brand, String model, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void getDriverInfo(){
        driver.info();
    }

    public void getEngineInfo(){
        engine.info();
    }

    public void print() {
        System.out.println("Информация об автомобиле:");
        System.out.println("Марка автомобиля: " + brand);
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Вес автомобиля: " + weight + " киллограмм(киллограммов)");
        engine.info();
    }
}

class Lorry extends Car {
    private final int loadCapacity;

    public Lorry(String brand, String model, int weight, int loadCapacity, Driver driver, Engine engine) {
        super(brand, model, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void print() {
        System.out.println("Информация о грузовике:");
        System.out.println("Марка автомобиля: " + brand);
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Вес автомобиля: " + weight + " киллограмм(киллограммов)");
        System.out.println("Грузоподъемность: " + loadCapacity + " киллограмм(киллограммов)");
        engine.info();
    }

    @Override
    public void start() {
        System.out.println("Поехали на грузовике");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаемся на грузовике");
    }

    @Override
    public void turnLeft() {
        System.out.println("Грузовик поворачивает налево");
    }

    @Override
    public void turnRight() {
        System.out.println("Грузовик поворачивает направо");
    }
}

class SportCar extends Car {
    private final int maxSpeed;

    public SportCar(String brand, String model, int weight, int maxSpeed, Driver driver, Engine engine) {
        super(brand, model, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void print() {
        System.out.println("Информация о спорткаре:");
        System.out.println("Марка автомобиля: " + brand);
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Вес автомобиля: " + weight + " киллограмм(киллограммов)");
        System.out.println("Максимальная скорость: " + maxSpeed + " км/ч");
        engine.info();
    }

    @Override
    public void start() {
        System.out.println("Поехали на спорткаре");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаемся на спорткаре");
    }

    @Override
    public void turnLeft() {
        System.out.println("Спорткар поворачивает налево");
    }

    @Override
    public void turnRight() {
        System.out.println("Спорткар поворачивает направо");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Car car = new Car(
                "BMW", "X5", 3000,
                new Driver("Иван Иванов", 25, "Мужской", 3, "B"),
                new Engine(3.5, 171)
        );
        Lorry lorry = new Lorry(
                "Камаз", "KAMAZ-4308-69", 7000, 3000,
                new Driver("Алексей Алешин", 30, "Мужской", 10, "C"),
                new Engine(11.0, 500)
        );
        SportCar sport = new SportCar(
                "Lamborghini", "Aventador", 1500, 350,
                new Driver("Антон Антонов", 27, "Мужской", 4, "B,C"),
                new Engine(6.5, 700)
        );

        car.print();
        System.out.println("Информация о водителе:");
        car.getDriverInfo();
        System.out.println();
        System.out.println("Начинаем движение на обычном автомобиле: ");
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        System.out.println();

        lorry.print();
        System.out.println("Информация о водителе:");
        lorry.getDriverInfo();
        System.out.println();
        System.out.println("Начинаем движение на грузовике: ");
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        System.out.println();

        sport.print();
        System.out.println("Информация о водителе:");
        lorry.getDriverInfo();
        System.out.println();
        System.out.println("Начинаем движение на спорткаре: ");
        sport.start();
        sport.turnLeft();
        sport.turnRight();
        sport.stop();
    }
}
