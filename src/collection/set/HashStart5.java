package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    //    CAPACITY가 클수록 해쉬 충돌이 덜 날 확률이 높음
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // LinkedList[] 배열을 생성한 것임.
        // Integer 타입의 LinkedList로 이루어진 배열 생성
        // 배열 요소 하나하나엔 아직 값이 안들어 갔음. 다 null로 채워져 있음
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 배열을 돌면서 null이였던 데이터를 LinkedList 타입으로 초기화(아무값이 안들어 있음)시켜줌
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println(searchValue + " contains = " + contains);


    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)

        // Set을 위해 해쉬를 사용하기 때문에 중복값을 걸러줘
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        // bucket: [99, 9]
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        // LinkedList에서 제공하는 contains 메소드가 있음
        return bucket.contains(searchValue); // O(n)
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
