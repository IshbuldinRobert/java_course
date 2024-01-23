package lections.lection4;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(123);
        dq.addLast(456);
        dq.addFirst(78);
        int num1 = dq.getFirst(),
            num2 = dq.getLast();
        dq.add(666);

        System.out.println(dq);
        System.out.println(num1);
        System.out.println(num2);

        dq.remove(); // по-умолчанию первый (наименьший) элемент
        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.offerFirst(1)); // return true if the element was added to this deque, else false
        System.out.println(dq);

        System.out.println(dq.poll()); //удаляет и возвращает первый элемент по-умолчанию
        System.out.println(dq);

        dq.add(2);
        dq.add(4);
        dq.add(0);
        dq.add(8);
        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}