package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

//MyHashSetV3<E>: 클래스, 메서드, 또는 인터페이스에서 사용할 데이터 타입을 지정하지 않고도 여러 종류의 데이터 타입을 처리
// 이 때 <T>는 "타입 파라미터"라고 부르며, 해당 클래스나 메서드를 인스턴스화할 때 실제 데이터 타입으로 대체됩니다
public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value); // o(1)
        LinkedList<E> bucket = buckets[hashIndex]; // o(1)
        if (bucket.contains(value)) { // O(1)에 가까운 O(n)
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);// o(1)
        LinkedList<E> bucket = buckets[hashIndex];// o(1)

        for (E E : bucket) {
            if (E.equals(searchValue)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }

    }

    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
