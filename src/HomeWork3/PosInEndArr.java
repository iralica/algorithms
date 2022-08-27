package HomeWork3;

//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//который будет находиться на k-й позиции в конечном отсортированном массиве. к = 7 Вывод : 256

public class PosInEndArr {

    public static void main(String[] args) {
        PosInEndArr posInEndArr = new PosInEndArr();
        int [] m = {100, 112, 256, 349, 770};
        int [] n = {72, 86, 113, 119, 265, 445, 892};
        long element = posInEndArr.kthElement(m, n, m.length, n.length, 7);
        System.out.println(element);
    }
    static long  maxN = (long)1e10;
    private int upperBound(int[] a, int low, int high, long element){  // ищет если к это не середина
        while(low < high){
            int middle = low + (high - low)/2;
            if(a[middle] > element)
                high = middle;
            else
                low = middle + 1;
        }
        return low;
    }
    private long  kthElement(int arr1[], int arr2[], int n, int m, int k) {
        long  left = 1, right = maxN;
        long  ans = (long)1e15;

        while (left <= right) {
            long  mid = (left + right) / 2;
            long  up_cnt = upperBound(arr1,0, n, mid);
            up_cnt += upperBound(arr2, 0, m, mid);

            if (up_cnt >= k) {
                ans = Math.min(ans, mid);
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return ans;
    }
}
