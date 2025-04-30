package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        double distance = 10;
        double totalDistance = 10;
        for(int i = 1; i < 7; i++) {
            distance = distance + distance * 0.1;
            totalDistance += distance;
        }
        System.out.println(totalDistance);
    }
}
