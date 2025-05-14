package String;

public class LeeeetCode_1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }

        while (i < word1.length()) {
            merged.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            merged.append(word2.charAt(j));
            j++;
        }

        return merged.toString();
    }
    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "pqr";
        System.out.println(text2.length());

//        System.out.println(mergeAlternately(text1, text2));
    }
}
