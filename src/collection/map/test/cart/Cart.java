package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    HashMap<Product, Integer> hashmap = new HashMap<>();

    public void add(Product product, int count) {
        // 내가 한 방법
//        if (hashmap.containsKey(product)) {
//            hashmap.put(product, hashmap.get(product) + count);
//        } else {
//            hashmap.put(product, count);
//        }

        // 김영한 센세 방법
        Integer existingCount = hashmap.getOrDefault(product, 0);
        hashmap.put(product, existingCount + count);
    }

    public void minus(Product product, int count) {
        // 내가 한 방법
//        if (hashmap.containsKey(product)) {
//            if (hashmap.get(product) - count > 0) {
//                hashmap.put(product, hashmap.get(product) - count);
//            } else {
//                hashmap.remove(product);
//            }
//        } else {
//            System.out.println("Product not exists");
//        }

        // 김영한 센세 방법
        Integer existingCount = hashmap.getOrDefault(product, 0);
        if ((existingCount - count) > 0) {
            hashmap.put(product, existingCount - count);
        } else {
            hashmap.remove(product);
        }


    }

    public void printAll() {
        for (Map.Entry<Product, Integer> entry : hashmap.entrySet()) {
            System.out.println("Item: " + entry.getKey().getItem() + " Price: " + entry.getKey().getPrice() + " Count: " + entry.getValue());
        }
    }
}
