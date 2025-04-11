import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    // given a number num and a value k, print k multiples of num;
    public static void multiples(int num, int k) {
        // base case
        if (k == 1) {
            System.out.print(num * k + " ");
            return;

        }
        multiples(num, k - 1);
        int finaal = num * k;
        System.out.print(finaal + " ");

    }

    public static void main(String[] args) {

        int num = 3;
        int k = 8;
        multiples(num, k);
    }
}