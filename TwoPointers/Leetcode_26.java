package TwoPointers;

public class Leetcode_26 {
    public static int removeDuplicates(int [] nums){
        // brute approach
        // in this question, There are clearly mention not to use extra space
//        int n = nums.length;
//        int index = 1;
//        for(int i=1; i<n; i++){
//            boolean istrue = false;
//            for(int j=0; j<index; j++){
//                if(nums[i] == nums[j]){
//                    istrue=true;
//                    break;
//                }
//            }
//            if(!istrue){
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        return index;

        // Optimized Approach
        int n = nums.length;
        int i=0;
        for(int j=0; j<n; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        // 0,0,1,1,1,2,2,3,3,4
        // res = {0,1,}
        // res = { 1, }
        System.out.println(removeDuplicates(nums));
    }
}
