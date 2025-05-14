package CollectionFrameworks.Map;

import java.util.HashMap;

public class hashcodeEqualsMethod {
    public static void main(String[] args) {
        HashMap<person, String> map = new HashMap<>();
        person p1 = new person("Sarfraz", 2);
        person p2 = new person("tabrez", 3);
        person p3 = new person("muskan", 4);

        map.put(p1, "Engineer");
        map.put(p2, "teacher");
        map.put(p3, "doctor");
        System.out.println(map.get(p1));
        System.out.println("hashmap size " + map.size());
    }



    static class person{
        private String name;
        private int id;

        public person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

}
