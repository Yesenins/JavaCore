package Lesson4.entity;

import Lesson4.util.Input;

public class Game {

    public void newGame(){

        System.out.println("Введите имя 1 игрока: ");
        String namePlayer1 = Input.inputName();
        System.out.println("Введите имя 2 игрока: ");
        String namePlayer2 = Input.inputName();
        Player[] players = {new Player(namePlayer1 + " (X)"), new Player(namePlayer2 + " (O)")};
        Field field = new Field();
        int[][] gameField = field.createField();
        Cell cell = new Cell();
        Checker checker = new Checker();
        boolean flag = false;
        field.displayField(gameField);
        while (!flag) {
            for (int i = 0; i < players.length; i++) {
                System.out.println("Ход игрока " + players[i].getName());
                cell.gameChoose(players[i], gameField);
                field.displayField(gameField);
                if(checker.winnerChecker(gameField)){
                    flag = true;
                    break;
                }
            }
        }
    }
}
