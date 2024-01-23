package seminars.seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Принимает от пользователя строку вида text~num
// Расспиливает строку по ~, сохраняет text в связный списко на позицию num
// Если введено print~num, выводит строку из позиции num, в связном списке и удаляет её из списка

public class ex1 {
    public static void main(String[] args) {
        LinkedList<String> ll = fillLinkedList(5);

        while (true) {
            String textNum = inputString("Введите строку вида text~num: ").trim();
            String[] strings = textNum.split("~");
            String stringNum = strings[1].trim();

            // while (numIsInt(stringNum)) {
            //     System.out.println("Некорректные данные!");
            //     textNum = inputString("Введите строку вида text~num: ");
            //     strings = textNum.split("~");
            //     stringNum = strings[1];
            // }

            String text = strings[0].trim();
            int num = Integer.parseInt(stringNum);

            if (text.equals("print") && num < ll.size()) {
                System.out.printf("text под индексом %s: %s\n", stringNum, ll.get(num));
                ll.remove(num);
            }
            else if (num < ll.size()) {
                // ll += fillLinkedList(ll.size() - );
                ll.add(num, text);
            }
            else {
                System.out.println("Некорректные данные");
            }
            System.out.println(ll);
        }
        
    }

    static String inputString(String message) {
        Scanner newScanner = new Scanner(System.in);
        System.out.print(message);
        String text = newScanner.nextLine();
        newScanner.close();
        return text;
    }

    // static boolean numIsInt(String strNum) {
    //     try {
            
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }

    static LinkedList<String> fillLinkedList(int size) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i, null);
        }
        return list;
    }
}
