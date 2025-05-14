package SlidingWindow;

public class BruteForceMaxSumSubArray {
    public static int maxSumSubArray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k ; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println("max brute force approach " + maxSumSubArray(arr,k));
        // time complexity is O(n*k)
            }
    }

