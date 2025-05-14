package Arrays;

public class Leetcode_7 {
    public static int reverse(int x){
        int result = 0;
        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();
        try{
            if(x < 0){
                reversed = reversed.substring(0, reversed.length() - 1);
                result = Integer.parseInt(reversed) * -1;
            }
            else{
                result = Integer.parseInt(reversed);
            }
        }catch(NumberFormatException e){
            return 0;
        }
        return result;
    }
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));

    }
}
