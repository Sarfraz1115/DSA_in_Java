package String;

public class Leetcode_58 {
    public static int lengthOfLastWord(String s) {
        String newstr = s.trim();
        for(int i=newstr.length()-1; i>=0; i--){
            if(newstr.charAt(i) == ' '){
                return newstr.length() - i - 1;
            }
//            return 1;
        }
        return newstr.length();
    }
    public static void main(String[] args) {

        String s = " a";
//        s.trim();
//        System.out.println(s.trim());
//        System.out.println(s);.0
//         System.out.println(s.length());
        System.out.println(lengthOfLastWord(s));
    }
}
