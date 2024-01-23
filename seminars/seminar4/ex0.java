package seminars.seminar4;

import java.util.*;

public class ex0 {
    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // st.add(1);
        // st.add(2);
        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        // System.out.println(st);

        int count = 100_000;

        long time = System.currentTimeMillis();

        System.out.println("Конец списка");
        ArrayList<Integer> arr = fillArrayListAddLast(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        LinkedList<Integer> ll = fillLinkedListAddLast(count);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - time));

        System.out.println("\nНачало списка");
        time = System.currentTimeMillis();
        ArrayList<Integer> arr1 = fillArrayListAddFirst(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        LinkedList<Integer> ll1 = fillLinkedListAddFirst(count);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - time));

        System.out.println("\nСередина списка");
        time = System.currentTimeMillis();
        ArrayList<Integer> arr2 = fillArrayListAddMiddle(count);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        LinkedList<Integer> ll2 = fillLinkedListAddMiddle(count);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - time));
    }

    static ArrayList<Integer> fillArrayListAddLast(int size) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.addLast(i);
        }

        return list;
    }

    static LinkedList<Integer> fillLinkedListAddLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);
        }

        return linkedList;
    }

    static ArrayList<Integer> fillArrayListAddFirst(int size) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.addFirst(i);
        }

        return list;
    }

    static LinkedList<Integer> fillLinkedListAddFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }

        return linkedList;
    }

    static ArrayList<Integer> fillArrayListAddMiddle(int size) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(list.size() / 2, i);
        }

        return list;
    }

    static LinkedList<Integer> fillLinkedListAddMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }

        return linkedList;
    }
}
