package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_15 {
    public static List<List<Integer>> threesum(int [] nums){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<n - 2; i++){
            int left = i + 1; int right = n - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> triple = Arrays.asList(nums[i], nums[left], nums[right]);
                    triple.sort(null);
                    if(!result.contains(triple)){
                        result.add(triple);
                    }
                }
                if(sum < 0){
                    left++;
                } else if (sum > 0) {
                    right--;
                }
                else{
                    left++;
                    right--;
                }
            }
        }
        //    brute approach
//        for(int i=0; i<n - 2; i++){
//            for(int j=i+1; j< n-1; j++){
//                for(int k=j + 1; k<n; k++){
//                    if(nums[i] + nums[j] + nums[k] == 0){
//                       List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//                       triplet.sort(null);
//                       if(!result.contains(triplet)){
//                           result.add(triplet);
//                       }
//                    }
//                }
//            }
//        }
            return result;
    }
    public static void main(String[] args) {
        int [] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threesum(nums));

    }
}
