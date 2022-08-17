package recurs;

public class RecMaxIndex {
    public static void main(String[] args) {
        int[] ar = new int[]{2, 4, 8, 10, 12};

        System.out.println("Max element is: " + arMax(ar, ar.length));

    }

    public static int arMax(int[] ar, int i) {
        if (i == 1)
            return ar[0];
        return Math.max(ar[i-1], arMax(ar,i-1));
    }
}
