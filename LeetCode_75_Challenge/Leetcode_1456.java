package LeetCode_75_Challenge;

public class Leetcode_1456 {
    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int maxcount = 0; int windowcount = 0;
        for(int i=0;i<k;i++) {
            if(vowels.contains(Character.toString(s.charAt(i)))) {
                windowcount++;
            }
            maxcount = Math.max(maxcount, windowcount);

        }
        for(int i = k; i<s.length(); i++) {
            if(vowels.contains(Character.toString(s.charAt(i)))) {
                windowcount++;
            }
            if(vowels.contains(Character.toString(s.charAt(i - k)))){
                windowcount--;
            }
            maxcount = Math.max(maxcount, windowcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
