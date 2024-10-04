package collection.deque;

import java.util.ArrayDeque;

public class DequeQueueMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);

        System.out.println(deque);

        System.out.println(deque.peek());

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque);
    }
}
