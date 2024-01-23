package seminars.seminar3;

import java.util.ArrayList;
import java.util.List;

public class exSrart {
    public static void main(String[] args) {
        /********************/
        // List list = new ArrayList();
        // list.add(123);
        // list.add("Hello");
        // list.add(null);
        // System.out.println(list);
        // ArrayList<Integer> list2 = new ArrayList(list);
        // System.out.println(list2);

        /********************/
        List list = List.of(1, 2, 3, 4, 5);
        System.out.println();
        list.remove(3);
        System.out.println(list);
    }
}
