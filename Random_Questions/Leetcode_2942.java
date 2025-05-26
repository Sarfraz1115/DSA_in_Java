package Random_Questions;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2942 {
    // leetcode daily problem thi
    public static List<Integer> findWordsContaining(String [] words, char x){
        List<Integer> res = new ArrayList<>();
        int idx = 0;
        for(String str: words){
            for(int i = 0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c == x){
                    res.add(idx);
                    break;
                }
            }
            idx++;
        }



        // second code to solve. lekin iski length kam hai but T.c and S.c same hai like above.
//         for(int i=0; i<words.length; i++){
//             if(words[i].indexOf(x) != -1){
//                 res.add(i);
//             }
//         }




        return res;
    }
    public static void main(String[] args) {
        String [] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        System.out.println(findWordsContaining(words, x));
    }
}
