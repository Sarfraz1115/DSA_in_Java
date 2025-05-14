package String;

import java.util.Arrays;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("tony");
//        System.out.println(str);

        String [] st = {"what", "hello", "hey"};
        System.out.println(st.length);

        // 2. Append a string
//        str.append(" world");
//        System.out.println(str);

//        System.out.println(str.charAt(2));

        // set/replace a character with given char at any index
//        str.setCharAt(0,'p');
//        System.out.println(str);

        // insert a character at any index
//        str.insert(0,'s');
//        System.out.println(str);


        // 3. Insert a string
        str.insert(4, " beautiful ");
        System.out.println(str); // Output: tony beautiful

        // 5. Reverse the string
        str.reverse();
        System.out.println(str);

    }
}
