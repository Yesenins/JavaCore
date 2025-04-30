package Lesson1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Введите первое число: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Введите второе число: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Введите третье число: ");
        numbers[2] = scanner.nextInt();
        int negativeCounter = 0;
        int positiveCounter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                negativeCounter++;
            } else if(numbers[i] > 0){
                positiveCounter++;
            }
        }
        System.out.println("кол-во положительных чисел: " + positiveCounter);
        System.out.println("кол-во отрицательных чисел: " + negativeCounter);
    }
}
