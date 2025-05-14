package String;

public class Leetcode_28 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        int len = haystack.length();
        int nlen = needle.length();
//        for(int i=0; i<len - nlen; i++) {
//            //checking needle equals to substring
//            if(haystack.substring(i, i+nlen) .equals(needle)){
//                return i;  // return index of first occurrence of needle in haystack.
//            }
//        }
//        return -1;

        // USING TWO POINTERS
        int i = 0;
        int j = 0;
        while(i<len && j < nlen){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                i = i - j + 1;
                j=0;
            }
            if(j == nlen){
                return i - nlen;
            }
        }
                return -1;


}


    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
//        System.out.println(needle.length());
        int index = strStr(haystack, needle);
        System.out.println(index);
    }
}
