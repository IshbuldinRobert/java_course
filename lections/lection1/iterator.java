package lections.lection1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        
        for (int item : list) {
            System.out.println(item);
        }

        ListIterator<Integer> col = list.listIterator();
        
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
        }
    }
}