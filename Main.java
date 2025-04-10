import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static int power(int a, int b) {
        if (b == 1) {
            return a;
        }
        if (a == 1) {
            return b;
        }
        int result = power(a, b / 2);
        return result * result;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 200, 25 };
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    newarr[i] = arr[j];
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(newarr));

    }
}