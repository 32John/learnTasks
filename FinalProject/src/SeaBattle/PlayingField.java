package SeaBattle;

import java.util.Scanner;
import static SeaBattle.Cell.*;
import static SeaBattle.Main.*;

public class PlayingField {
    private Cell[][] playingField;

    public PlayingField(Cell[][] playingField) {
        this.playingField = playingField;
    }
    public void print() {
        for (Cell[] cells: playingField){
            for (Cell cell: cells){
                System.out.print(cell);
            }
            System.out.println();
        }
    }



    public Cell[][] test(Cell[][] cells){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты 4х палубного корабля");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        cells[x][y] = SHIP;
        return cells;
    }



}
