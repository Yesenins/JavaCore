package Lesson4.entity;

public class Field {

    public int[][] createField() {
        int [][] gameField = new int[3][3];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = 0;
            }
        }
        return gameField;
    }

    public void displayField(int[][] mass) {
        System.out.println("Игровое поле: ");
        char[][] chars = new char[3][3];
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j < mass.length; j++) {
                switch (mass[i][j]) {
                    case 1:
                        chars[i][j] = 'X';
                        break;
                    case 2:
                        chars[i][j] = 'O';
                        break;
                    default:
                        chars[i][j] = '.';
                }
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
    }


}
