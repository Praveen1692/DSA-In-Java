import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void permute(String str,int l,int r){

    }
    static String swap(String str,int i,int j){
        char[] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        
    }

    public static void main(String[] args) {

      int[] arr={1,2};
      int idx=0;
      printSequence(arr, idx, new ArrayList<>() );

    }
}