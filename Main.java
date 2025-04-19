import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static int fog(int[] arr, int n,int idx){
        if(idx==n-1){
            return 0;

        }
       
        int first=Math.abs(arr[idx]-arr[idx+1])+fog(arr, n, idx+1);

        if(idx==n-2){
            return first;
        }
        int second=Math.abs(arr[idx]-arr[idx+2])+fog(arr, n, idx+2);

        
        return Math.min(first, second);
    }

    

    public static void main(String[] args) {

        
        System.out.println("Hello");
        int[] arr={10,30,40,20};
        int n=arr.length;
        int idx=0;
        int ans=0;
        System.out.println(fog(arr, n, idx));

       
        

    }
}