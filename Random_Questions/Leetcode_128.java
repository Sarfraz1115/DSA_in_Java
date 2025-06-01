package Random_Questions;

import java.util.HashSet;

public class Leetcode_128 {
    public static int LongConsecutive(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxlen = 0;
        for(int num: set){
            if(!set.contains(num - 1)){
                int currnum = num;
                int currlen = 1;

                while (set.contains(currnum + 1)){
                    currlen++;
                    currnum++;
                }
                maxlen = Math.max(currlen, maxlen);
            }
        }
//        for(int num: set){
//            if(set.contains(num - 1)){
//                int currnum = num;
//                int currlen = 1;
//                while(set.contains(currnum - 1)){
//                    currnum--;
//                    currlen++;
//                }
//                maxlen = Math.max(currlen, maxlen);
//            }
//        }
        return maxlen;
    }
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        System.out.println(LongConsecutive(nums));
    }
}
