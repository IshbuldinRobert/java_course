package lections.lecture5;

import java.util.HashMap;
import java.util.Map;

import lections.lection1.collectionList;

public class forEachHashMap {
    public static void main(String[] args) {
        Map<Integer, String> colMap = new HashMap<>();
        colMap.put(1, "one");
        colMap.put(2, "two");
        colMap.put(3, "tree");
        System.out.println(colMap);

        for (var item : colMap.entrySet()) {
            System.out.printf("[%d, %s]\n", item.getKey(), item.getValue());
        }
    }    
}