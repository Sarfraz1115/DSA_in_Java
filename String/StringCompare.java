package String;

public class StringCompare {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello";
//
//        System.out.println(str1 == str2); // true
//
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//
//        System.out.println(str3 == str4); // false
//
//        System.out.println(str3.equals(str4)); // true





        String name1 = "Tony";
        String name2 = "Tony";
//        if (name1.equals(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }

//
//        //DO NOT USE == to check for string equality
//        //Gives correct answer here
//        if (name1 == name2) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }


       //Gives incorrect answer here
        //This is because new String("Tony") creates a new object in memory,
        //and name1 and name2 are pointing to the same object.

//        if (new String("Tony") == new String("Tony")) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }


    }
}

