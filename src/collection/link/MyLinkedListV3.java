package collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<E>(e);
        if(first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for(Node<E> x = first; x != null; x = x.next) {
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

    // 중첩 클래스 복습,,
    // inner 클래스는 inner static 클래스보다 메모리를 더 먹고, 더 느리고, 내부 클래스가 사용될 경우 바깥 클래스가 gc 대상에서 빠져버려 메모리 관리가 안될 수 있음.
    // 일반적으로 내부 클래스 인스턴스 만들기 위해선 먼저 외부 클래스 초기화한 뒤 내부클래스 초기화해야함.
    // 이 단계에서 이너클래스는 외부클래스의 참조를 가지게 됨.
    // 내부 클래스가 외부의 멤버를 사용하지 않아도 똑같음.

    // static inner 클래스는 외부 참조를 하지 않음
    // inner class와 상관없이 바깥 클래스가 더이상 쓰이지 않으면 바깥클래스는 gc 대상이 됨.

    // so, 내부 클래스가 외부 클래스의 멤버를 가져와 사용하는 경우가 아니면 내부 클래스 선언할 때는 static 붙여주자
    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if(x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
