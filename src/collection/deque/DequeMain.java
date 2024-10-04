package collection.deque;

import java.util.ArrayDeque;

public class DequeMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);

        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
