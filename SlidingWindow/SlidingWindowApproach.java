package SlidingWindow;

public class SlidingWindowApproach {
    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0, windowSum = 0;

        // Compute the sum of the first k elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Add new element, remove old
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarray(nums, k)); // Output: 9
    }
}
