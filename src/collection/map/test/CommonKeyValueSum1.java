package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        // Map.of() 사용하면 해쉬맵이랑 비슷하지만 수정할 수 없는 맵으로 반환됨 ImmutableCollections
        // map1을 수정할 수 없음
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        for (String map2Key : map2.keySet()) {
            for (String map1Key : map1.keySet()) {
                int sum = 0;
                if (map2Key.equals(map1Key)) {
                    sum = map1.get(map1Key) + map2.get(map2Key);
                    System.out.println(map2Key + " " + sum);
                }

            }
        }
    }
}
