package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFrameWork {
    public static void main(String[] args) {
        Queue<Integer> qq = new LinkedList<>();

        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        qq.offer(6);  // offer is same as add konsa bhi use karo add ho jayega
        System.out.println(qq);

        qq.remove();
        // qq.poll();  // poll is same as remove konsa bhi use karo remove ho jayega
        System.out.println(qq);

        // getting the first element
        System.out.println(qq.element());
        System.out.println(qq.peek());  // peek is same as element konsa bhi use karo peek ho jayega
    }
}
