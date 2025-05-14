package String;

import java.util.Arrays;

public class Leetcode_14 {
    public static String longestCommonPrefix(String strs[]){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i=0;
        String result = "";
        while (i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            result += s1.charAt(i);
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"intern", "internet", "internal"};
//        String[] strs = {"car", "dog", "cat"};
//        String[] strs = {"a", "ab", "abc"};
        System.out.println(longestCommonPrefix(strs));

//        Arrays.sort(strs);
//        for( String str : strs) {
//            System.out.println(str);
//        }

//        System.out.println(strs[0]);
//        String s1 = strs[0];
//        System.out.println(s1.length());
//        System.out.println(strs[strs.length - 1]);

    }
}
