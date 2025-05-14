package Stack;

import java.util.Stack;


public class PushAtBottom_Recursion {


    public static void pushAtbotto( int data, Stack<Integer> ss){
        // base case
        if(ss.isEmpty()){
            ss.push(data);
            return;
        }
        // mera kaaam
        int top = ss.pop();
        pushAtbotto(data, ss);
        // after completing remove elements and add new element in botttom then add all removed element back.
        ss.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();

        ss.push(1);
        ss.push(2);
        ss.push(3);
        System.out.println("Stack before pushing 4 at bottom: " + ss);
        pushAtbotto(4,ss);
        System.out.println("Stack after pushing 4 at bottom: " + ss);

    }
}
