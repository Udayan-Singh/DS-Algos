package BinarySearch;

public class RotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[s] == nums[mid] && nums[mid] == nums[e]){
                s++;
                e--;
                continue;
            }

            if(nums[s] <= nums[mid]){
                if(target<=nums[s] || target>=nums[mid]){
                    s = mid + 1;
                }

                else{
                    e = mid - 1;
                }
            }

            else{
                if(target>=nums[e] || target<=nums[mid]){
                    e = mid - 1;
                }

                else{
                    s = mid + 1;
                }
            }
        }

        return false;
    }
}
