package lections.lection1;

public class objectInJava {
    public static void main(String[] args) {
        Object n = 0;
        System.out.println((int)n + 4);
        System.out.print("Тип переменной: ");
        GetType(n);
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
