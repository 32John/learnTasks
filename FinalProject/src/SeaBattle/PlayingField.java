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



    public Cell[][] ship4(Cell[][] cells){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты 4х палубного корабля");
        String str = scanner.nextLine();
        int x = 0;
        int y = 0;
        String[] arr1 = str.split(";");
        for (String arr: arr1){
            String[] arr2 = arr.split(",");
            x = Integer.parseInt(arr2[0]);
            y = Integer.parseInt(arr2[1]);
            cells[y][x] = SHIP;
        }


        return cells;
    }



}
