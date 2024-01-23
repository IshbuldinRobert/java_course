package lections.lecture5;

// LinkedHashMap в отличие от HashMap имеет память, но медлительный

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(7, "seven");
        linkedMap.put(1, "one");
        linkedMap.put(2, "two");
        linkedMap.put(3, "tree");
        linkedMap.put(4, "four");
        linkedMap.put(5, "five");
        linkedMap.put(6, "six");
        
        System.out.println(linkedMap);
    }
}
