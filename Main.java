public class Main {

    static boolean searchIn2DMatrix(int[][] arr, int target) {
        // number of rows=n, number of cols=m;
        int n = arr.length;
        int m = arr[0].length;
        int start = 0;
        int end = m * n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = arr[mid / m][mid % n];

            if (midElement == target) {
                return true;
            }
            if (target < midElement) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 106;
        System.out.println(searchIn2DMatrix(arr, target));

    }
}
