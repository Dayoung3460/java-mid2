package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value); // o(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // o(1)
        if (bucket.contains(value)) { // O(1)에 가까운 O(n)
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);// o(1)
        LinkedList<Object> bucket = buckets[hashIndex];// o(1)

        for (Object object : bucket) {
            if (object.equals(searchValue)) {
                return true;
            }
        }
        return false;

        // bucket 안에 searchValue 하나만 들어있을 확률이 높고 2개 이상의 요소가 들어갈 확률은 적음
//        return bucket.contains(searchValue);// O(1)에 가까운 O(n )
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        // LinkedList에는 remove 함수가 두개 있는데
        // 1. 인덱스를 넘겨서 해당 인덱스에 있는 값을 지움
        // 2. 값(객체)을 넘겨서 해당 값(객체)를 지움
        // 지금 지워야할 값이 value인데 value가 int임. 그래서 객체로 바꿔서 remove 시킴
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }

    }

    private int hashIndex(Object value) {
        // Object의 hashCode()가 음수가 나올 수도 있음
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
