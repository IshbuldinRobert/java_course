package homeworks.homework4;

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    static Deque<Integer> deq = new ArrayDeque<>();

    public float calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                deq.add(a + b);
                return (float) a + b;
            case '-':
                deq.add(a - b);
                return a - b;
            case '*':
                deq.add(a * b);
                return a * b;
            case '/':
                deq.add(a / b);
                return a / b;
            case '<':
                deq.removeLast();
                return deq.removeLast();
            default:
                return 0101010101;
        }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class ex3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
        float result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        float prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}