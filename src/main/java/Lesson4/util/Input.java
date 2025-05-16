package Lesson4.util;

import java.util.Scanner;

public class Input {

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number < 4 && number > 0){
                return number;
            }
            else {
                System.out.println("Вы вышли за границы поля! Введите число в диапазоне от 1 до 3 ");
                return inputNumber();
            }
        }
        else {
            System.out.println("Вы ввели недопустимое значение! Попробуйте снова! ");
            return inputNumber();
        }
    }

    public static int inputRow() {
        System.out.println("Введите ряд: ");
        return inputNumber() - 1;
    }

    public static int inputColumn() {
        System.out.println("Введите колонку: ");
        return inputNumber() - 1;
    }
}
