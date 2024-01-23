package seminars.seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ex2 {
    static boolean checkBracket(String str) {
        Map<Character, Character> brackets = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char item : chars) {
            if (brackets.containsValue(item)) {
                stack.push(item);
            }
            else if (brackets.containsKey(item)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(item)) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
    }

    static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        map.put('>', '<');

        // map.put('(', ')');
        // map.put('[', ']');
        // map.put('{', '}');
        // map.put('<', '>');

        return map;
    }

    public static void main(String[] args) {
        String str = "3-(a+[*3])(-){4-{6}}";

        System.out.println(checkBracket(str));
    }
}