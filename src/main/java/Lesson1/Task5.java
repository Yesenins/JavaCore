package Lesson1;

import java.util.Scanner;

public class Task5 {
    public static String getProgrammersForm(int number) {
        int mod100 = number % 100;
        int mod10 = number % 10;

        if (mod100 >= 11 && mod100 <= 19) {
            return number + " программистов";
        }
        if (mod10 == 1) {
            return number + " программист";
        }
        if (mod10 >= 2 && mod10 <= 4) {
            return number + " программиста";
        }
        return number + " программистов";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число программистов: ");
        int number = scan.nextInt();
        System.out.println(getProgrammersForm(number));
    }

}
