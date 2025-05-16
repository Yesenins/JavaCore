package Lesson4.entity;

public class Checker {

    public boolean winnerChecker(int[][] mass) {
        if(diagonalChecker(mass) || drawChecker(mass) || otherDiagonalChecker(mass) || horizontalChecker(mass) || verticalChecker(mass)) {
            return true;
        }
        return false;
    }

    public boolean diagonalChecker(int[][] mass){
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i == j && mass[i][j] == 1){
                    counter1++;
                } else if (i == j && mass[i][j] == 2) {
                    counter2++;
                }
            }
        }
        if(counter1 == 3) {
            System.out.println("Игрок 1 победил! ");
            return true;
        } else if (counter2 == 3) {
            System.out.println("Игрок 2 победил! ");
            return true;
        }
        return false;
    }

    public boolean verticalChecker(int[][] mass) {
        int counter1 = 0;
        int counter2 = 0;
        int j = 0;
        while(j < 3) {
            for (int i = 0; i < mass.length; i++) {
                if (mass[i][j] == 1) {
                    counter1++;
                } else if (mass[i][j] == 2) {
                    counter2++;
                }
            }
            if(counter1 == 3) {
                System.out.println("Игрок 1 победил! ");
                return true;
            } else if (counter2 == 3) {
                System.out.println("Игрок 2 победил! ");
                return true;
            } else {
                counter1 = 0;
                counter2 = 0;
                j++;
            }
        }
        return false;
    }

    public boolean horizontalChecker(int[][] mass) {
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i][j] == 1){
                    counter1++;
                } else if (mass[i][j] == 2) {
                    counter2++;
                }
            }
            if(counter1 == 3) {
                System.out.println("Игрок 1 победил! ");
                return true;
            } else if (counter2 == 3) {
                System.out.println("Игрок 2 победил! ");
                return true;
            } else {
                counter1 = 0;
                counter2 = 0;
            }
        }
        return false;
    }

    public boolean otherDiagonalChecker(int[][] mass) {
        int counter1 = 0;
        int counter2 = 0;
        int c = mass.length-1;
        for (int i = 0; i < mass.length; i++) {
            for (int j = mass.length-1; j >= 0; j--) {
                if (c == j && mass[i][j] == 1){
                    counter1++;
                    c--;
                    break;
                } else if (c == j && mass[i][j] == 2) {
                    counter2++;
                    c--;
                    break;
                }
            }
        }
        if(counter1 == 3) {
            System.out.println("Игрок 1 победил! ");
            return true;
        } else if (counter2 == 3) {
            System.out.println("Игрок 2 победил! ");
            return true;
        }
        return false;
    }

    public boolean drawChecker(int[][] mass) {
        int counter = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if(mass[i][j] == 0) {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Поздравляем! У Вас ничья!");
            return true;
        }
        return false;
    }
}
