package Arrays;

public class Leetcode_9 {
    public static boolean PalindromNumber(int x){
        String str = Integer.toString(x);
        System.out.println(str);
        StringBuilder st = new StringBuilder(str);
        String reverstr = st.reverse().toString();

        if(reverstr.equals(str)){
            return true;
        }
        return false;


    }
    public static void main(String[] args) {
        int x = -121;
//        String str = Integer.toString(x);
        System.out.println(PalindromNumber(x));

    }
}
