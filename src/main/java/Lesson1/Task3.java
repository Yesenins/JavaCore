package Lesson1;

public class Task3 {
    public static void main(String[] args) {
        int number = 210;
        number = number < 0 ? number-= 2 : number > 0 ? number++ : 10;
        System.out.println(number);
    }
}
