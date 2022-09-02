package HomeWork4;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10, 14};
        int n = 7;
        int arr1 = missingElement(arr, n);
        System.out.println(arr1);
    }

    public static int missingElement(int [] arr, int n){

        if (n == 0) {
            return arr[0] - 1;
        }
        if (n > arr.length || n < arr.length+1) {
            return arr[0] + n + arr.length - 1;
        }
        if (n > arr.length+1) {
            throw new IllegalArgumentException();
        }

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            for (int j = 1; j < difference; j++) {
                if (count == n) {
                    return arr[0] + count + i;
                }
                count++;
            }
            System.out.println(count);
        }
        return 0;
    }

}
