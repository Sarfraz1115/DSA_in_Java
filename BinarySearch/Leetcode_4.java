package BinarySearch;

import java.util.Arrays;

public class Leetcode_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] mergearray = new int[m + n];
        int i = 0; int j = 0;
        while(i<m && j<n ){
            if(nums1[i] < nums2[j]){
                mergearray[i+j] = nums1[i++];
            }
            else{
                mergearray[i+j] = nums2[j++];
            }
        }
        while(i<m){
            mergearray[i+j] = nums1[i++];
        }
        while(j<n){
            mergearray[i+j] = nums2[j++];
        }
        System.out.println(Arrays.toString(mergearray));


        int k = mergearray.length;
        if(k%2 == 0){
            int first = k/2 - 1;
            int second = k/2;
            return (double) (mergearray[first] + mergearray[second]) / 2.0;
        }
        else{
            int mid = (k-1)/2;
            return (double) (mergearray[mid]);
        }
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
