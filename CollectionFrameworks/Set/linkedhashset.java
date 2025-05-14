package CollectionFrameworks.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[] args) {
        // if we want in ordered so use LinkedHashSet

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // ya phir
//        Set<Integer> st = new LinkedHashSet<>();
        set.add(12);
        set.add(25);
        set.add(25);   // will not print because duplicates are not allowed
        set.add(27);
        System.out.println(set);
    }
}
