package Recursion;

public class recursion_2 {
    // find the first and last occurence of element in string - rough notebook recursion Q.1
//    public static int first = -1;
//    public static int last = -1;
//    public static void findFirstLastOccurence(String str, int idx, char ch) {
//        if(idx == str.length()){
//            System.out.println("first occurence " + first);
//            System.out.println("last ocurence " + last);
//            return;
//        }
//        char curchar = str.charAt(idx);
//        if(curchar == ch) {
//            if(first == -1){
//                first = idx;
//            }else{
//                last = idx;
//            }
//        }
//        findFirstLastOccurence(str, idx+1, ch);
//    }



    // check if an array is sorted.   - rough notebook recursion Q.2
//    public static boolean isSorted(int[] arr, int idx) {
//        if(idx == arr.length - 1){
//            return true;
//        }
//        if(arr[idx] < arr[idx + 1]){
//            return isSorted(arr,idx + 1);
//        }
//        return false;
//    }



    // move all x at the end of the string   - rough notebook recursion Q.3
//    public static void moveXToEnd(String str, int idx, int count, String newstr) {
//        if(idx == str.length() - 1){
//            for (int i = 0; i< count; i++){
//                newstr += 'x';
//            }
//            System.out.println(newstr);
//            return;
//        }
//
//        char curchar = str.charAt(idx);
//        if (curchar == 'x') {
//            count++;
//            moveXToEnd(str, idx+1, count, newstr);
//
//        }
//        else{
//            newstr += curchar;   // newstr = newstr + curchar
//            moveXToEnd(str, idx+1, count, newstr);
//        }
//    }


    // remove duplicates in string first method   - rough notebook recursion Q.4
    public static void removed(String str, int idx, String newstrr){
        // base case
        if(idx == str.length() - 1){
            System.out.println(newstrr);
            return;
        }
        // main kaam
        char curchar = str.charAt(idx);
        char nextchar = str.charAt(idx+1);

        if(curchar == nextchar){
            removed(str, idx+1, newstrr);
        }
        else{
            newstrr += curchar;
            removed(str, idx+1, newstrr);
        }
    }
    // remove duplicates in string second method
//    public static boolean [] map = new boolean[26];
//    public static void removeDuplicates(String str, int idx, String newstr ) {
////        // base case
//        if (idx == str.length() - 1) {
//            System.out.println(newstr);
//            return;
//        }
////        // mera kaam
//        char ch = str.charAt(idx);
//        if (map[ch - 'a']) {
//            removeDuplicates(str, idx + 1, newstr);
//        } else {
//            newstr += ch;
//            map[ch - 'a'] = true;
//            removeDuplicates(str, idx + 1, newstr);
//        }
//    }


    public static void main(String args[]) {
//        String str = "bacdaaeafagh";
//        findFirstLastOccurence(str, 0, 'a');

//        int[] arr = {10,20,30,40};
//        System.out.println(isSorted(arr,0));

//        String str = "abxcxxdxf";
//        moveXToEnd(str, 0, 0, "");

        // first method
//        String strr = "abbcdda";
//        removed(strr, 0, "");

        // second method
//        String strr = "abcddeef";
//        removeDuplicates(strr, 0, "");

    }
}
