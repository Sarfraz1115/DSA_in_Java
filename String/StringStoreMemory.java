package String;

public class StringStoreMemory {
    public static void main(String[] args) {


//                +---------------------+
//                |      Heap Memory    |
//                +---------------------+
//                |  String Constant   |
//                |       Pool         |
//                +---------------------+
//                | "Hello"   <---- str1|
//                | "World"   <---- str2|
//                +---------------------+
//                | String Object       |
//                |   ("Java")          |  <---- str3
//                +---------------------+


                String str1 = "Hello";
                String str2 = "Hello";
                String str3 = new String("Java");

// str1 and str2 point to the same object in the String Constant Pool
        System.out.println(str1 == str2); // true

// str3 points to a different object on the heap
        System.out.println(str1 == str3); // false
    }
}
