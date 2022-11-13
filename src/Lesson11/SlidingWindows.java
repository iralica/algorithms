package Lesson11;
// все что касается подмасивов,
public class SlidingWindows {
    public static void main(String[] args) {
        int [] arr = {2, 1, 5, 1, 3, 2};
        int n = 3;
        // 2, 1, 5=8       1, 5, 1=7    5, 1 ,3=9    1, 3 ,2=6
        // 1. (непрерывные подмасивы) найти максимальную суму элементов подмасива
        SlidingWindows slidingWindowsn= new SlidingWindows();
        int sum = slidingWindowsn.maxSummSubarray(arr, 3);
        System.out.println("Max summ is " + sum);

        int [] arr1 = {2,1, 2, 5, 1, 3, 2};
        int target = 7;
        int minLenght = slidingWindowsn.minSubarraySum(arr1, target);
        System.out.println("Min " + minLenght);
    }

    private int minSubarraySum(int [] arr, int target){
        int sum = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= target){
                len = Math.min(len, i-start+1);
                sum -= arr[start];
                start++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
    private int maxSummSubarray(int [] arr, int n){
        if (n > arr.length){
            n = arr.length;
        }
        int sum =0;                             // сумма n количества элементов
        int maxSum =0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];                      // к сумме добавляем значение по следующему индексу
            if (i >= n-1){                      // пока он меньше 3
                maxSum = Math.max(maxSum, sum);
                sum-= arr[start++];
                //start++;
            }
        }
        return maxSum;
    }
}
