import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    // print the sum of the element  of the array;
    public static int sum(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int ans = sum(arr, idx + 1);
     
        return ans+arr[idx];

    }

    public static void main(String[] args) {

        int[] arr = { 5, 40, 2, 3, 100, 5 };
        int idx = 0;
        System.out.println(sum(arr, idx));

    }
}