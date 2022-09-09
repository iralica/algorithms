package Lesson5;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {0,56,22,78,9,3,5,-1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int [] arr, int start, int end) {
    /*if (arr.length == 0){
        return;
    }
    if (start >= end){
        return;
    }*/
        if (start < end) {
            int indexPivot = getIndexPivot(arr, start, end);

            quickSort(arr, start, indexPivot - 1);
            quickSort(arr, indexPivot + 1, end);
        }
    }
    private static int getIndexPivot(int [] arr, int start, int end){
        int pivot = arr[end];
        int indexPivot = start;
        for (int i = start; i < end; i++) {
          if(arr[i] <= pivot){
              swap(arr, indexPivot, i);
              //int temp = arr[indexPivot];
             // arr[indexPivot] = arr[i];
             // arr[i] = temp;
             indexPivot++;
          }
        }
        swap(arr, indexPivot, end);
        //int temp = arr[indexPivot];
        //arr[indexPivot] = arr[end];
        //arr[end] = temp;
        return indexPivot;
    }
   private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
