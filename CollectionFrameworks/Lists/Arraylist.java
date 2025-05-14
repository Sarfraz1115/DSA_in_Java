package CollectionFrameworks.Lists;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

        // we can write in this format bu also write in List format

        // both are same
//        List<Integer> ll = new ArrayList<>();
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(2);
//        al.add(3);
//        al.add(4);
//
//        al.add(1,30);
//        for(int c: al) {
//            System.out.print(c  + " ");
//        }
//
//        List<Integer> ll1 = List.of(1,2,3,4,5,6);
//        al.addAll(ll1);
//        System.out.println(ll1);


        // String sorting
        List<String> ls = new ArrayList<>();
        ls.add("Apple");
        ls.add("Banana");
        ls.add("date");

        // now I have to sort it by its length
        ls.sort((a,b) -> b.length() - a.length());
        System.out.println(ls);

    }
}
