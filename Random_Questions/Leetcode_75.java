package Random_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_75 {
    public static int [] sortcolors(int [] nums){
        int low = 0; int mid = 0;
        int high = nums.length - 1;
        while (mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++; mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
//        System.out.println(sortcolors(nums));
        int [] res = sortcolors(nums);
        for (int num: res){
            System.out.print(num + " ");
        }
    }
}
