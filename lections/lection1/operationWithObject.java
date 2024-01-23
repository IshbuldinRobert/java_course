package lections.lection1;

public class operationWithObject {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.5, 2));
        System.out.println(Sum(1.3, 2.4));
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        }
        else if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        }
        else return 0;
    }
}
