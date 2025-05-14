package CollectionFrameworks.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        // TreeSet does not allow duplicate values, maintains insertion order, and does not support null values.
        // treeset maintains the sorted order

        TreeSet<Integer> set = new TreeSet<>();
        // ya phir
//        Set<Integer> set = new TreeSet<>();
        set.add(122);
        set.add(25);
        set.add(25);     // will not print because duplicates are not allowed
        set.add(27);
        System.out.println(set);

        // stores in ascending order
    }
}
