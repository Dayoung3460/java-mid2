package collection.map.test;

import java.util.HashMap;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 500);
        map.put("banana", 500);
        map.put("mango", 1000);
        map.put("strawberry", 1000);

        for (String key : map.keySet()) {
            if (map.get(key) == 1000) {
                System.out.println(key);
            }
        }
    }
}
