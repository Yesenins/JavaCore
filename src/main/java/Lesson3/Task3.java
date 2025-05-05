package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[15];
        int counter = 0;
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(0,99);
            if(mass[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(counter);
    }
}
