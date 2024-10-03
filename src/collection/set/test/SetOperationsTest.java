package collection.set.test;

import java.util.HashSet;
import java.util.List;

public class SetOperationsTest {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union = " + union);

        HashSet<Integer> intersection = new HashSet<>(set1);
        // retain: 유지하다
        // retainAll: 겹치는 요소만 남기고 다 버림
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);

        HashSet<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("difference = " + difference);

    }
}
