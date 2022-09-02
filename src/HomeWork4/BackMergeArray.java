package HomeWork4;

import java.util.Arrays;

public class BackMergeArray {
    public static void main(String[] args) {
        int[] arrOne = {100, 112, 256, 349, 770};
        int[] arrTwo = {72, 86, 113, 119, 265, 445, 892};
        int [] merge = mergeArray(arrOne, arrTwo); // применяем метод слиянием
        System.out.println(Arrays.toString(merge));
    }
    private static int[] mergeArray(int[] one, int[] two) {
        int[] result = new int[one.length + two.length];
        int indexOne = one.length - 1;
        int indexTwo = two.length - 1;

        for (int i = 0; i < result.length; i++) {
            if (indexOne >= 0  && indexTwo >=  0) {  // проверяем на случай когда один из массиво закончится
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne > elementTwo) {
                    result[i] = elementOne;
                    indexOne--;
                } else {
                    result[i] = elementTwo;
                    indexTwo--;
                }
                continue;
            }
            // когда мы дошли до конца какого-то массива
            // определяем какой из них закончился
            if (indexOne > one.length) {
                result[i] = one[indexOne];
                indexOne--;
            }
            if (indexTwo > two.length) {
                result[i] = two[indexTwo];
                indexTwo--;
            }
        }
        return result;
    }
}
