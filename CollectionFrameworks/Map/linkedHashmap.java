package CollectionFrameworks.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashmap {
    public static void main(String[] args) {
//        LinkedHashMap<String, Integer> linkhashmap = new LinkedHashMap<>();
//        linkhashmap.put("Apple", 10);
//        linkhashmap.put("Mango", 12);
//        linkhashmap.put("Grapes", 20);
//        for(Map.Entry<String, Integer> entry: linkhashmap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


        // we can add initial capacity, loadfactor and access order
        LinkedHashMap<String, Integer> ll = new LinkedHashMap<>(11, 0.3f, true);
        ll.put("Apple", 10);
        ll.put("Mango", 12);
        ll.put("Grapes", 20);

        ll.put("Mango", 12);
        ll.put("Apple", 12);
                for(Map.Entry<String, Integer> entry: ll.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
