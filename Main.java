public class Main {

    static int searchInRotated(int[] arr){
        int ans=Integer.MIN_VALUE;
        int n=arr.length;
        int start=0;

        int end=n-1;
        while (start<=end) {
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[n-1]){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }

            
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(searchInRotated(arr));

        System.out.println("Hello World");
    }
}
