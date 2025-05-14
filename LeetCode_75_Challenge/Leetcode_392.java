package LeetCode_75_Challenge;

public class Leetcode_392 {
    public static boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        int i=0; int j=0;
        while(i<m && j<n) {
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
                j++;
        }
        return i == m;
    }
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        System.out.println(isSubsequence(s, t));
    }
}
