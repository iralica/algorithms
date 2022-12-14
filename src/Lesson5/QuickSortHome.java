package Lesson5;

import java.util.Arrays;
import java.util.Random;

//First level: Сделать возможным выбирать различные опорные элементы для быстрой сортировки.
//Исправить для этого код урока.
//Second level: Привести пример худшего случая , в каком виде должны быть входные данные.

public class QuickSortHome {
    public static void main(String[] args) {
        int [] arr = {0,56,22,78,9,3,5,-1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        int [] arr1 = {-1, 0,3,5, 9, 22, 56, 78}; // при выборе последнего элемента как опорный
        int [] arr2 = {78, 65, 52, 43, 35, 22, 11, 2, -2}; // при выборе последнего элемента как опорный
        int [] arr3 = {2, 2, 2, 2, 2, 2, 2}; // все элементы массива одинаковы, он должен всех перепроверить
        quickSort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }
    private static void quickSort(int [] arr, int start, int end) {
        if (start < end) {
            int indexPivot = getIndexPivot(arr, start, end);
            quickSort(arr, start, indexPivot - 1);
            quickSort(arr, indexPivot + 1, end);
        }
    }
    private static int getIndexPivot(int [] arr, int start, int end) {
        int mid = start + (end - start);
        int pivot = arr[mid];
        int indexPivot = mid;
        while (start < end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
                if (end == indexPivot) {
                    indexPivot = start;
                } else if (start == indexPivot) {
                    indexPivot = end;
                }
            start++;
            end++;
        }
    }
        if (start < indexPivot && arr[start] > arr[indexPivot]) {
            swap(arr, indexPivot, start);
            indexPivot = start;
        } else if (end > indexPivot && arr[end] < arr[indexPivot]) {
            swap(arr, indexPivot, end);
            indexPivot = end;
        }
        return indexPivot;
    }

   private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
