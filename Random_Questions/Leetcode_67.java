package Random_Questions;

public class Leetcode_67 {
    public static String Addbinary(String s, String a){
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1;
        int j = a.length() - 1;
        int carry = 0;
        while (i >= 0 || j >=0 || carry == 1){
            int s1 = (i >=0) ? s.charAt(i) - '0' : 0;
            int a1 = (j >=0) ? a.charAt(j) - '0' : 0;
            int total = s1 + a1 + carry;
            res.append(total % 2);
            carry = total / 2;

            i--; j--;
        }
        return res.reverse().toString();

    }

    public static void main(String[] args) {
        String s = "11"; String a = "1";
        System.out.println(Addbinary(s,a));
    }
}
