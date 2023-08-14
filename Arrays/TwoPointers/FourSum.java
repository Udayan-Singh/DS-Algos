package Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();
        if(n==0 || nums == null){
            return ans;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n-1; j++) {
                int t = target - nums[j] - nums[i];

                int low = j+1;
                int high = n-1;

                while (low<high) {
                    if(nums[low]+nums[high] < t){
                        low++;
                    }
                    else if(nums[low]+nums[high] > t){
                        high--;
                    }
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        ans.add(list);

                        while(low<high && nums[low]==list.get(2)){
                            low++;
                        }

                        while(low<high && nums[high]==list.get(3)){
                            high--;
                        }

                    }
                }
                while(j+1<n && nums[j] == nums[j+1]){
                        j++;
                    }
            }
            while(i+1<n && nums[i]==nums[i+1]){
                i++;
            }
        }

        return ans;
    }
}
