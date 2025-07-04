package LeetCode_75_Challenge;

public class Leetcode_283 {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for(int j=0; j<nums.length; j++) {
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
