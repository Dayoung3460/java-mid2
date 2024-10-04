package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String[] strArr : productArr) {
            hashMap.put(strArr[0], Integer.parseInt(strArr[1]));
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
    }
}
