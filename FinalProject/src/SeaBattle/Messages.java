package SeaBattle;

public class Messages {
    private String message;

    public Messages(String message) {
        this.message = message;
    }


    public static  void messagePrint4() {
        String message = "Введите координаты 4х палубного корабля" + "\n" +
                "формат ввода: x,y;x,y;x,y;x,y 7";
        System.out.println(message);
    }
}
