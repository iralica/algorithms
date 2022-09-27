package Lesson7DP;
// бескочечная числовая последовательность , в которой каждое число есть сумма двух предыдущих: . F n = F n − 1 + F n − 2 .
// Первые два элемента последовательности, нужные для затравки — ноль и единица: F 0 = 0 , F 1 = 1
public class Fib {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Rec" + rec(n));
        int [] arr = new int[n+1];
        for (int i = 2; i <= n; i++) {
          arr [i] = -1;
        }
        System.out.println("Mem" + fibinaciDPMemo(n, arr));

        System.out.println("Tab" + fibanaciTab(5));


    }

    private static int rec(int n) {
        if (n < 2) {
            return n;
        }
        return rec(n - 1) + rec(n - 2);
    }

    private static int fibinaciDPMemo(int n, int [] arr){
     if (n > 2){
         return n;
     }
     if (arr[n] != -1){
         return arr[n];
        }
     arr[n] = fibinaciDPMemo(n-1, arr) + fibinaciDPMemo(n-2, arr);
            return arr[n];
     }

     private static int fibanaciTab (int n){
        int arr[] = new int [n+1];
        arr [0] = 0;
        arr [1] = 1;
         for (int i = 2; i <= n; i++) {
             arr[i] = arr[i-1]  + arr[i-2];
             if (i == n) {
                 return arr[i];
             }
         }
        return -1;
     }
}

