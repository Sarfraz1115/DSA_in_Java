package String;

import java.util.Scanner;

public class Basic_Questions {
    public static void main(String[] args) {

        // Q.1 - Reverse a string
//        String str = "hello";
//        for(int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }

        // Q.2 - Check if a string is palindrome
//        String str2 = "what";
//        int a = 0 ;
//        int b = str2.length() - 1;
//        while(a<=b){
//            if(str2.charAt(a) == str2.charAt(b)){
//                a++;
//                b--;
//            }
//            else{
//                System.out.println("Not Palindrome");
//                break;
//            }
//        }
//        if(a>b){
//            System.out.println("Palindrome");
//        }

        // Q.3 - Count the Number of Vowels and Consonants
//        String str3 = "hello";
//        int vowels = 0;
//        int consonants = 0;
//        char [] myvowels =  {'a', 'e', 'i', 'o', 'u'};
////        System.out.println(myvowels);
//        for(int i=0; i<str3.length(); i++){
//            int curchar = str3.charAt(i);
//            boolean vowel = false;
//            for(char c : myvowels){
//                if(curchar == c){
//                    vowel = true;
//                    vowels++;
//                    break;
//                }
//            }
//            if(!vowel && Character.isLetter(curchar)){
//                consonants++;
//            }
//
//        }
//        System.out.println("Vowels: " + vowels);
//        System.out.println("Consonants: " + consonants);

        // Q.4 - Count the Occurrences of a Character
        StringBuilder sb = new StringBuilder("hello");
        char a = 'l';
        int occurences = 0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == a){
                occurences++;
            }
        }
        System.out.println("occurences: " + occurences);
        



    }
}
