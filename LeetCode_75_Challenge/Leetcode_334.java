package LeetCode_75_Challenge;

public class Leetcode_334 {
    public static boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int ind = 0; ind < nums.length; ind++) {
            if (nums[ind] <= small) {
                small = nums[ind];
            } else if (nums[ind] <= mid) {
                mid = nums[ind];
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));

    }
}
