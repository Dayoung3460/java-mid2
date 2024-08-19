package collection.array;

import java.util.Arrays;

// E: Element
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if(size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if(size == elementData.length) {
            grow();
        }
        // 데이터를 추가할 위치부터 마지막 위치까지 데이터를 오른쪽으로 한 칸씩 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // 컴파일러에게 경고를 무시하도록 지시
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E newValue) {
        E oldValue = get(index);
        elementData[index] = newValue;
        return oldValue;
    }

    public E remove(int index) {
        E oldValue = get(index);
        // 데이터를 왼쪽으로 하나씩 옮겨. remove할 데이터를 덮어씌움
        shiftLeftFrom(index);

        size--;
        // 마지막에 비어있는 곳에 null을 넣어줌
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o) {
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
