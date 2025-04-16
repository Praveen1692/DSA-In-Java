import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static String Remove(String str, int idx, int n) {
        if (idx >= n) {
            return "";
        }
        if (str.charAt(idx) == 'a') {
            return Remove(str, idx + 1, n);
        }
        return str.charAt(idx) + Remove(str, idx + 1, n);
    }
    public static void main(String[] args) {

        System.out.println("Hello World");
        String str = "abacax";
        int n = str.length();
        int idx = 0;
        System.out.println(Remove(str, idx, n));

    }
}