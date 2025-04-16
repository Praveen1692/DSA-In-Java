import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static String Remove(String str, int idx, int n) {
        if (idx >= n) {
            return "";
        }
        char first=str.charAt(idx);

        return Remove(str,idx+1,n)+first;



      
    }
    public static void main(String[] args) {

        System.out.println("Hello World");
        String str = "praveen";
        int n = str.length();
        int idx = 0;
        System.out.println(Remove(str, idx, n));

    }
}