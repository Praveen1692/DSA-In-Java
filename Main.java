import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static int power(int a, int b) {
        if (b == 1) {
            return a;
        }
        if(a==1){
            return b;
        }
        int result=power(a, b/2);
        return result*result;
    }
    
    

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        System.out.println(power(a, b));

    }
}