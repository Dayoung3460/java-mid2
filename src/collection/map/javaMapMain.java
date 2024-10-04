package collection.map;

import java.util.*;

public class javaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map: " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
    }
}

// HashMap
// key로 해쉬코드 생성(value는 아무 상관없음)
// 저장할 때 entry 구조로 만들어서 저장함
// 검색할 때 키만 보고 찾음
// containsKey() 메소드는 찾을 때 거의 o(1)이라 빠른데
// containsValue()는 o(n)으로 느림. 모든 해쉬인덱스 자리들을 뒤져봐야함

// 해시 테이블: 해시 사용해서 키, 값을 저장하는 자료 구조를 말함