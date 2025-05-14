package Stack;

import java.util.Stack;

public class RemoveConsecutiveSeq {
    public static int [] removecon(int arr[]) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }
            else if(arr[i] == st.peek()) {
                if(arr[i] != arr[i + 1] || i == arr.length-1 ){
                    st.pop();
                }
            }
        }
        int [] result = new int[st.size()];
        for(int i = result.length-1; i>=0 ; i--){
            result[i] = st.pop();
        }
        return result;  // return the array with removed consecutive sequences.
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,3,10,10,10,5,2};
        int [] result = removecon(arr);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");

        }
    }
}
