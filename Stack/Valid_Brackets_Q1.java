package Stack;

import java.util.*;

public class Valid_Brackets_Q1 {

    public static boolean isvalid(String s){
        Stack<Character> ss = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                ss.push(ch);
            } else if (ch == ')' && ss.peek() == '(' && !ss.isEmpty())  {
                    ss.pop();
            } else if (ch == ']' && ss.peek() == '[' && !ss.isEmpty() ) {
                ss.pop();
            } else if (ch == '}' && ss.peek() == '{' && !ss.isEmpty()) {
                ss.pop();
            }
            else{
                return false;
            }
        }

        return ss.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the parenthesis");
        String text = sc.nextLine();
        System.out.println(isvalid((text)));


    }
}
