package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for(int i = 0; i < mass.length; i++){
            mass[i] = 2 + i*2;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for(int item : mass){
            System.out.println(item);
        }
    }

}
