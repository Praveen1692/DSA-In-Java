public class Main {
    static int searchInRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                return ans;
            } else if (arr[mid] < arr[end]) { // mid to end sorted
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;

                }
            } else {// start to mid is sorted;
                if (target > arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 3, 4, 5, 1, 2 };
        int target = 1;
        System.out.println(searchInRotatedArray(arr, target));
    }
}
