package lections.lesson1;
import java.util.Scanner;

public class lesson1_next_methods {
    static public void main(String[] args) {
// Условный оператор
        // int a = 1,
        //     b = 2,
        //     max = 0,
        //     min = a < b ? a : b; // тернарная операция

        // if (a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }

// Оператор выбора

        // int mounth = Integer.parseInt(lesson1_methods.inputText("Введите месяц:"));
        // String text = "";
        // switch (mounth) {
        //     case 1, 2, 12:
        //         text = "Winter";
        //         break;
        //     case 6, 7, 8:
        //         text = "Summer";
        //         break;
        //     default:
        //         text = "Fuuck...";
        //         break;
        // }
        // System.out.printf("Ответ: %s", text);
//  циклы
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(lesson1_methods.inputText("Введите элемент:"));
        }
        for (int item : array) {
            System.out.println(item);
        }
        
    }
}