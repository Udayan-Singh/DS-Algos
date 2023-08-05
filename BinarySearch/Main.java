package BinarySearch;

public class Main {
    public static int binarySearch(int[] arr, int target){
        int s = 0; 
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                e = mid - 1;
            }

            else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
