package lections.lecture5;

import java.util.HashMap;
import java.util.Map;

public class hashTable {
    public static void main(String[] args) {
        Map<Integer, String> table = new HashMap<>();
        table.put(1, "one");
        table.put(2, "two");
        table.put(3, "tree");
        table.put(4, "four");
        table.put(5, "five");
        // table.put(null, "!null"); //error
        System.out.println(table);
    }
}
