package LeetCode_75_Challenge;


import java.util.Arrays;

public class jabtak {
    public static void main(String[] args) {
       int [] nums1 = {1,3};
       int [] nums2 = {2};
       int [] mergearray = new int[nums1.length+ nums2.length];

       int i = 0;
       for(int num: nums1){
           mergearray[i++] = num;
       }
       for(int num: nums2){
           mergearray[i++] = num;
       }
       Arrays.sort(mergearray);
       System.out.println(Arrays.toString(mergearray));
    }
}
