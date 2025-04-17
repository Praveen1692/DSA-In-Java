import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void printSequence(int[] arr, int idx, ArrayList<Integer> tempArr) {
        // base case
        if (idx == arr.length) {
            if (tempArr.size() > 0) {
                System.out.println(tempArr);

            }
            return;
        }

        //recursive call


    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        int n = 3;
        System.out.println(tilingProblem(n));

    }
}