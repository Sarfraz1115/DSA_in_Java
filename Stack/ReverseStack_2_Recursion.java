package Stack;

import java.util.Stack;

public class ReverseStack_2_Recursion {

    public static void reversing(Stack<Integer> st){
        // base case
        if(st.isEmpty()){
            return;
        }


        // mera kaaam
        int top = st.pop();
        System.out.print( top + " ");
        reversing(st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("before reversing stack " + st);
        System.out.println("after reverssing ");
        reversing(st);

    }
}
