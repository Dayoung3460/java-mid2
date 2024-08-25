package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        printAll(first);
        System.out.println(getLastNode(first));

        // 특정 인덱스 노드 조회
        // 노드도 인덱스 개념이 있음
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        // add node
        // node를 추가할 때 하나씩 추가: 배열과 다르게 메모리 낭비 하지 않음

        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
    }

    private static void add(Node first, String param) {
        Node lastNode = getLastNode(first);
        lastNode.next = new Node(param);

    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while(x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }
}

// 각각의 노드를 연결(링크)해서 사용하는 자료 구조로 리스트를 만들 수 있음: 연결 리스트