package Day18.Task01;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 25, 30, 35};
        System.out.println(recursionSum(numbers, numbers.length));
    }
    public static int recursionSum(int[] arr, int counter) {
       if (counter == 1) {
           return arr[0];
       }
     return arr[counter - 1] + recursionSum(arr, counter - 1) ;
    }
}
