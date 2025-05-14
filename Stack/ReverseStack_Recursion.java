package Stack;

import java.util.Stack;

public class ReverseStack_Recursion {

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

    public static void reverseStack(Stack<Integer> ss){
        // base case
        if(ss.isEmpty()){
            return;
        }
        // mera kaaam
        int top = ss.pop();
        reverseStack(ss);
        // after removing elements then I have to add element at the bottom of the stack to reverse
        pushAtbotto(top, ss);
    }

    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        System.out.println("Original Stack: " + ss);
//        System.out.println(ss.size());

        reverseStack(ss);
        System.out.println("after the reversing " + ss);
    }
}
