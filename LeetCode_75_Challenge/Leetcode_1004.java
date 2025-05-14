package LeetCode_75_Challenge;

public class Leetcode_1004 {
   public static int findMaxConsecutiveOnes(int [] nums, int k){
       int left = 0, right = 0, count = 0, maxCount = 0;
       while(right < nums.length){
           if(nums[right] == 1) count++;
           else count = 0;
           while(count > k){
               if(nums[left] == 1) count--;
               left++;
           }
           maxCount = Math.max(maxCount, right - left + 1);
           right++;
       }
       return maxCount;  // return the maximum length of consecutive ones that have exactly k zeros in between.
   }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(findMaxConsecutiveOnes(nums, k));
    }
}
