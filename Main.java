import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a>b){
            return GCD(a-b, b);
        }else{
            return GCD(a, b-a);
        }
    }

    

    public static void main(String[] args) {

        int a=4;
        int b=9;
        System.out.println(GCD(a, b));
       

    }
}