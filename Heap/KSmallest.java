package Heap;

import java.util.PriorityQueue;

public class KSmallest {

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < r - l + 1; i++) {
            if (minHeap.size() < k) {
                minHeap.offer(arr[i]);
            }

            else if (arr[i] < minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }

        return minHeap.peek();
    }
}
