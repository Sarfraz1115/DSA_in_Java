package LeetCode_75_Challenge;

public class Leetcode_443 {
    public static int compressString(char[] chars) {
        // 1) finding the continous element from the string
        int n = chars.length;
        int idx = 0;
        for(int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;
            while(i < n && chars[i] == ch) {
                count++;
                i++;
            }
            i--;
            // 2) creating the compressed string
            if(count == 1){
                chars[idx++] = ch;
            }else{
                chars[idx++] = ch;
                String countStr = String.valueOf(count);
                for(char c : countStr.toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;


    }
    public static void main(String[] args) {
        char chars [] = {'a','a','b','b','c','c','c'};
        System.out.println(compressString(chars)); // output : 2, ['a', '2', 'b']
    }
}
