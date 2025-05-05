package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[12];
        int index = 0;
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 16);
        }
        System.out.println(Arrays.toString(mass));

        for (int i = 1; i < mass.length; i++) {
            if(mass[i] >= mass[i-1]){
                max = mass[i];
                index = i;
            }
        }
        System.out.printf("Максимальное число в массиве: %d, индекс числа в массиве : %d", max, index);
    }
}
