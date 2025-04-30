public class Main {

    static boolean searchIn2DMatrix(int[][] arr, int target) {
        // number of rows=n, number of cols=m;
        int n = arr.length;
        int m = arr[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            }
            if (target<arr[i][j]) {
                j--;
            } else {
                i++;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 } };
        int target = 19;
        System.out.println(searchIn2DMatrix(arr, target));

    }
}
