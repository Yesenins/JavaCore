package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 9;
        if(a + b > c && b + c > a && a + c > b){
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }
}
