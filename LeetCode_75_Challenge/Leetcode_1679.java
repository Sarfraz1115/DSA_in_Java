package LeetCode_75_Challenge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1679 {
    public static int twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0; int j = nums.length - 1; int count = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == target){
                count++;
                i++; j--;
            } else if (sum < target) {
                i++;
            }else{
                j--;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 3, 4, 2, 3};
        int target = 5;
        System.out.println(twoSum(nums, target));
    }
}
