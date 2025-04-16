import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void isPresent(int[] arr, int idx, int x) {
        if (idx >= arr.length) {
            System.out.println("-1");
            return;

        }
        if (arr[idx] == x) {
            System.out.print(idx + " ");
            
        }
        isPresent(arr, idx + 1, x);

    }

    public static void main(String[] args) {

        System.out.println("Hello World");

        int[] arr = { 1, 2, 4, 7, 9, 10, 7, 0, 7 };
        int idx = 0;
        int x = 7;
        isPresent(arr, idx, x);

    }
}