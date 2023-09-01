package Arrays.SlidingWindow.Fixed;

import java.util.ArrayList;

public class MaxSum {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        if (Arr.size() == 0) {
            return 0;
        }

        int i = 0, j = 0;
        long max = Long.MIN_VALUE;

        int sum = 0;

        while (j < N) {
            sum += Arr.get(j);
            if (j - i + 1 < K) {
                j++;
            }

            else {
                max = Math.max(max, sum);
                sum -= Arr.get(i);
                i++;
                j++;
            }

        }

        return max;
    }
}
