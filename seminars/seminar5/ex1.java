package seminars.seminar5;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)

public class ex1 {
    public static void main(String[] args) {
        String s = "pauer";
        String t = "title";
        
        System.out.println(isomorfCheck(s, t));
    }
    static boolean isomorfCheck(String w1, String w2) {
        if (w1.length() != w2.length()) return false;
        if (w1.equals(w2)) return true;

        Map<Character, Character> checkMap = new HashMap<>();

        for (int i = 0; i < w1.length(); i++) {
            if (checkMap.containsKey(w1.charAt(i))) {
                if (checkMap.get(w1.charAt(i)) != w2.charAt(i)) {
                    return false;
                }
            }
            else {
                checkMap.put(w1.charAt(i), w2.charAt(i));
            }
        }
        return true;
    }
}
