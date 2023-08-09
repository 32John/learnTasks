package SeaBattle;

import java.util.Scanner;
import static SeaBattle.Cell.*;
import static SeaBattle.Messages.*;

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
    public static Cell[][] ship4(Cell[][] cells) {
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] arr1 = str.split(";");
            for (String arr : arr1) {
                String[] arr2 = arr.split(",");
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)){
                    throw new NumberFormatException();
                }
                if ((x > 10 || x < 1) || (y > 10 || y < 1)) {
                    System.out.println("Не корректные координаты! Введите координаты заново");
                    ship4(cells);
                } else {
                    cells[y][x] = SHIP;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            ship4(cells);
        }
        return cells;

    }
    public static Cell[][] ship3(Cell[][] cells){
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] arr1 = str.split(";");
            for (String arr : arr1) {
                String[] arr2 = arr.split(",");
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)) {
                    throw new NumberFormatException();
                }
                if ((x > 10 || x < 1) || (y > 10 || y < 1)) {
                    System.out.println("Не корректные координаты! Введите координаты заново");
                    ship3(cells);
                } else {
                    cells[y][x] = SHIP;
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            ship3(cells);
        }
        return cells;
    }
    public static Cell[][] ship2(Cell[][] cells){
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] arr1 = str.split(";");
            for (String arr : arr1) {
                String[] arr2 = arr.split(",");
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)) {
                    throw new NumberFormatException();
                }
                if ((x > 10 || x < 1) || (y > 10 || y < 1)) {
                    cells[y][x] = SHIP;
                } else {
                    System.out.println("Не корректные координаты! Введите координаты занова");
                    ship2(cells);
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            ship2(cells);
        }
        return cells;
    }
    public static Cell[][] ship1(Cell[][] cells){
        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] arr1 = str.split(";");
            for (String arr : arr1) {
                String[] arr2 = arr.split(",");
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)) {
                    throw new NumberFormatException();
                }
                if ((x > 10 || x < 1) || (y > 10 || y < 1)) {
                    System.out.println("Не корректные координаты! Введите координаты заново");
                    ship1(cells);
                } else {
                    cells[y][x] = SHIP;
                }
            }
        }catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            ship1(cells);
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
