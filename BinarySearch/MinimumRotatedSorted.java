package BinarySearch;

public class MinimumRotatedSorted {
    public int findMin(int[] nums){
        int s = 0;
        int e = nums.length - 1;

        while(s<=e){
            if(nums[s] <=  nums[e]){
                return nums[s];
            }

            int mid = s + (e - s)/2;
            if(nums[mid] >= nums[s]){
                s = mid + 1;
            }

            else{
                e = mid;
            }
        }

        return 0;
    }
}
