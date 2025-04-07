import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    // write a program to print all natural number from 1 to n;

    public static void pp(int n) {
        
        // base case
        if (n <1) {

            return;
        }
        pp(n-1);
        System.out.print(n+" ");

    }

    public static void main(String[] args) {

        int n = 10;
        pp(n);

    }
}