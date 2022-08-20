package recurs;

//Дан массив, вычислить рекурсивно сумму всех элементов этого массива.
// Итоговую сумму вывести в консоль.

public class RecSum {
    public static void main(String[] args) {

        int[] ar = new int[]{2, 4, 8, 10, 12, 30};
        int[] ar1 = new int[]{12};

        RecSum recsum = new RecSum();
        int sumAr = recsum.sumAr(ar, ar.length);
        int sumAr1 = recsum.sumAr(ar1, ar1.length);
        System.out.println("Sum Of Array is: " + sumAr);
        System.out.println("Sum Of Array is: " + sumAr1);
        System.out.println(ar.length);
    }

    private int sumAr(int[] ar, int index) {
        if(index<=0){
            return 0;
        }
        return (ar[index-1] + sumAr(ar,index-1));
    }
}
