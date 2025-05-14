package Stack;

import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {


        String infix = "A*B/(D+C)*E";
        System.out.println(infix);
        Stack<Character> st = new Stack<>();
        Stack<String> ans = new Stack<>();

        for(int i=0; i<infix.length(); i++) {
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.push(Character.toString(ch));
            }

            else if (ch == '(' || st.size() == 0 || st.peek() == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (st.peek() != '('){
                    String val2 = ans.pop();
                    String val1 = ans.pop();
                    char o = st.pop();
                    String newstr = o + val1 + val2;
                    ans.push(newstr);
                }
                st.pop();
            }

            else {
                if(ch == '+' || ch == '-') {
                    String val2 = ans.pop();
                    String val1 = ans.pop();
                    char o = st.pop();
                    String newstr = o + val1 + val2;
                    ans.push(newstr);
                    st.push(ch);
                }
                if(ch == '*' || ch == '/'){
                    if(st.peek() == '*' || st.peek() == '/'){
                        String val2 = ans.pop();
                        String val1 = ans.pop();
                        char o = st.pop();
                        String newstr = o + val1 + val2;
                        ans.push(newstr);
                        st.push(ch);
                    }
                    else {
                        st.push(ch);
                    }
                }
            }

        }


        while(ans.size() > 1){
            String val2 = ans.pop();
            String val1 = ans.pop();
            char o = st.pop();
            String newstr = o + val1 + val2;
            ans.push(newstr);

        }
        String postfix = ans.pop();
        System.out.println(postfix);



    }
}
