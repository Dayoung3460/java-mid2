package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println("studentMap = " + studentMap);

        // 같은 키에 저장하면 덮어쓰기됨
        studentMap.put("studentA", 100);
        System.out.println("studentMap = " + studentMap);

        boolean studentA = studentMap.containsKey("studentA");
        System.out.println(studentA);

        // entry가 삭제됨
        studentMap.remove("studentA");
        System.out.println("studentMap = " + studentMap);
    }
}
