package BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class Leetcode_268 {
    public static int MissingNumber(int [] nums){
        // brute approach
//        Arrays.sort(nums);
//        for(int i=0; i< nums.length; i++){
//            if(nums[i] != i){
//                return i;
//            }
//        }
//        return nums.length;

        // Hashtable
//        Hashtable<Integer, Integer> set = new Hashtable<>();
//        for(int i=0; i< nums.length; i++){
//            set.put(i,nums[i]);
//        }
//
//        for(int i=0; i< nums.length; i++){
//            if(!set.contains(i)){
//                return i;
//            }
//        }
//        return nums.length;

        // Hashset
        HashSet<Integer> st = new HashSet<>();
        for(int num: nums){
            st.add(num);
        }
        for(int i=0; i< nums.length; i++){
            if(!st.contains(i)){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int [] nums = {3,0,1,4,6,5,2,7,9};
        System.out.println(MissingNumber(nums));
    }
}
