package homeworks.homework3;


// Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива.
// Необходимо удалить из списка четные числа и вернуть результирующий.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает
// на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            nums.add(arr[i]);
        }
        

        for (int i = nums.size()-1; i >= 0; i--) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }

       return nums;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class ex2 { 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.removeEvenNumbers(arr));

    }
}