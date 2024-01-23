package lections.lection4;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.remove(1);
        System.out.println(ll);

        // Queue => LinkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(12);
        queue.add(23);
        queue.remove();
        System.out.println(queue);
    }
}
