package seminars.seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class exs1 {
    public static void main(String[] args) {
        // ArrayList<Integer> nums = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int size = 10,
            max = 10,
            min = 0;
        getRandomNum(nums, size, max, min);
        
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }

    private static void getRandomNum(List<Integer> nums, int size, int max, int min) {
        Random randomNum = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(randomNum.nextInt(min, max));
        }
    }
}
