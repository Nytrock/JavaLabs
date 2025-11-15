package Lesson2;

class Student {
    protected final String name;
    protected final String surname;
    protected final String group;
    protected final float averageMark;

    public Student(String name, String surname, String group, float averageMark) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        if (Float.compare(averageMark, 4.0f) > 0)
            return 5000;
        return 3500;
    }

    public void printInfo(){
        System.out.printf("Имя студента: %s", name);
        System.out.println();
        System.out.printf("Фамилия студента: %s", surname);
        System.out.println();
        System.out.printf("Группа: %s", group);
        System.out.println();
        System.out.printf("Средний балл: %f", averageMark);
        System.out.println();
        System.out.printf("Размер стипендии: %d", getScholarship());
        System.out.println();
    }
}

class Aspirant extends Student {
    public Aspirant(String name, String surname, String group, float averageMark) {
        super(name, surname, group, averageMark);
    }

    @Override
    public int getScholarship() {
        if (Float.compare(averageMark, 4.5f) > 0)
            return 10000;
        return 8500;
    }

    @Override
    public void printInfo() {
        System.out.printf("Имя аспиранта: %s", name);
        System.out.println();
        System.out.printf("Фамилия аспиранта: %s", surname);
        System.out.println();
        System.out.printf("Группа: %s", group);
        System.out.println();
        System.out.printf("Средний балл: %f", averageMark);
        System.out.println();
        System.out.printf("Размер стипендии: %d", getScholarship());
        System.out.println();
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Aspirant("Екатерина", "Филонова", "ИСТ-101", 5.0f);
        students[1] = new Student("Артем", "Пастухов", "ИСТ-201", 3.9f);
        students[2] = new Student("Антон", "Жориков", "ИСТ-301", 4.5f);

        for (Student student : students){
            student.printInfo();
            System.out.println();
        }
    }
}
