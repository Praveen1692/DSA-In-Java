import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    // write a program to print all natural number from n to 1;

    static int fact(int n){
        // base condition
        if(n==0 || n==1){
            return n;
        }
        return n*fact(n-1);
    }

    
    public static void main(String[] args) {

        int n = 5;
        System.out.println(fact(n));

    }
}