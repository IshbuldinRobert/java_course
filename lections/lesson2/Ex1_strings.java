package lections.lesson2;

public class Ex1_strings {
    public static void main(String[] args) {
        String[] array = {"R", "o", "b", "e", "r", "t"};
        String str = "  Катя   ";
        System.out.println(str.toUpperCase().trim());
        System.out.println(String.join("", array));
        System.out.println(String.join(", ", array));
        System.out.println(String.join(", ", "R", "o", "b"));
    }
}
