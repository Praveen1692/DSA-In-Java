import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                // swap the elements arr[j] and arr[j-1];
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;


                j--;

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("print");
        int[] arr={10,20,15,40,30,75};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}