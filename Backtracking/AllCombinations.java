package Backtracking;

public class AllCombinations {

    // printing all combinations of string -  ABC, ACB, BAC, BCA, CBA, BAB
    public static void permutation(String str, String perm){
        // base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        // mera kaaam
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutation(newstr, perm + ch);
        }
    }
    public static void main(String[] args) {
                String str = "ABC";
        permutation(str,"");
    }
}
