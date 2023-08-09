package SeaBattle;

import java.util.Scanner;
import static SeaBattle.Cell.*;

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
    public static Cell[][] ship4(Cell[][] cells){
        Scanner scanner = new Scanner(System.in);
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
    public static Cell[][] ship3(Cell[][] cells){
        Scanner scanner = new Scanner(System.in);
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
    public static Cell[][] ship2(Cell[][] cells){
        Scanner scanner = new Scanner(System.in);
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
    public static Cell[][] ship1(Cell[][] cells){
        Scanner scanner = new Scanner(System.in);
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
    public void allShips(Cell[][] cells){
        System.out.println("Введите координаты 4х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y;x,y;x,y");
        ship4(cells);

        System.out.println("Введите координаты 1го 3х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y;x,y");
        ship3(cells);
        System.out.println("Введите координаты 2го 3х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y;x,y");
        ship3(cells);

        System.out.println("Введите координаты 1го 2х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y");
        ship2(cells);
        System.out.println("Введите координаты 2го 2х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y");
        ship2(cells);
        System.out.println("Введите координаты 3го 2х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y");
        ship2(cells);

        System.out.println("Введите координаты 1го 1 палубного корабля" + "\n" +
                "формат ввода: x,y");
        ship1(cells);
        System.out.println("Введите координаты 2го 1 палубного корабля" + "\n" +
                "формат ввода: x,y");
        ship1(cells);
        System.out.println("Введите координаты 3го 1 палубного корабля" + "\n" +
                "формат ввода: x,y");
        ship1(cells);
        System.out.println("Введите координаты 4го 1 палубного корабля" + "\n" +
                "формат ввода: x,y");
        ship1(cells);
    }
}
