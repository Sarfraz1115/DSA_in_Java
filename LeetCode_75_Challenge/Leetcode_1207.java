package LeetCode_75_Challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_1207 {
    public static boolean uniqueNumberOfOccurrences(int[] arr) {
        HashMap<Integer, Integer> set = new HashMap<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : arr) {
            if (set.containsKey(num)) {
                set.put(num, set.get(num) + 1);
            } else {
                set.put(num, 1);
            }
        }
        for (int val : set.values()) {
            if (set2.contains(val)) {
                return false;
            } else {
                set2.add(val);
            }
        }
        return true;


    }

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueNumberOfOccurrences(arr));
    }
}
