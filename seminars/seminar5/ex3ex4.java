package seminars.seminar5;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class ex3ex4 {
    public static void main(String[] args) {
        String str = "MMXXIV";

        System.out.println(convertNumber(str));
        System.out.println(convertArabicToRoman(convertNumber(str)));
    }

    static Map<Character, Integer> getRomanArabicNumsMap() {
        Map<Character, Integer> nums = new HashMap<>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);

        return nums;
    }

    static int convertNumber(String romanNum) {
        Map<Character, Integer> nums = getRomanArabicNumsMap();
        int result = 0;
        int prevNum = 0;

        for (int i = romanNum.length()-1; i >= 0; i--) {
            int currentNum = nums.get(romanNum.charAt(i));
            if (currentNum < prevNum) {
                result -= currentNum;
            }
            else {
                result += currentNum;
            }
            prevNum = currentNum;
        }
        return result;
    }

    static String convertArabicToRoman(int number) {
        Map<Character, Integer> nums = getRomanArabicNumsMap();
        String result = "";
        int[] numbers = new int[String.valueOf(number).length()];

        for (int i = 0; i < String.valueOf(number).length(); i++) {
            numbers[i] = number / 10;
        }
        System.out.println(numbers);

        

        return result;
    }
}
