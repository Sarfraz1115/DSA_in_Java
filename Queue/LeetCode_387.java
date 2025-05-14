package Queue;

public class LeetCode_387 {
    public static int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    break;
                }
                if(j == s.length()-1){
                    return i;
                }

            }
//            return -1;

        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
