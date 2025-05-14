package LeetCode_75_Challenge;

public class Leetcode_238 {
    public static int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int [] prefixProdStart = new int[nums.length];
        int [] prefixProdEnd = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                prefixProdStart[i] = prefixProdStart[i-1] * nums[i];
            }else{
                prefixProdStart[i] = nums[i];
            }
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if(i < nums.length - 1){
                prefixProdEnd[i] = prefixProdEnd[i+1] * nums[i];
            }
            else {
                prefixProdEnd[i] = nums[i];
            }
        }
        result[0] = prefixProdEnd[1];
        result[nums.length - 1] = prefixProdStart[nums.length - 2];
        for(int i = 1; i< nums.length - 1; i++) {
            result[i] = prefixProdStart[i - 1] * prefixProdEnd[i + 1];
        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums = {4,3,6,2};
        int[] result = productExceptSelf(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
