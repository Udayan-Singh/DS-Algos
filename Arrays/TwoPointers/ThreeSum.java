package Arrays.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                if(nums[k] + nums[j] == 0 - nums[i]){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }

                else if(nums[j] + nums[k] < 0 - nums[i]){
                    j++;
                }

                else{
                    k--;
                }
            }
        }

        ans.addAll(s);
        return ans;
    }
}
