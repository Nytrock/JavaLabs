package Lesson7;

public class Task1 {
    public static void main(String[] args) {
        byte value = 127;
        value = (byte) (value + 3);
        int result = value >>> 2;
        System.out.println(result);
    }
}
