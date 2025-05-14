package LeetCode_75_Challenge;

import java.util.*;


public class Leetcode_2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Brute force approach
//        List<Integer> arr1 = new ArrayList<>();
//        List<Integer> arr2 = new ArrayList<>();
//        for (int i = 0; i < nums1.length; i++) {
//            boolean found = false;
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found && !arr1.contains(nums1[i])) {
//                arr1.add(nums1[i]);
//            }
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            boolean found = false;
//            for (int j = 0; j < nums1.length; j++) {
//                if (nums2[i] == nums1[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found && !arr2.contains(nums2[i])) {
//                arr2.add(nums2[i]);
//            }
//        }
//        return Arrays.asList(arr1, arr2);


        // Optimized Approach
        return Arrays.asList(getcommonlist(nums2, nums1), getcommonlist(nums1, nums2));
    }

    private static List<Integer> getcommonlist(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        // add all elements of nums 1 in set2;
        for(int num: nums1){
            set2.add(num);
        }
        // compare the set2 with nums2 see any difference
        for(int num: nums2){
            if(!set2.contains(num)){
                set1.add(num);
            }
        }
        return new ArrayList<>(set1);

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));
    }
}
