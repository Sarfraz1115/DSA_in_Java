package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode_496 {
    public static int[] nextGreaterElement(int [] nums1, int [] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int [] result = new int[n];
//        for(int i=0; i< n; i++){
//            result[i] = -1;
//        }
//        for(int j = 0; j<n; j++){
//            for(int k=0; k<m; k++){
//                if(nums1[j] == nums2[k]){
//                    for(int l = k+1; l<m; l++){
//                        if(nums2[l] > nums1[j]){
//                            result[j] = nums2[l];
//                            break;
//                        }
//                        else{
//                            result[j] = -1;
//                        }
//                    }
//                }
//            }
//        }
//        return result;

        // optimized approach
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<m; i++){
            while(!st.isEmpty() && nums2[i] > st.peek()){
                mp.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
        for(int i=0; i<n; i++){
            if(mp.containsKey(nums1[i])){
                result[i] = mp.get(nums1[i]);
            }
            else{
                result[i] = -1;
            }
        }
        return result;



    }
    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        int [] result = nextGreaterElement(nums1, nums2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
