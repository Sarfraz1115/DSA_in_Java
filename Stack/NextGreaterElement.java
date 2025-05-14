package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] result = new int[arr.length];
        int n = arr.length;
        result[n-1] = -1;
        st.push(arr[n-1]);

        for(int i = n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i] ){
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
//        System.out.println("Input array:");
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//
//        // Print the result array
//        System.out.println("Next Greater Elements:");
//        for (int value : result) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
    }
}
