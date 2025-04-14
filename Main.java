import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

   // print the array recurively;
   public static void print(int[] arr,int idx){
    if(idx==arr.length-1){
        System.out.print(arr[idx]+ " ");
        return;
    }
    System.out.print(arr[idx]+ " ");
    print(arr, idx+1);
   }

    

    public static void main(String[] args) {

        int[] arr={5,4,2,3,1,5};
        int idx=0;
        print(arr, idx);
       

    }
}