package homeworks.homework3;

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int[] temp;
        int[] currentSrc = a;
        int[] currentDest = new int[a.length];
        int size = 1;
        while (size < a.length) {
            for (int i = 0; i < a.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i , size); 
            }
            temp = currentSrc;
            currentSrc = currentDest;
            currentDest = temp;

            size *= 2;
            
            // System.out.println(arrayToString(currentSrc));
        }

    
        return currentSrc;
    }
    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {
        int index1 = src1Start,
            index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length),
            src2End = Math.min(src2Start + size, src2.length);
        
        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            }
            else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class ex1 { 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}