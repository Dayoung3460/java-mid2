package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("== add last ==");
        list.add(3, "addList");
        System.out.println(list);

        System.out.println("== add first ==");
        list.add(0, "addFirst");
        System.out.println(list);

        Object removed1 = list.remove(4);
        System.out.println(removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println(removed2);
        System.out.println(list);
    }
}

// 이러한 자료 구조을 배열 리스트 ArrayList라고 함.
// list: 순서가 있고 중복 데이터 저장 가능
// 실제 내부에서는 배열을 사용하고 있음
// --> ArrayList
// 데이터 마지막 추가: O(1)
// 데이터 앞, 중간에 추가: O(n)
// 데이터 마지막 삭제: O(1)
// 데이터 앞, 중간 삭제: O(n)
// 인덱스 조회: O(1)
// 데이터 검색: O(n)