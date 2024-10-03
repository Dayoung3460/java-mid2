package collection.set.test;

import java.util.HashSet;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        HashSet<Integer> integers = new HashSet<>(); // o(1)
        for (Integer inputItem : inputArr) {
            integers.add(inputItem);
        }
        System.out.println(integers);
    }
}
