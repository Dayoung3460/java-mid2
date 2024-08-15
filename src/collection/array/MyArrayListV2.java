package collection.array;

import java.util.Arrays;
public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if(size == elementData.length) {
            // 동적으로 크기가 변하는 구조
            grow();
        }
        elementData[size] = e;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        // 왜 두배씩 증가?
        // 하나씩만 증가하면 연산이 너무 자주 발생해.
        // 또 너무 많이 증가시키면 메모리를 너무 많이 잡아먹음
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고 기존 배열을 새로운 배열에 복사. newCapacity 길이만큼.
        // 배열을 새로 생성함과 동시에 기존 배열의 데이터를 복사함
        // 새로 만든 배열의 남는 공간은 null로 채워짐.
        // elementData의 참조값이 변경됨
        // 기존 배열은 GC의 대상
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object newValue) {
        Object oldValue = get(index);
        elementData[index] = newValue;
        return oldValue;
    }


    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size: " + size +
                " capacity: " + elementData.length;

    }
}
