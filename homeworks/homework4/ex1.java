package homeworks.homework4;

import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> newll = new LinkedList<>();

        for (int i = ll.size() - 1; i >= 0; i--) {
            newll.add(ll.get(i));
        }

        return newll;
    }

}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class ex1 { 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        System.out.println(ll);
        LinkedList<Object> reversedList = LLTasks.revert(ll);
        System.out.println(reversedList);
    }
}