package BinarySearch;

public class UpperBound {
    public static int upperBound(int []arr, int x, int n){
        int ub = n;
        int s  = 0;
        int e =  n-1;

        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid] <= x){
                s = mid + 1;
            }

            else{
                ub = mid;
                e = mid - 1;
            }
        }
        return ub;
    }
}
