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
        for (Cell[] cells : playingField) {
            for (Cell cell : cells) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public  Cell[][] ship4(Cell[][] cells) {
 //       for (int i = 1; i < 5; i++) {

  /*          for (int j = i; j <= i; j++) {
                int paluba = 5 - i;
                System.out.println(paluba + " " + "корабль");
                try {*/
                    Scanner scanner= new Scanner(System.in);
                    String str = scanner.nextLine();
                    String[] arr1 = str.split(";");
                    for (String arr : arr1) {
                        String[] arr2 = arr.split(",");
//                        if (arr2.length != 2) {
//                            System.out.println("Некорректные координаты! координата состоит из 2х чисел, c запятой." + "\n" +
//                                    "Введите координаты заново");
//                            ship4(cells);
//                        }
                        int x = Integer.parseInt(arr2[0]);
                        int y = Integer.parseInt(arr2[1]);
//                        if ((x != (int) x) || (y != (int) y)) {
//                            throw new NumberFormatException();
//                        }
 //                        else {
                            cells[y][x] = SHIP;
 //                       }
                    }
 /*                   if (arr1.length != paluba) {
                        System.out.println("Корабль должен состоять из" + " " + paluba + " " + "клеток! Введите координаты как в шаблоне");
                        ship4(cells);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
                    ship4(cells);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Вводите числа от 1 до 10");
                    ship4(cells);
                }*/
 //           }

//        }
        return cells;
    }
   /* public static Cell[][] ship3(Cell[][] cells){

        try {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String[] arr1 = str.split(";");
            for (String arr : arr1) {
                String[] arr2 = arr.split(",");
                if(arr2.length != 2) {
                    System.out.println("Некорректные координаты! координата состоит из 2х чисел, c запятой." + "\n" +
                            "Введите координаты заново");
                    allShips(cells);
                }
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)) {
                    throw new NumberFormatException();
                }
                else {

                    cells[y][x] = SHIP;
                }
            }
            if (arr1.length != 3) {
                System.out.println("Корабль должен состоять из 3х клеток! Введите координаты как в шаблоне");
                allShips(cells);
            }
        }catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            allShips(cells);
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вводите числа от 1 до 10");
            allShips(cells);
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
                if(arr2.length != 2) {
                    System.out.println("Некорректные координаты! координата состоит из 2х чисел, c запятой." + "\n" +
                            "Введите координаты заново");
                    allShips(cells);
                }
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)) {
                    throw new NumberFormatException();
                }
                else {
                    cells[y][x] = SHIP;
                }
            }
            if (arr1.length != 2) {
                System.out.println("Корабль должен состоять из 2х клеток! Введите координаты как в шаблоне");
                allShips(cells);
            }
        }catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            allShips(cells);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вводите числа от 1 до 10");
            allShips(cells);
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
                if(arr2.length != 2) {
                    System.out.println("Некорректные координаты! координата состоит из 2х чисел, c запятой." + "\n" +
                            "Введите координаты заново");
                    allShips(cells);
                }
                int x = Integer.parseInt(arr2[0]);
                int y = Integer.parseInt(arr2[1]);
                if ((x != (int) x) || (y != (int) y)) {
                    throw new NumberFormatException();
                }
                else {
                    cells[y][x] = SHIP;
                }
            }
            if (arr1.length != 1) {
                System.out.println("Корабль должен состоять из 1 клетоки! Введите координаты как в шаблоне");
                allShips(cells);
            }
        }catch (NumberFormatException e) {
            System.out.println("Введённый символ не являеся числом! введите координаты как указано в шаблоне");
            allShips(cells);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вводите числа от 1 до 10");
            allShips(cells);
        }
        return cells;
    }
    public static void allShips(Cell[][] cells){
        System.out.println("Введите координаты 4х палубного корабля" + "\n" + "формат ввода: x,y;x,y;x,y;x,y");
        ship4(cells);

        System.out.println("Введите координаты 1го 3х палубного корабля" + "\n" + "формат ввода: x,y;x,y;x,y");
        ship3(cells);
        System.out.println("Введите координаты 2го 3х палубного корабля" + "\n" + "формат ввода: x,y;x,y;x,y");
        ship3(cells);

        System.out.println("Введите координаты 1го 2х палубного корабля" + "\n" + "формат ввода: x,y;x,y");
        ship2(cells);
        System.out.println("Введите координаты 2го 2х палубного корабля" + "\n" + "формат ввода: x,y;x,y");
        ship2(cells);
        System.out.println("Введите координаты 3го 2х палубного корабля" + "\n" + "формат ввода: x,y;x,y");
        ship2(cells);

        System.out.println("Введите координаты 1го 1 палубного корабля" + "\n" + "формат ввода: x,y");
        ship1(cells);
        System.out.println("Введите координаты 2го 1 палубного корабля" + "\n" + "формат ввода: x,y");
        ship1(cells);
        System.out.println("Введите координаты 3го 1 палубного корабля" + "\n" + "формат ввода: x,y");
        ship1(cells);
        System.out.println("Введите координаты 4го 1 палубного корабля" + "\n" + "формат ввода: x,y");
        ship1(cells);
    }*/
}
