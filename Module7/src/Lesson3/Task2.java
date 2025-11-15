package Lesson3;

import java.util.Arrays;

class Student implements Cloneable {
    private final int id;
    private final String name;
    private final String surname;
    private final String group;
    private int[] grades;

    public Student(int id, String name, String surname, String group, int[] grades) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.grades = grades;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.grades = grades.clone();
        return cloned;
    }

    public void changeGrade(int index, int newGrade){
        grades[index] = newGrade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this == obj)
            return true;

        if (this.getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        return id == other.id &&
                name.equals(other.name) &&
                surname.equals(other.surname) &&
                group.equals(other.group) &&
                Arrays.equals(grades, other.grades);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}

public class Task2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student original = new Student(1, "Иван", "Иванов", "ИСТ-101", new int[]{2,4,5,4,5});

        Student clone = (Student) original.clone();
        clone.changeGrade(0, 4);

        System.out.println(original);
        System.out.println(clone);
        System.out.println(original.equals(clone));
        System.out.println(original.hashCode());
        System.out.println(clone.hashCode());
    }
}
