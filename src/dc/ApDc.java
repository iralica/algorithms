package dc;

public class ApDc {
    public static void main(String[] args) {
        int [] arr = new int[] {25, 20, 15, 15, 7, 36}; //118
        ApDc apDc = new ApDc();
        int maxElement = apDc.maxArray(arr, 0, arr.length-1);
        System.out.println("max element = " + maxElement);
    }

    private int maxArray(int [] array, int index, int end){
        if ((index == end-1)){
            return array[index];
        }

        int mid = (end + index) / 2; //
        int maxLeft = maxArray(array, index, mid);
        int maxRight = maxArray(array, mid, end);

        return Math.max(array[index], Math.max(maxLeft, maxRight));
    }

}
