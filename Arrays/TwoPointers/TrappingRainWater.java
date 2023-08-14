package Arrays.TwoPointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        int ans  = 0;
        int lmax = 0, rmax = 0;

        int l = 0;
        int r = height.length-1;

        while(l<r){
            if(height[l] <= height[r]){
                if(height[l] >= lmax){
                    lmax = height[l];
                }
                
                else{
                    ans += lmax-height[l];
                }

                l++;
            }

            else{
                if(height[r] >= rmax){
                    rmax = height[r];
                }

                else{
                    ans += rmax - height[r];
                }
                r++;
            }
        }
        return ans;
    }
}
