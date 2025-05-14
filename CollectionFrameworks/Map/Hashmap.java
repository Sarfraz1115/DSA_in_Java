package CollectionFrameworks.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();

        //  add the key with value
        hash.put(12, "sarfraz");
        hash.put(25, "tabrez");
        hash.put(27, "wajahat");
        // keys should be unique as below value can be same
        hash.put(23, "muskan");
        hash.put(24, "muaskan");

//        System.out.println(hash);

        // meku identify karna hai kiska 27 roll number hai
//        System.out.println(hash.get(27));
        // it will give null if that key is not present
//        System.out.println(hash.get(7));
//
//        System.out.println(hash.containsKey(23));
//        System.out.println(hash.containsValue("Raunak"));

//        for(int i: hash.keySet()){
//            System.out.print(i + " ");
//        }


        Set<Map.Entry<Integer, String>> mmm = hash.entrySet();
        for(Map.Entry<Integer, String> i: mmm){
            System.out.println(i.getKey() + " : " + i.getValue());
        }






    }
}
