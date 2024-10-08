package collection.link;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    // 마지막 노드까지 계속 next로 이동해야 함. O(n) 소요
    private Node getLastNode() {
        Node x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 특정 위치에 있는 데이터 찾아서 변경, 기존 값 반환. O(n)
    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    // 특정 위치에 있는 데이터 반환
    // 배열(배열 리스트, ArrayList)은 인덱스로 원하는 데이터를 즉시 찾을 수 있는데(O(1))
    // 연결 리스트는 노드로 이동해야 하므로 O(n)이 걸림.(다음 노드의 참조값을 가지고 있을뿐)
    // 그래서 인덱스 숫자 만큼 다음 노드를 반복해서 찾아야함.
    // 인덱스 조회 성능 나쁨.
    private Node getNode(int index) {
        Node x = first;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // O(n)
    public int indexOf(Object o) {
        int index = 0;
        for(Node x = first; x != null; x = x.next) {
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}

// 배열 리스트는 중간에 데이터 추가하거나 삭제 할 때 기존 데이터를 한 칸씩 이동해야 하는 문제가 있었음

// 연결 리스트는 배열처럼 실제 인덱스가 존재하는 것이 아님. 단지 연결된 순서를 뜻함
// 연결 리스트의 첫 번째 항목에 값을 추가하면 새로 생성된 노드의 참조만 변경하면 됨. 나머지 노드들에는 영향을 주지 않음.
// 중간에 데이터를 추가할 때는 추가할 위치를 찾는데에 O(n)이 걸리고 추가를 하는건 O(1)이 걸림.
// 중간에 데이터 삭제하는 것도 똑같

// 기능            배열리스트                              연결리스트
// 인덱스조회        O(1) 인덱스로 바로 찾을 수 있음            O(n)
// 검색            O(n)                                 O(n)
// 앞에 추가(삭제)   O(n) 뒤의 데이터를 한칸씩 다 밀어야함        O(1)
// 뒤에 추가(삭제)   O(1) 맨뒤의 인덱스 바로 찾아서             O(n) 맨뒤의 노드를 루프 돌면서 찾아야함
// 중간 추가(삭제)   0(n)                                 O(n)

// 그래서 보통 배열 마지막에 데이터를 추가하는 로직이 많을텐데 이때는 배열리스트 사용하면됨