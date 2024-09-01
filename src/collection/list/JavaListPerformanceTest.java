package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MArrayList 추가==");
        addFirst(new ArrayList<>(), size); // 자바 ArrayList는 데이터를 하나씩 밀지않고 고속복사를 하기 때문에 빨라졌음
        addMid(new ArrayList<>(), size);
        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size);


        System.out.println();
        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size); // 자바 linkedList는 마지막 노드 참조값을 가지고 있어 O(1).

        int loop = 10000;
        System.out.println("== ArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);


        System.out.println("== LinkedList 조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1); // 자바 linkedList는 마지막 노드 참조값을 가지고 있어 O(1).


        // search 할 때도 배열의 요소는 같이 붙어 있어서 루프돌면서 찾는게 쉬운데
        // 노드 객체는 따로 떨어져있어서 찾는게 쉽지 않음
        System.out.println("== ArrayList search==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);


        System.out.println("== LinkedList search==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }


    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}

// 자바에서 성능테스트

// 기능            배열리스트       연결리스트
// 앞에 추가(삭제)   O(n) 106ms     O(1) 2ms      => 연결리스트 사용(하지만 이것도 데이터가 진짜 많을 때 연결리스트 사용. 몇백 몇천건 정도는 별 차이 안남)
// 중간 추가(삭제)   O(n) 49ms      O(n) 1116ms   => 배열리스트 사용
// 뒤에 추가(삭제)   O(1) 1ms       O(n) 2ms      => 배열리스트 사용
// 인덱스조회        O(1) 1ms       O(n) 439ms    => 배열리스트 사용
// 검색            O(n) 104ms     O(n) 473ms    => 배열리스트 사용
