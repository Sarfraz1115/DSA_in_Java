package Arrays;

public class cheatSheet_Questions {
    public static void main(String[] args) {


//        int [] arr = {1,5,3,2,6,4};
//        Arrays.sort(arr);
//        System.out.println("Sorted array: " + Arrays.toString(arr));
        // collection

        // Q.1 -shraddha mam array question one
//        int arr [] = {3,2,1,56,1000,167};
//        int arr [] = {1,345,234,21,56789};
//        int arr [] = {56789};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println(" min : " + min);
//        System.out.println(" max : " + max);




        // kadane's algorithm
//        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
//        int cursum = 0;
//        int maxsum = 0;
//        for (int i=0; i<arr.length;i++){
//            cursum = cursum + arr[i];
//            if(cursum > maxsum){
//                maxsum = cursum;
//            }
//            if(cursum < 0){
//                cursum = 0;
//            }
//        }
//        System.out.println(" subarray " + maxsum );


        // leetcode Q.121
        // best time to buy and sell stock
//        int [] prices = {7,6,4,3,1};
//        int minPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;

//        for(int i=0; i<prices.length; i++){
//            if(prices[i] < minPrice){
//                minPrice = prices[i];
//            }
//            else{
//                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
//            }
//        }
//        System.out.println("Max Profit: " + maxProfit);


        // llet code Q.215 - kth largest element
//        int arr [] = {3,2,3,1,2,4,5,5,6};
//        int k = 4;
//        for(int i = arr.length - 1; i >= 0; i--){
//            if(i == k+1){
//                System.out.println(k + "th largest element is " + arr[i]); ;
//            }
////            System.out.println(i + " " + arr[i]);
//        }

        // leetcode Q.125 - valid palindrome
        // make a program for valid palindrome
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
//                return false;
                System.out.println("false");

            }
            left++;
            right--;
        }
//        return true;
        System.out.println("true");





    }
}
