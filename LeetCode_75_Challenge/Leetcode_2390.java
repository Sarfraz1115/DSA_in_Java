package LeetCode_75_Challenge;

import java.util.Stack;

public class Leetcode_2390 {
    public static String removestars(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '*'){
                st.push(c);
            }
            else if(!st.isEmpty() && st.peek() != '*'){
                st.pop();
            }
        }
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removestars(s));

    }
}
