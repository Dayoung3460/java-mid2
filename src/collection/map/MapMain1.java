package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        // 순서보장 안됨
        System.out.println("studentMap = " + studentMap);

        Integer studentD = studentMap.get("studentD");
        System.out.println("studentD = " + studentD);

        // key는 Set 타입으로 반환
        Set<String> strings = studentMap.keySet();
        System.out.println("strings = " + strings);
        for (String string : strings) {
            System.out.println("key = " + string);
            System.out.println("value = " + studentMap.get(string));
        }

        // values는 Collection type으로 반환됨
        // 값들이 순서 보장이 안돼서 List도 아니도 값이 중복될 수도 있어서 Set도 아니고. 그냥 값의 모음
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        // 엔트리: 키, 값을 보관하는 자료구조. 객체.
        // Map 내부에 있는 인터페이스
        for (Map.Entry<String, Integer> entries : studentMap.entrySet()) {
            System.out.println("stringIntegerEntry = " + entries);
            System.out.println("entries.getKey() = " + entries.getKey());
            System.out.println("entries.getValue() = " + entries.getValue());
        }
    }
}
