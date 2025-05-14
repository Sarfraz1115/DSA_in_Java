package Stack;

import java.util.Stack;

public class PreviousSmallElement {
    public static void main(String[] args) {

                Stack<Integer> st = new Stack<>();
                int[] arr = {1,2,6,3,8};
                int n = arr.length;
                int[] result = new int[n];
                result[0] = -1;
                st.push(arr[0]);

                for(int i = 1; i<n; i++){
                    while(!st.isEmpty() && st.peek() >= arr[i] ){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        result[i] = -1;
                    }else{
                        result[i] = st.peek();
                    }
                    st.push(arr[i]);
                }
                for (int i=0; i<arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                for(int i = 0; i< result.length; i++){
                    System.out.print(result[i] + " ");
                }

            }
        }


