import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void printSequence(int[] arr, int idx, ArrayList<Integer> tempArr) {
        // base case
        if (idx == arr.length) {
            if (tempArr.size() > 0) {
                System.out.print(tempArr+" ");

            }
            return;
        }

        // recursive call-->
        // 1-include
        printSequence(arr, idx + 1, tempArr);
        tempArr.add(arr[idx]);
        // 2- do not include;
        printSequence(arr, idx + 1, tempArr);

        // remove last value;
        tempArr.remove(tempArr.size() - 1);

    }

    public static void main(String[] args) {

      int[] arr={1,2};
      int idx=0;
      printSequence(arr, idx, new ArrayList<>() );

    }
}