package homeworks.homework3;

// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
// Integer[] arr - массив целых чисел.

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class ex3 { 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}

class Answer {
  public static void analyzeNumbers(Integer[] arr) {
      ArrayList<Integer> nums = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
          nums.add(arr[i]);
      }
      Collections.sort(nums);
      System.out.println(nums);
      System.out.printf("Minimum is %d\n", nums.get(0));
      System.out.printf("Maximum is %d\n", nums.get(nums.size() - 1));
      
      double sum = 0;
      for (Integer item : nums) {
          sum += item;
      }
      System.out.printf("Average is = %.1f\n", sum/nums.size());
  }
}