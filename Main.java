import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    // print the max value of the array;
    public static int print(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int ans = print(arr, idx + 1);
     
        return Math.max(ans, arr[idx]);

    }

    public static void main(String[] args) {

        int[] arr = { 5, 40, 2, 3, 100, 5 };
        int idx = 0;
        System.out.println(print(arr, idx));

    }
}