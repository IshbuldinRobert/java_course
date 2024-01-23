package lections.lecture5;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "red");
        db.put(2, "green");
        db.putIfAbsent(1, "blue");
        db.put(null, "!null");

        System.out.println(db);
        System.out.println(db.get(2));

        db.remove(null);
        System.out.println(db);

        System.out.println(db.containsKey(1));
        System.out.println(db.containsValue("red"));

        System.out.println(db.keySet());
        System.out.println(db.values());
    }
}
