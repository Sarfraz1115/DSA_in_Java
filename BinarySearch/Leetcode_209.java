package BinarySearch;

public class Leetcode_209 {
    public static int MinSumArrlen(int [] nums, int target){
        int sum = 0; int mylength = Integer.MAX_VALUE; int start = 0;
        for(int end=0; end< nums.length; end++){
            sum += nums[end];
            while (sum >= target) {
                mylength = Math.min(mylength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        if(mylength == Integer.MAX_VALUE){
            return 0;
        }
        return mylength;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int target = 15;
        System.out.println(MinSumArrlen(nums, target));
    }
}
