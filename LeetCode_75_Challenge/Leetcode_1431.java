package LeetCode_75_Challenge;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy: candies) {
            max = Math.max(max, candy);
        }
        for (int cand: candies){
            if(cand + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extracandies = 3;
        System.out.println(kidsWithCandies(candies, extracandies));


    }
}
