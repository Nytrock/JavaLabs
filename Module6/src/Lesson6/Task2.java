package Lesson6;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            System.out.println(solution(random.nextInt(-40000, 40000)));
        }
    }

    public static String solution(int number){
        if (Byte.MIN_VALUE < number && number < Byte.MAX_VALUE)
            return "byte " + number;
        else if (Short.MIN_VALUE < number && number < Short.MAX_VALUE)
            return "short " + number;
        else
            return "int " + number;
    }
}
