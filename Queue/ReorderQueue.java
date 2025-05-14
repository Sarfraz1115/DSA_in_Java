package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        System.out.println("before reorder : " + q1);


    }
}
