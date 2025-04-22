import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;

    }

    static void countSort(int[] arr) {

        int max=findMax(arr);

    }

    public static void main(String[] args) {

        System.out.println("Hello");
        int[] arr = { 10, 50, 90, 70, 60, 40 };
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}