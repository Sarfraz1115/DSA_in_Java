package String;

public class Leetcode_1071 {
    public static String gcdOfString(String str1, String str2) {
         // first I am findig the length of both strings
        int len1 = str1.length();
        int len2 = str2.length();

        // if any string is empty, return the other string
        if(len1 == 0 || len2 == 0 || !(str1 + str2).equals(str2 + str1)){
            return "";
        }
        // find the gcd of length of both strings
        else{
            return str1.substring(0, gcd(len1, len2));
        }
    }
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfString(str1, str2));
//        System.out.println(str2.length());
    }
}



