package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[4];
        boolean isIncrease = true;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 1; i < mass.length; i ++){
            if(mass[i] <= mass[i - 1]){
                isIncrease = false;
                break;
            }
        }
        String output = isIncrease ? "Массив является строго возрастающей последовательностью" : "Массив НЕ является строго возрастающей последовательностью" ;
        System.out.println(output);
    }
}
