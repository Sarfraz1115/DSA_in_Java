package BinarySearch;

public class LeetCode_153 {
    public static int findMin(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        while(st< end){
            int mid = st + (end - st) / 2;

            if(nums[mid] > nums[end]){
                st = mid + 1;
            }else{
                end = mid;
            }
        }
        return nums[st];
    }
    public static void main(String[] args) {

        int[] nums = {1,2};
        System.out.println(findMin(nums));


    }
}
