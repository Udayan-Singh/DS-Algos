package BinarySearch;

public class LowerBound {
    public static int lowerBound(int[] arr, int target){
        int lb = arr.length;
        int s  = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid] >= target){
                lb = mid;
                e = mid - 1;
            }

            else{
                s = mid + 1;
            }
        }
        return lb;
    }
}
