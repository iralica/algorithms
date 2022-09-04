package Lesson5;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {34,56,22,78,9,3,5,15};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int [] arr, int start, int end){
    if (arr.length == 0){
        return;
    }
    if (start >= end){
        return;
    }
    int indexPivot = getIndexPivot(arr, start, end);

    quickSort(arr, start,indexPivot - 1);
    quickSort(arr, indexPivot +1, end);
    }

    private static int getIndexPivot(int [] arr, int start, int end){
        int pivot = arr[end];
        for (int i = start; i < end; i++) {

        }
    }
}
