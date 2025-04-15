import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static boolean isPresent(int[] arr,int idx,int x){
        if(idx>=arr.length){
            return false;

        }
        if(arr[idx]==x){
            return true;
        }
        return isPresent(arr, idx+1, x);

    }

   

    public static void main(String[] args) {

        System.out.println("Hello World");

        int[] arr={1,2,4,7,9,10,5,0,60};
        int idx=0;
        int x=600;
        System.out.println(isPresent(arr, idx, x));

      


    }
}