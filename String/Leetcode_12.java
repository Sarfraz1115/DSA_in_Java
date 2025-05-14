package String;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_12 {
    public static String integartoroman(int num) {
//        Map<String, Integer> hh = new HashMap<>();
//        hh.put("I",1);
//        hh.put("IV",4);
//        hh.put("V",5);
//        hh.put("IX",0);
//        hh.put("X",10);
//        hh.put("XL",40);
//        hh.put("XC",90);
//        hh.put("C",100);
//        hh.put("CD",400);
//        hh.put("D",500);
//        hh.put("CM",900);
//        hh.put("M",1000);
        String result = "";
//        String [] str = {"I", "IV", "V", "IX", "X", "XL", "XC", "C", "CD", "D", "CM", "M"};
//        int [] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i =0; i < values.length; i++){
           while (num >= values[i]){
               result += str[i];
               num -= values[i];

           }
        }
        return result;
    }
    public static void main(String[] args) {
        // Integer to roman
        int num = 3845;
        System.out.println(integartoroman(num));

    }
}
