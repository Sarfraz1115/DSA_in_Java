package Stack;

import java.util.Stack;

public class PushAtAnyIndex_Iterative {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("before adding element at index  " + st);
        int idx = 1;
        int element = 6;

        Stack<Integer> temp = new Stack<>();
        while(st.size() > idx){
             temp.push(st.pop());
        }
        st.push(element);

        while(temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println("after adding element at index " + st);
    }
}
