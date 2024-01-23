package homeworks.homework5;

// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:
// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
// Сначала выводить исходный массив на экран.
// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
// Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

import java.util.Arrays;

class HeapSort {
    static void heapSort(int nums[], int size) {
		buildheap(nums);
		for (int i = size - 1; i >= 0; i--) {
			exchange(nums, i, 0);
			heap(nums, i, 0);
		}
	}
	static void exchange(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	static void heap(int[] nums, int size, int i) {
		int left = ((2 * i) + 1);  
		int right = ((2 * i) + 2);
		int max = i;
		if ((left < size) && (nums[left] > nums[i])) {
			max = left;
		}
		
		if ((right < size) && (nums[right] > nums[max])) {
			max = right;
		}
		if (max != i) {
			exchange(nums, i, max);
			heap(nums, size, max);
		}
	}
	static void buildheap(int[] nums) {
		for (int i = (nums.length / 2) - 1; i >= 0; i--) {
			heap(nums, (nums.length - 1), i);
		}
	}
}

// Не удаляйте и не меняйте метод Main! 
public class ex3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[] {17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}