package BinarySearch;

public class LeetCode_154 {
    public static int search(int[] nums) {

        int st = 0;
        int end = nums.length - 1;
        while(st< end){
            int mid = st + (end - st) / 2;

            if(nums[mid] > nums[end]){
                st = mid + 1;

            }
            else if(nums[mid] < nums[end]){
                end = mid;
            }
            else{
                end--;
            }
        }
        return nums[st];

    }
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1,2};
        int result = search(nums);
        System.out.println(result);
    }
}
