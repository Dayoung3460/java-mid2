package collection.array;

import java.util.Arrays;

// E: Element

// 이 클래스의 단점
// 배열의 정확한 크기를 알지 못하면 메모리 낭비됨(사용되지 않는 배열의 뒷부분)
// 데이터를 중간에 추가하거나 삭제할 때 비효율(O(n))
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4() {
        // new E[]는 안됨. new Object[]로 생성 후 형변환 필요
        // 제네릭은 런타임에 이레이저에 의해 타입 정보가 사라짐
        // 런타임에 타입 정보가 필요한 생성자에 사용 불가
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
