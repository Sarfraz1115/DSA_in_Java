package CollectionFrameworks.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class set {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(25);
//        set.add(25);   // will not print because duplicates are not allowed
//        set.add(27);
//        System.out.println(set);

        // if we want in ordered so use LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(25);
        set.add(25);   // will not print because duplicates are not allowed
        set.add(27);
        System.out.println(set);
    }
}
