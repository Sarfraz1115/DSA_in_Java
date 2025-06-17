package Random_Questions;

import java.util.HashMap;

public class Leetcode_205 {
    public static boolean Isomorphic(String s, String t){
        HashMap<Character, Character> Hashstore = new HashMap<>();
        HashMap<Character, Character> Hashstore2 = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(Hashstore.containsKey(sChar)){
                if(Hashstore.get(sChar) != tChar){
                    return false;
                }
            }
            else {
                Hashstore.put(sChar, tChar);
            }
            if(Hashstore2.containsKey(tChar)){
                if(Hashstore2.get(tChar) != sChar){
                    return false;
                }
            }
            else {
                Hashstore2.put(tChar, sChar);
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String s = "badc"; String t = "baba";
        System.out.println(Isomorphic(s,t));
    }
}
