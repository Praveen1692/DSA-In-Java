import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.print(str + " ");
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);

                // backtring;
                str = swap(str, l, i);
            }
        }

    }

    static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        String str="ABC";
        int l=0;
        int r=str.length()-1;

        permute(str, l, r);

    }
}