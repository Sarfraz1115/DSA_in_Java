package TwoPointers;

import java.util.HashSet;

public class Leetcode_3 {
    public static int lengthOfLongestSubstring(String s){
        int left = 0; int right = 0;
        int length = 0;
        HashSet<Character> str = new HashSet<>();
        while(right < s.length()){
            char c = s.charAt(right);
            if(!str.contains(c)){
                str.add(c);
                length = Math.max(length, str.size());
                right++;
            }
            else{
                str.remove(s.charAt(left));
                left++;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
