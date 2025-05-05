package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < mass1.length; i++){
            mass1[i] = random.nextInt(0, 15);
            counter1 += mass1[i];
            mass2[i] = random.nextInt(0, 15);
            counter2 += mass2[i];
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));

        double average1 = counter1 / 5;
        double average2 = counter2 / 5;

        if(average1 > average2) {
            System.out.println("Среднее арифметическое массива 1 больше: " + average1);
        } else if (average2 > average1) {
            System.out.println("Среднее арифметическое массива 2 больше: " + average2);
        } else {
            System.out.println("Средние арифметические двух массивов равны");
        }
    }
}
