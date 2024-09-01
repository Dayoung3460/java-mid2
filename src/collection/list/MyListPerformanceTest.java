package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);


        System.out.println();
        System.out.println("==MyLinkedList 추가(데이터를 미는것 보다 인덱스를 찾아가는게 조금 더 느림)==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);

        int loop = 10000;
        System.out.println("== MyArrayList 조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);


        System.out.println("== MyLinkedList 조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("== MyArrayList search==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);


        System.out.println("== MyLinkedList search==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }


    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}


// arrayList: 데이터를 밀어야하는 경우
// linkedList: 인덱스를 찾아야하는 경우
// 둘 다 O(n)인데 데이터 미는 것 보다 인덱스 찾는게 더 느림.

// MyArrayList는 요소들이 메모리 상에서 연속적으로 위치하여 cpu 캐시 효율이 좋고(요소 하나를 찾으면 그 다음의 요소들을 미리 찾아놓는다는 등의 최적화), 메모리 접근 속도가 빠름
// MyLinkedList는 각 노드가 별도의 객체로 존재하고 다음 요소의 참조를 저장하기 때문에 cpu 캐시 효율이 떨어지고, 메모리 접근 속도가 상대적으로 느림
// MyArrayList의 경우 capacity를 넘어서면 배열을 다시 만들고 복사하는 과정이 추가됨. 하지만 한번에 2배씩 늘어나기 때문에 전체 성능엔 큰 영향 주지 않음.

// 배열리스트 vs 연결리스트
// -> 대부분은 배열리스트가 성능상 유리. 데이터를 앞쪽에 자주 추가하거나 삭제할 일이 있으면 연결리스트