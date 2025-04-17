import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static int tilingProblem(int n) {
        if (n <= 3) {
            return n;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        int n = 3;
        System.out.println(tilingProblem(n));

    }
}