import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static int power(int a, int b) {
        if (a == 1) {
            return b;

        }
        if (b == 1) {
            return a;
        }
        return a * power(a, b - 1);

    }

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        System.out.println(power(a, b));

    }
}