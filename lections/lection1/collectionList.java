package lections.lection1;

import java.util.ArrayList;

public class collectionList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList list = new ArrayList<>();
        list.add(234);
        list.add("123");
        for (Object o : list) {
            System.out.println(o); // .getClass().getName()
        }

        // Разные способы создания List
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>(10);
        // ArrayList<Integer> list4 = new ArrayList<>(list3);
    }
}
