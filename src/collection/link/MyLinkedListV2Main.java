package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        // 마지막에 추가 0(n)
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println("첫번째 항목에 추가");
        list.add(0, "d");// 0(1)
        System.out.println(list);

        System.out.println("첫번째 항목 삭제");
        list.remove(0);// 0(1)
        System.out.println(list);

        System.out.println("중간 항목 추가");
        list.add(1, "e"); // 0(n)
        System.out.println(list);

        System.out.println("중간 항목 삭제");
        list.remove(1);// 0(n)
        System.out.println(list);
    }
}


// 이중 연결 리스트: 자바에서 제공하는 연결리스트는 마지막 노드를 참조하는 변수도 가지고 있음
// so, 뒤에 추가하거나 삭제하는 경우에도 0(1)로 가능