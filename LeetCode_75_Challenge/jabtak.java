package LeetCode_75_Challenge;


import java.util.Arrays;

public class jabtak {
    public static void main(String[] args) {
       String s  = "12.10";
       int st = 0;
       int end = s.length() - 1;
       while (st < end){
           System.out.print(s.charAt(st));
           System.out.print(s.charAt(end));
           st++; end--;
       }


//        System.out.println(a);
        System.out.println(s.length());
    }
}
