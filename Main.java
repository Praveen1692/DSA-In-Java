import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    // write a program to print all natural number from n to 1;

    public static void pp(int n) {

        // base case
        if (n < 1) {

            return;
        }
        System.out.print(n + " ");
        pp(n - 1);

    }

    public static void main(String[] args) {

        int n = 10;
        pp(n);

    }
}