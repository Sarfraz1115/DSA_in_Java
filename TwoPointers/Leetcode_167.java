package TwoPointers;

public class Leetcode_167 {
    public static int[] TwosumArray(int [] numbers, int target){
        int [] result = new int[2];
        // brute Approach
//        for(int i=0; i<numbers.length; i++){
//            for(int j=i+1; j<numbers.length; j++){
//                if(numbers[i] + numbers[j] == target){
//                    int k =0;
//                    result[k++] = i+1;
//                    result[k] = j+1;
//                }
//            }
//        }
//        return result;


        // Optimized Approach
        int n = numbers.length;
        int left= 0; int right = n-1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target){
                right--;
            } else if (sum < target) {
                left++;
            }
            else {
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] numbers = {2,3,4};
//        System.out.println(numbers.length);
        int target = 6;
        int [] result = TwosumArray(numbers, target);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
