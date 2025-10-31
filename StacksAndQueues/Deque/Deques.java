package StacksAndQueues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque.removeFirst());
    }
}
