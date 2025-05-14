package LeetCode_75_Challenge;

public class Leetcode_643 {
    public static double findavg(int [] nums, int k){
         int windowsum = 0;
        for(int i=0; i<k; i++){
            windowsum += nums[i];
        }
        int avgmax = windowsum;
        for(int i=k; i<nums.length; i++){
            windowsum += nums[i] - nums[i - k];
            avgmax = Math.max(avgmax, windowsum);
        }
        return (double) avgmax / k;
    }
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        System.out.println(findavg(nums, 4));
    }
}

