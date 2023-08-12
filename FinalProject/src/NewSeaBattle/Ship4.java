package NewSeaBattle;
import NewSeaBattle.Cell;
import java.util.Scanner;

import static NewSeaBattle.Cell.HALO;
import static NewSeaBattle.Cell.SHIP;

public class Ship4 {
   private Cell[][] cellsShip;

    public Ship4(Cell[][] cellsShip) {
        this.cellsShip = cellsShip;
    }
    public static Cell[][] creatureShip4(Cell[][] cells) {    // создагие корабля с ореолом
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr1 = str.split(";");
        for (String arr : arr1) {
            String[] arr2 = arr.split(",");
            int x = Integer.parseInt(arr2[0]);
            int y = Integer.parseInt(arr2[1]);
            /*cells[y-1][x] = HALO; cells[y-1][x-1] = HALO; cells[y-1][x+1] = HALO;
            cells[y+1][x] = HALO; cells[y+1][x-1] = HALO; cells[y+1][x+1] =HALO;
            cells[y][x-1] = HALO; cells[y][x+1] = HALO;*/
            for (int a = x - 1;a <= (x + 1); a++) {
                for (int b = y - 1; b <= (y + 1); b++) {
                    cells[b][a] = HALO;
                }
            }
        }
        for (String arr: arr1) {
            String[] arr2 = arr.split(",");
            int x = Integer.parseInt(arr2[0]);
            int y = Integer.parseInt(arr2[1]);
            cells[y][x] = SHIP;
        }
        return cells;
    }
    public void print() {
        for (Cell[] cells : cellsShip) {
            for (Cell cell : cells) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
