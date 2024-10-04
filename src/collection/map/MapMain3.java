package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 50);
        System.out.println("studentMap = " + studentMap);

        // 중복된 키가 없는경우에만 추가
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        // 중복된 키가 없는경우에만 추가2
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println("studentMap = " + studentMap);

    }
}

// HashSet을 보면 HashMap을 갖다씀. HashMap의 value는 안쓰고(더미값 사용) 키값만 가져다 쓰는거임
// LinkedHashSet, TreeSet도 LinkedHashMap, TreeMap에서 갖다쓰느거임.