package SlidingWindow;

public class leetcode_1004 {
    public static int longestOnes(int[] nums, int k) {
        // brute approach
//        int maxlen = 0;
//        int m = nums.length;
//        for(int i=0; i<m; i++) {
//            int zerocount = 0;
//            for(int j=i; j<m; j++){
//                if(nums[j] == 0){
//                    zerocount++;
//                }
//                if(zerocount > k){
//                    break;
//                }
//                maxlen = Math.max(maxlen, j - i + 1);
//            }
//        }
//        return maxlen;

        // optimized approach
        int maxlen = 0;
        int zerocount = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zerocount++;
            }
            if (zerocount > k){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int result = longestOnes(nums, k);
        System.out.println(result); // Output: 6
    }
}
