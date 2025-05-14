package String;

public class Leetcode_125 {
    public static boolean isPalindrome(String s) {
        // Not optimized Space Complexity is O(N) and Time Complexity is O(N)
//        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;


        // I can optimize it by filtering extra string instead using isLetterorDigit
        // Optimized Space Complexity O(1) and Time Complexity O(N)
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while( left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right++;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s)); // true
    }
}
