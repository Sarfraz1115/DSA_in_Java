package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueueAnotherQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // using another queue for displaying the elements
        Queue<Integer> helper = new LinkedList<>();
        while(q.size() > 0){
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        // ab wapas helper se elements nikaal ke q me dal na hai
        while (helper.size() > 0){
            q.add(helper.poll());
        }

    }
}
