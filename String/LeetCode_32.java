package String;

import java.util.Stack;

public class LeetCode_32 {
    public static int longestValidParentheses(String s) {
        int maxlen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }  else {
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxlen = Math.max(maxlen, i - st.peek());

                }
            }
        }


        return maxlen;
    }
    public static void main(String[] args) {
        String s = "())()";
        System.out.println(longestValidParentheses(s));
    }
}
