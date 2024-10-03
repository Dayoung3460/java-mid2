package collection.set.test;

import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // List.of()에 배열을 넣어도 되고 값을 나열해도됨
        TreeSet<Integer> integers = new TreeSet<>(List.of(inputArr));
        TreeSet<Integer> integers2 = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        System.out.println(integers);
    }
}
