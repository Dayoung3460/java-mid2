package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set) {
        System.out.println("set: " + set.getClass());

        // hashSet: 데이터 순서 없음 o(1)
        // linkedHashSet: 들어간 순서대로 o(1)
        // treeSet: 데이터 크기대로 o(log n): 반씩 숭덩숭덩 잘려나감

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
