package TwoPointers;

public class Leetcode_5 {
    public static String LongestSubstring(String s) {
        int n = s.length();
       int start = 0; int end = 0;
       for(int i=0; i< n; i++){
           int odd = expand(s, i, i);
           int even = expand(s, i, i+1);
           int len = Math.max(odd, even);

           if(len > end - start){
               start = i - (len - 1)/2;
               end = i + len/2;
           }
       }
       return s.substring(start, end + 1);
    }
    // Optimized approach
    public static int expand(String s, int left, int right){
        while(left >= 0 &&  right < s.length() && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "abbb";
        System.out.println(LongestSubstring(s));
    }
}
