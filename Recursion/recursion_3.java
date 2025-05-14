package Recursion;


import java.util.HashSet;

public class recursion_3 {

    // print all subsequences of string and also unique subsequences- rough notebook recursion Q.5
//    public static void printSubsequences(String str, int idx, String newstr, HashSet<String> set) {
//        // base case
//        if(idx == str.length()){
//            // checking a unique value present already or not
//            if(set.contains(newstr)){
//                return;
//            }else{
//                System.out.println(newstr);
//                set.add(newstr);  // adding unique value to hash set to avoid duplicates.
//                return;
//            }
//        }
//        // mera kaaam
//        char curchar = str.charAt(idx);
//        // to take a character
//        printSubsequences(str, idx+1, newstr + curchar, set);
//        // not take a character
//        printSubsequences(str, idx + 1, newstr, set);
//    }


    // Remove all occurrences 'a' from the string - rough notebook recursion Q.7
//    public static void removinga(String str, int idx,String newstring){
//        // base case
//        if(idx == str.length()){
//            System.out.println(newstring);
//            return;
//        }
//        // mera kaam
//        char curchar = str.charAt(idx);
//        if(curchar != 'a'){
//            newstring += curchar;
//            removinga(str, idx+1, newstring);
//        }
//        else{
//            removinga(str, idx+1, newstring);
//        }
//    }

    // another method
//    public static String removeaelement(String str, int index){
//        // base case
//        if(index == str.length()){
//            return " ";
//        }
//        // mera kaam
//        String smallsum = removeaelement(str, index + 1);
//        char curcharr = str.charAt(index);
//
//        if(curcharr != 'a'){
//            return curcharr + smallsum;
//        }else{
//            return smallsum;
//        }
//    }


    // is palindrome or not - rough notebook recursion Q.8
//    public static void isPalindrome(String str, int index) {
//        // base case
//        if(index >= str.length()/2){
//            System.out.println(str + " is palindrome");
//            return;
//        }
//
//        // mera kaam
//        char firstChar = str.charAt(index);
//        char lastChar = str.charAt(str.length() - 1 - index);
//
//        if(firstChar!= lastChar){
//            System.out.println(str + " is Not a palindrome");
//            return;
//        }
//        isPalindrome(str, index + 1);
//    }


    // another method of palindrome
//    public static void ispalin(String str, int index, String newstr){
//        // base case
//        if(index < 0 || index >= str.length()){
//            System.out.println(newstr);
//
//            if(newstr.equals(str)){       // it is like newstr == str.
//                System.out.println(str + " is palindrome");
//                return;
//            }
//            System.out.println(str + " is Not a palindrome");
//            return;
//        }
//        // mera kaaam
//        char lastchar = str.charAt(str.length() - 1 - index);
//        newstr += lastchar;
//        ispalin(str, index + 1, newstr);
//    }





    public static void main(String[] args){
//            String str = "aaa";
//            HashSet<String> set = new HashSet<>();
//            printSubsequences(str,0,"", set);

//        removinga("abacaade", 0, "");
//        System.out.println(removeaelement("abaacd",0));

//        isPalindrome("dad", 0);
//        ispalin("what", 0, "");


    }
}



