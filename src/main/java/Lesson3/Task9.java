package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean[] mass = new boolean[11];
        double counter = 0;
        for (int i = 0; i < mass.length; i++){
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if (number == random.nextInt(2)){
                mass[i] = true;
                counter++;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Процентное соотношение побед : " + counter/11*100);
    }
}
