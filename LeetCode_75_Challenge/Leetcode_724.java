package LeetCode_75_Challenge;

public class Leetcode_724 {
    public static int pivotIndexFinder(int[] nums) {
        // First I am finding the sum of total nums
        int leftsum = 0; int totalsum=0;
        for(int i=0; i<nums.length; i++) {
            totalsum += nums[i];
        }
        for(int i=0; i<nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];
            if(leftsum == rightsum) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int pivotIndex = pivotIndexFinder(nums);
        System.out.println(pivotIndex);
    }
}
