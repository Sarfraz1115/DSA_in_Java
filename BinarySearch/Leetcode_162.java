package BinarySearch;

public class Leetcode_162 {
    public static int findPeakElement(int[] nums) {

                int st = 0;
                int end = nums.length - 1;

                while(st<end) {
                    int mid = st + (end - st) / 2;

                     if(nums[mid] < nums[mid + 1]){
                        st = mid + 1;
                    }
                    else{
                        end = mid;
                    }

                }
        return st;
            }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));

    }
}
