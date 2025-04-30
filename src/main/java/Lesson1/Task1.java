package Lesson1;

public class Task1 {
    public static void main(String[] args) {
        int a = -100000;
        if (a < 0) {
            System.out.println(a + " является отрицательным");
        } else if (a == 0) {
            System.out.println(a + " является нулем");
        } else {
            System.out.println(a + " является положительным");
        }
        int quantity = String.valueOf(Math.abs(a)).length();
        System.out.printf("Число %d является %d-значным числом", a, quantity);
    }
}
