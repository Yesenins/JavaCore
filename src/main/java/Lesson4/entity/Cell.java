package Lesson4.entity;

import Lesson4.util.Input;

public class Cell {

    public void gameChoose(Player player, int[][] field) {
        if(player.getName().contains("X")){
            swap(field, 1);
        } else {
            swap(field, 2);
        }
    }

    public void swap(int[][] field, int number) {
        boolean flag = true;
        while(flag){
            int i = Input.inputRow();
            int j = Input.inputColumn();
            if (field[i][j] == 0){
                field[i][j] = number;
                flag = false;
            } else{
                System.out.println("Ячейка занята! Выберите другую");
            }
        }

    }
}
