import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    // write a program to print all natural number from n to 1;

    public static int secondLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }


    

    public static void main(String[] args) {

        int[] arr={10,50,40,30,20};
        System.out.println(secondLargest(arr));

    }
}