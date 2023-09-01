package Arrays.SlidingWindow.Fixed;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];

        Deque<Integer> q = new LinkedList<>();
        int i = 0, j = 0;

        while (j < nums.length) {
            if (q.isEmpty()) {
                q.add(nums[j]);
            }

            else {
                if (nums[j] > q.peekLast()) {
                    q.removeLast();
                }
                q.add(nums[j]);
            }

            if (j - i + 1 < k) {
                j++;
            }

            else {
                ans[i] = q.peekFirst();
                if (nums[i] == q.peekFirst()) {
                    q.removeFirst();
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}
