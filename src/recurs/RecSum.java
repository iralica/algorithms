package recurs;

//Дан массив, вычислить рекурсивно сумму всех элементов этого массива.
// Итоговую сумму вывести в консоль.

public class RecSum {
    public static void main(String[] args) {
        int[] ar = new int[]{2, 4, 8, 10, 12};
        int[] ar1 = new int[]{12};

        System.out.println("Sum Of Array is: " + sumAr(ar, 0, ar.length));
        System.out.println("Sum Of Array is: " + sumAr(ar1, 0, ar1.length));
    }

    private static int sumAr(int[] ar, int firstIndex, int lastIndex) {

        if (firstIndex == lastIndex - 1) {
            return ar[firstIndex];
        } else {
            int middle = (firstIndex + lastIndex) / 2;
            return sumAr(ar, firstIndex, middle) + sumAr(ar, middle, lastIndex);
        }
    }
}
