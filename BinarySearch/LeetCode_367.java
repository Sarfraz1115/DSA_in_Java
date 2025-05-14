package BinarySearch;

public class LeetCode_367 {
    public static boolean isPerfectSquare(int num) {
        int st = 0;
        int end = num;
        while(st <= end){
            int mid = st + (end - st) / 2;
            long sq = (long) mid * mid;
            if(sq == num){
                return true;
            }
            if(sq < num){
                st = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647)); // true
//        System.out.println(isPerfectSquare(14)); // false
    }
}
