package LeetCode_75_Challenge;

import java.util.Stack;

public class Leetcode_735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for( int i=0; i<asteroids.length; i++ ) {
            while (!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                int top = st.pop();
                if(top > Math.abs(asteroids[i])) {
                    st.push(top);
                    asteroids[i] = 0;
                } else if (top == Math.abs(asteroids[i])) {
                    asteroids[i] = 0;
                }
            }
            if(asteroids[i] != 0){
                st.push(asteroids[i]);
            }

        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] asteroids = {-2, -1, 1, 2};
        int[] result = asteroidCollision(asteroids);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
