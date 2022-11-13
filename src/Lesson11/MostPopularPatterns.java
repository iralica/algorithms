package Lesson11;

import java.util.Arrays;

// constrain
public class MostPopularPatterns {
    public static void main(String[] args) {
        MostPopularPatterns mostPopularPatterns = new MostPopularPatterns();
        // 1. Reverse String
        String text = "abide";
        mostPopularPatterns.reverseString(text);
        // 2.Return array of squares sorted on non-decreasing order
        int [] arr = {-3, -2, 0, 1, 2};
        mostPopularPatterns.sgrSortArray(arr);
        //3. Remove duplicates from sorted array (in-place)
        int [] arr1 = {2, 3, 3, 3, 5, 8, 9, 9};
        mostPopularPatterns.removeDuplicates(arr1);
        //4. [2, 4, 6, 8, 9]   target 6
        int [] arr2 = {2, 4, 6, 8, 9};
        mostPopularPatterns.findTwoElements(arr2, 10);
    }

    private void findTwoElements(int [] arr, int n){
        if (arr.length == 0){
            return;
        }
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if (start + end == n){
                System.out.println(start + end);
            }
        }
    }

    private void removeDuplicates(int [] arr){
        if (arr.length == 0){
            return;
        }
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]){
                arr[++slow] = arr[fast];
            }
        }
        System.out.println("Count non duplicate elements " + (slow+1));
        System.out.println("Array without duplicates " + Arrays.toString(arr));
    }
    private void sgrSortArray(int [] arr){
        int left = 0;
        int right = arr.length-1;
        int [] sqr = new int[arr.length];
        int idx = sqr.length - 1;
        while (idx >= 0){
            int sqrtL = arr[left]*arr[left]; // очень важно какой диапазон цифр будет входить в массив
            int sqrtR = arr[right]*arr[right]; // long went needs
            if (sqrtR > sqrtL){
                sqr[idx] = sqrtR;
                right--;
            }else {
                sqr[idx] = sqrtL;
                left++;
            }
            idx--;
        }
        System.out.println(Arrays.toString(sqr));
    }
    private void reverseString (String s){
        char [] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left < right){
        char temp = chars[left];
        chars[left++] = chars[right];
        chars[right--] = temp;
    }
        System.out.println(Arrays.toString(chars));
    }

}
