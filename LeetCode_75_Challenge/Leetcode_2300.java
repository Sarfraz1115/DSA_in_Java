package LeetCode_75_Challenge;

import java.util.Arrays;

public class Leetcode_2300 {
    public static int[] countSuccess(int[] spell, int[] potions, long success){
        // using two pointer approach
        Arrays.sort(potions);
        int s = spell.length;
        int p = potions.length;
        int[] result = new int[s];
       for(int i=0; i<s; i++){
           int j = 0;

           while(j< p && (long)spell[i] * potions[j] < success){
               j++;
           }
           result[i] = p - j;
       }
       return result;
    }


    public static void main(String[] args) {
        int [] spell = {3,4,5};
        int [] potions = {1,2};
        long success = 100;
        System.out.println(Arrays.toString(countSuccess(spell, potions, success)));
    }
}
