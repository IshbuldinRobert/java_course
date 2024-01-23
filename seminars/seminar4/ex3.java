package seminars.seminar4;
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex3 {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 6, 7, 34, 354, 576};
        Stack<Integer> st = new Stack<>();
        Queue<Integer> que = new LinkedList<>();
        printStack(elements, st);
        printQueue(elements, que);
    }

    static void printStack(int[] nums, Stack<Integer> st) {
        for (Integer num : nums) {
            st.push(num);
        }
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }

    static void printQueue(int[] nums, Queue<Integer> que) {
        for (Integer num : nums) {
            que.add(num);
        }
        // while (que.size() != 0) {
        //     System.out.print(que.remove() + " ");
        // }
        System.out.println(que);
    }
}
