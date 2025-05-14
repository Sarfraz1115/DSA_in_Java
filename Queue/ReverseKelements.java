package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelements {
    public static void main(String[] args) {
        // first reversing complete queue
//        Queue<Integer> q = new LinkedList<>();
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        System.out.println("before reversing :  " + q);
//        Stack<Integer> stack = new Stack<>();
//        while(q.size() > 0){
//            stack.push(q.remove());
//        }
//        while(stack.size() > 0){
//            q.add(stack.pop());
//        }
//        System.out.println("after reversing : " + q);

        // reversing first k elements
        Queue<Integer> qq = new LinkedList<>();
        int k = 3;
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        System.out.println(qq);
       Stack<Integer> ss = new Stack<>();

       for(int i=0; i<k; i++){
           ss.push(qq.remove());
       }
       while(!ss.isEmpty()){
           qq.add(ss.pop());
       }
        System.out.print(qq);
        System.out.println();

       for(int i = 0; i<qq.size() - k; i++){
           qq.add(qq.remove());
       }
        System.out.println("final result : " + qq);


    }
}
