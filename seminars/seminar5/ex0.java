package seminars.seminar5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex0 {
    public static void main(String[] args) {
        Map<Integer, String> dataEmployee = new TreeMap<>();
        dataEmployee.put(123456, "Иванов");
        dataEmployee.put(321456, "Васильев");
        dataEmployee.put(234561, "Петрова");
        dataEmployee.put(234432, "Иванов");
        dataEmployee.put(654321, "Петрова");
        dataEmployee.put(345678, "Иванов");

        String targetName = "Иванов";

        for (var item : dataEmployee.entrySet()) {
            // if (item.getValue() == targetName) {
                System.out.println(item);
            // }
        }
    }

}
