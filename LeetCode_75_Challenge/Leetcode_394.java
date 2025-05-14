package LeetCode_75_Challenge;

import java.util.Stack;

public class Leetcode_394 {
    public static String decodeString(String s) {
        Stack<Integer> numst = new Stack<>();
        Stack<String> stringst = new Stack<>();
        int currchar = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currchar = currchar * 10 + (c - '0');
            } else if (c == '[') {
                numst.push(currchar);
                stringst.push(sb.toString());
                currchar = 0;
                sb = new StringBuilder();
            } else if (c == ']') {
                int repeat = numst.pop();
                StringBuilder tempsb = new StringBuilder(stringst.pop());
                for (int i = 0; i < repeat; i++) {
                    tempsb.append(sb);
                }
                sb = tempsb;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "3[a]2[bc]";
        System.out.println(decodeString(input));
    }
}
