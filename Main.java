import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void sort(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        // swap two number;
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {

        System.out.println("Hello");
        int[] arr = { 10,5,6,7,8,9,3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}