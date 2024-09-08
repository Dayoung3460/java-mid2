package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println(hashIndex(1));
        System.out.println(hashIndex(2));
        System.out.println(hashIndex(5));
        System.out.println(hashIndex(8));
        System.out.println(hashIndex(14));
        System.out.println(hashIndex(99));

        Integer[] integers = new Integer[CAPACITY];
        add(integers, 1);
        add(integers, 2);
        add(integers, 5);
        add(integers, 8);
        add(integers, 14);
        add(integers, 99);
        System.out.println("integers = " + Arrays.toString(integers));

        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = integers[hashIndex];
        System.out.println(result);
    }

    private static void add(Integer[] integers, int value) {
        int hashIndex = hashIndex(value);
        integers[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
