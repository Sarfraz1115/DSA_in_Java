package Stack;

import java.util.Stack;

public class Leetcode_739 {
    public static int [] Tempreture(int [] nums){


        int n = nums.length;
        int [] result = new int[n];
        Stack<Integer> numst = new Stack<>();
        Stack<Integer> indst = new Stack<>();
        for(int i = n-1; i>= 0; i--){
            while(!numst.isEmpty() && nums[i] > numst.peek()){
                numst.pop();
                indst.pop();
            }
            if(!indst.isEmpty()){
                result[i] = indst.peek() - i;
            }
            else {
                result[i] = 0;
            }
            numst.push(nums[i]);
            indst.push(i);
        }
        return result;
    }



//        int n = nums.length;
//        int [] result = new int[n];
//        Stack<Integer> indst = new Stack<>();
//        for(int i = 0; i<n; i++){
//            while(!indst.isEmpty() && nums[i] > nums[indst.peek()]){
//                int previndex = indst.pop();
//                result[previndex] = i - previndex;
//            }
//            indst.push(i);
//        }
//       return result;
//    }
    public static void main(String[] args) {
        int [] nums = {73,74,75,71,69,72,76,73};

//        System.out.println(Tempreture(nums));
        int [] gg = Tempreture(nums);
        for(int i = 0; i< gg.length; i++){
            System.out.print(gg[i] + " ");
        }
    }
}
