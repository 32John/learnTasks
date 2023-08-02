package Day18.Task02;

public class Main {
    public static void main(String[] args) {
        int number = 575770797;
        System.out.println(count7(number));
    }
    public static int count7(int n) {
        int i = 1;
        if ( n % 10 != 7) {
            i = 0;
        }
        if (n != 7 & n < 10){
            return 0;
        }
        return i + count7(n / 10);
    }
}
