import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    // given a number n. find the sum of natural numbers till n but with alternate singns;

    static int alternateSign(int n) {

        // base case
        if (n == 1) {
            return n;

        }
        if (n % 2 == 0) {
            return alternateSign(n - 1) - n;

        } else {
            return alternateSign(n - 1) + n;
        }
    }

    public static void main(String[] args) {

        int num = 10;
        System.out.println(alternateSign(num));

    }
}