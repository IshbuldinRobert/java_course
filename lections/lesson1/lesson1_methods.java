package lections.lesson1;
import java.util.Scanner;

public class lesson1_methods {
    static void sayHi(String text)  {
        System.out.printf("Hi, %s!\n", text);
    }

    static String inputText(String message) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("%s ", message);
        return iScanner.nextLine();
    }

    static int sum(int a, int b)    {
        return a + b;
    }

    static double factorial(int num) {
        if (num == 1 || num == 0) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String[] args)  {
        int number = Integer.parseInt(inputText("Input number:"));
        String name = inputText("Введите имя:");
        sayHi(name);
        System.out.printf("Результат a + b = %d\n", sum(4, 6));
        System.out.printf("%d! = %.0f", number, factorial(number));
    }
}
