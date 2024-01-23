package lections.lecture5;

import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "one");
        tMap.put(2, "two");
        tMap.put(3, "tree");
        tMap.put(4, "four");
        tMap.put(5, "five");
        tMap.put(6, "six");
        tMap.put(7, "seven");
        System.out.println(tMap);

        System.out.println(tMap.get(3));
        System.out.println(tMap.remove(2));
        System.out.println(tMap);
        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.descendingMap());
        System.out.println(tMap.isEmpty());

        System.out.println(tMap.tailMap(3, true)); //ключ больше либо равен 3
        System.out.println(tMap.headMap(3, false)); // ключ меньше 3

        System.out.println(tMap.lastEntry());
        System.out.println(tMap.firstEntry());
        
    }
}
