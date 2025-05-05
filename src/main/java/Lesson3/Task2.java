package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int size = (99 - 1) / 2 + 1;
        int[] mass = new int[size];
        for(int i = 0; i < mass.length; i++){
            mass[i] = 1 + i * 2;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = mass.length-1; i >= 0; i--){
            System.out.print(mass[i] + " ");
        }
    }
}
