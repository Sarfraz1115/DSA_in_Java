package TwoPointers;

import java.util.HashMap;
import java.util.HashSet;

public class Leetcode_349 {
    public static int[] intersection(int [] nums1, int [] nums2){
        // brute approach
//        int temp[] = new int[Math.min(nums1.length, nums2.length)];
//        int idx = 0;
//        for(int i=0; i< nums1.length; i++){
//            for(int j=0; j< nums2.length; j++){
//                if(nums1[i] == nums2[j]){
//                    boolean found = false;
//                    for(int k=0; k<temp.length; k++){
//                        if(temp[k] == nums1[i]){
//                            found = true;
//                            break;
//                        }
//                    }
//                    if(!found){
//                        temp[idx++] = nums1[i];
//                    }
//                    break;
//                }
//            }
//        }
//        int [] result = new int[idx];
//        for(int i=0; i<idx; i++){
//            result[i] = temp[i];
//        }
//        return result;


        // Optimized Approach
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultset = new HashSet<>();
        for(int num1: nums1){
            set.add(num1);
        }
        for(int num2: nums2){
            if(set.contains(num2)){
                resultset.add(num2);
            }

        }
        int result[] = new int[resultset.size()];
        int i=0;
        for(int a: resultset){
            result[i++] = a;
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int [] result = intersection(nums1, nums2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
