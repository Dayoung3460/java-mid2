package collection.array;

import java.util.Arrays;

// 크기를 동적으로 변경하려면 리스트!! List
// 순서가 있고 중복 허용
// 참고로 Set은 중복 허용 안함
// 배열을 활용한 리스트 자료 구조: ArrayList
public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    // CAPACITY는 배열의 전체 크기, size는 입력된 데이터의 크기
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object newValue) {
        Object oldValue = get(index);
        elementData[index] = newValue;
        return oldValue;
    }


    // 검색 기능. 찾는 배열 요소의 인덱스 반환
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
        // Arrays.copyOf(복사할 배열, size): 복사할 배열의 사이즈만큼만 복사
        // 배열의 의미없는 값들은 출력 안하려고
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size: " + size +
                " capacity: " + elementData.length;

    }
}
