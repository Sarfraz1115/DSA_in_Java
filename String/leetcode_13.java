package String;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class leetcode_13 {
    public static int romanToInt(String s) {
//        Hashtable<Character, Integer> hs = new Hashtable<>();
        Map<Character, Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);

//        int result = 0;
        int result = hs.get(s.charAt(s.length()-1));

        for(int i=s.length()-2; i>=0; i--){
//            int val = hs.get(s.charAt(s.length()-1));
            if(hs.get(s.charAt(i)) == hs.get(s.charAt(i+1))){
                result += hs.get(s.charAt(i));
            }
            else if(hs.get(s.charAt(i)) < hs.get(s.charAt(i+1))){
                result -= hs.get(s.charAt(i));
            }
            else{
                result += hs.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // roman to integer
//        Hashtable<Character, Integer> hs = new Hashtable<>();

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));



    }
}
