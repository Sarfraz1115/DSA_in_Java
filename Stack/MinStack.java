package Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();

    public void push(int value) {
        if (st.size() == 0) {
            st.push(value);
            minst.push(value);
        } else {
            st.push(value);
            if (value >= minst.peek()) {
                minst.push(minst.peek());
            } else {
                minst.push(value);
            }
        }
    }

    public void pop() {
        st.pop();
        minst.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        // for getting minimum value so pop or peek karo minst ka - kyuki top value hi min value hai
        return minst.peek();
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(7);
        minStack.push(8);
        minStack.push(5);
        minStack.push(6);
        minStack.push(3);
        minStack.push(4);

        System.out.println("Current minimum element is: " + minStack.getMin());
        minStack.pop();
        System.out.println("Current minimum element is: " + minStack.getMin());
        minStack.pop();
        System.out.println("Current minimum element is: " + minStack.getMin());

    }
}
