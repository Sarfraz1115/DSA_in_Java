package Random_Questions;

public class Leetcode_165 {
    public static int Compare(String s1, String s2){
        String v1 [] = s1.split("\\.");
        String v2 [] = s2.split("\\.");

        int i = 0; int j = 0;
        while( i < v1.length || j< v2.length ){
            int num1;
            if( i < v1.length){
                 num1 = Integer.parseInt(v1[i]);
            }else {
                num1 = 0;
            }
            int num2;
            if (j < v2.length) {
                num2 = Integer.parseInt(v2[j]);
            } else {
                num2 = 0;
            }
            if(num1 < num2) return -1;
            if(num1 > num2) return 1;
            i++; j++;
        }
        return 0;

    }
    public static void main(String[] args) {
        String s1 = "1.2";
        String s2 = "1.10";
        System.out.println(Compare(s1, s2));
    }
}
