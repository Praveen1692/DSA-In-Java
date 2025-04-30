public class Main {

   

    public static void main(String[] args) {
        System.out.println("Hello");
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 106;
        System.out.println(searchIn2DMatrix(arr, target));

    }
}
