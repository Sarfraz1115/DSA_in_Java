package LeetCode_75_Challenge;

public class Leetcode_151 {
    public static String reverseWords(String s) {
        String Result = "";
        String [] words = s.trim().split("\\s+");
        for(int i = words.length - 1; i >= 0; i--){
            Result += words[i] + " ";
        }
        return Result.trim();  // remove trailing space  and return the result.
    }
    public static void main(String[] args) {
        String s = "  hello world  ";
        String reversed = reverseWords(s);
        System.out.println(reversed);
    }
}
