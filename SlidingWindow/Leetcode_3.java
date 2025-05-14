package SlidingWindow;

import java.util.HashSet;

public class Leetcode_3 {
    public static int lengthOfLongestSubstring(String s){
        // brute approach
//        int countlength = 0;
//        for(int i=0; i<s.length(); i++){
//            StringBuilder str = new StringBuilder("");
//            for(int j = i; j<s.length(); j++){
//                char c = s.charAt(j);
//                if(str.toString().contains(String.valueOf(c))){
//                    break;
//                }else{
//                    str.append(c);
//                    countlength = Math.max(countlength, str.length());
//                }
//            }
//        }
//        return countlength;

        // Optimized approach
        int countlength = 0;
        int left = 0;
        HashSet<Character> str = new HashSet<>();
        int right = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(!str.contains(c)){
                str.add(c);
                countlength = Math.max(countlength, str.size());
                right++;
            }
            else{
                str.remove(s.charAt(left));
                left++;
            }
        }
        return countlength;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
