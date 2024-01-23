package seminars.seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class exs3 {

    static Boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static ArrayList fullArrayList() {
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("god", "123", "yep", "nono", "345"));
        return newList;
    }

    static void findAndRemoveInt(ArrayList<String> list) {
        // 1
        // Iterator<String> iter = list.iterator();
        
        // while(iter.hasNext()) {
        //     String nextIter = iter.next();
        //     if (nextIter.matches("\\d+")) {
        //         iter.remove();
        //     }
        // }

        // 2
        Iterator<String> iter = list.iterator();
        
        while(iter.hasNext()) {
            String nextIter = iter.next();
            if (isNumber(nextIter)) {
                iter.remove();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strs = fullArrayList();
        System.out.println(strs);
        findAndRemoveInt(strs);
        System.out.println(strs);
    }
}
