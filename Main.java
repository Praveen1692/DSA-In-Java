import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    // given an integer , find out the sum of its digits using recursion;
    static int sumOfDigits(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        int sumOfStartindDigit = n / 10;
        int lastDigit = n % 10;
        return sumOfDigits(sumOfStartindDigit) + lastDigit;

    }

    public static void main(String[] args) {

        int n = 1234;
        System.out.println(sumOfDigits(n));

    }
}