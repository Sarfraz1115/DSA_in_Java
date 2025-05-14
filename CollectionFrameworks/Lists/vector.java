package CollectionFrameworks.Lists;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Vector is not a part of Java Collection Framework, but it is present in java.util package
        // Vectors are synchronized, which means they are thread-safe.
        // Vectors are not suitable for large collections as they use more memory than ArrayList.
        // Vectors are used when we want thread safety and memory efficiency.


        Vector<Integer> vv = new Vector<>(5, 3);
        // by adding 3 in size so it will be increament by 3 not double
        vv.add(1);
        vv.add(2);
        vv.add(3);
        vv.add(4);
        vv.add(5);
        // I have capacity of 5 but I am adding 6 elements so we know it increases the capacity double so its capacity 5 se 10 ho gyi
        // 1) count the capacity of vector
        System.out.println(vv.capacity());
        vv.add(6);
        // it will print 8 capacity of vector
        System.out.println(vv.capacity());
    }
}
