package LeetCode_75_Challenge;

public class Leetcode_345 {
    public static String reverseVowels(String s) {
        // myserlf code
        String vowel = "aeiouAEIOU";
        char[] ch= s.toCharArray();
        int i = 0; int j = s.length() - 1;
        while (i < j) {
            if(!vowel.contains(String.valueOf(s.charAt(i)))){
                i++;
            } else if (!vowel.contains(String.valueOf(s.charAt(j)))) {
                j--;
            }

            else{
                char temp = s.charAt(i);
                ch[i] = s.charAt(j);
                ch[j] = temp;
                i++; j--;  // move both pointers towards the center of the string.
            }
        }
        return new String(ch);  // converting char array back to string.
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(reverseVowels(s));
    }
}
