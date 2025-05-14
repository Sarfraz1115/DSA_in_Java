package BinarySearch;

public class Leetcode_32 {
    public static int Findindex(int [] nums, int target){
        int st = 0; int end = nums.length-1;
        while(st <= end){
            int mid = (st + end ) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int nums [] = {1,3,5,6};
        int target = 7;
        System.out.println(Findindex(nums, target));
    }
}
