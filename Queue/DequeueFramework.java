package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueFramework {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addFirst(6);
        dq.add(7);
//        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
