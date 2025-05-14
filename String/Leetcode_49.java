package String;

import java.util.*;

public class Leetcode_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> mp = new HashMap<>();
        for(String str: strs){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedstr = new String(ch);
            if(!mp.containsKey(sortedstr)){
                mp.put(sortedstr, new ArrayList<>());
            }
            mp.get(sortedstr).add(str);
        }
        return new ArrayList<>(mp.values());
    }
    public static void main(String[] args) {
//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs = {"a"};
        System.out.println(groupAnagrams(strs));

    }
}
