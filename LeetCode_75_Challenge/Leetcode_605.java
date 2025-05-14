package LeetCode_75_Challenge;

public class Leetcode_605 {
    public static boolean canPlaceFlowers(int [] flowerbed, int n){
        int count = 0;
        int i = 0;
        while(i < flowerbed.length) {
//            if(flowerbed[i] == 0){
//                if(i == 0 || flowerbed[i-1] == 0){
//                    if(i == flowerbed.length - 1 || flowerbed[i+1] == 0){
//                        count++;
//                        i += 2;
//                    } else {
//                        i++;
//                    }
//                } else {
//                    i++;
//                }
//            } else {
//                i++;
//            }
//        }
//        return count >= n;
            if (flowerbed[i] == 0) {
                if ( i == 0 || flowerbed[i - 1] == 0) {
                    if (flowerbed[i + 1] == 0 || i == flowerbed.length - 1) {
                        count++;
                        i += 2;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            }else{
                i++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int [] flowerbed = {0,0,1,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));

    }
}
