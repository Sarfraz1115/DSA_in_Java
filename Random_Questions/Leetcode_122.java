package Random_Questions;

public class Leetcode_122 {
    public static int BestTime(int [] prices){
        int sell = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i< prices.length; i++){
            if(prices[i] < sell){
                sell = prices[i];
            }else{
                int temp = prices[i] - sell;
                ans += temp;
                sell = prices[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(BestTime(prices));
    }
}
