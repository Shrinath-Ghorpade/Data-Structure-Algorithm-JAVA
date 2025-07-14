package CollectionFRamworks;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Aamla");
        map.put(4, "Orange");

        System.out.println(map.values());

        System.out.println(map.get(1));

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Apple"));

        for(Integer key: map.keySet()){
            System.out.print(map.get(key)+" ");
        }

        System.out.println();
        for(String val: map.values()){
            System.out.print(val+" ");
        }
    }
}
