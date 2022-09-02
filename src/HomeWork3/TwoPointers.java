package HomeWork3;
// есть два метода: со слиянием масива и подсчетом индексов
import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arrOne = {100, 112, 256, 349, 770};            //  100  //100  //100 // 112
        int[] arrTwo = {72, 86, 113, 119, 265, 445, 892};    //  72   //86   //113 // 113
        System.out.println(Arrays.toString(mergeArray(arrOne, arrTwo)));
        int k = 7;
        int [] merge = mergeArray(arrOne, arrTwo); // применяем метод слиянием
        System.out.println(Arrays.toString(merge));
        int kPositionElement = getKPositionElement(mergeArray(arrOne, arrTwo), k);
        System.out.println("Element on k position = " + kPositionElement);
        System.out.println(merge[k-1]); // берем из соединенного массива элемент по индексу
    }

    // слияние массивов, сложность алгоритма O(n)
    private static int[] mergeArray(int[] one, int[] two) {
        int[] result = new int[one.length + two.length];
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {  // проверяем на случай когда один из массиво закончится
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    result[i] = elementOne;
                    indexOne++;
                } else {
                    result[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            // когда мы дошли до конца какого-то массива
            // определяем какой из них закончился
            if (indexOne < one.length) {
                result[i] = one[indexOne];
                indexOne++;
            }
            if (indexTwo < two.length) {
                result[i] = two[indexTwo];
                indexTwo++;
            }
        }
        return result;
    }
    // подсчет индекса,
    private static int mergeArray(int[] one, int[] two, int k) { // возвращает число
        int length = one.length + two.length;
        int indexOne = 0;
        int indexTwo = 0;
        int curr = one[0]; // присваиваем текущий элемент
        int count = 0; // место индекса

        for (int i = 0; i < length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    indexOne++;
                    curr = elementOne;
                } else {
                    indexTwo++;
                    curr = elementTwo;
                }
                count++;
                if (count == k) {
                    return curr;
                }
                continue;
            }
            if (indexOne < one.length && indexTwo >= two.length) { // проверка счетчика
                curr = one[indexOne];
                count++;
                indexOne++;
            }
            if (indexOne >= one.length && indexTwo < two.length) { //
                curr = two[indexTwo];
                indexTwo++;
            }
            count++;                 //
            if (count == k) {
                return curr;
            }
        }
        throw new IllegalArgumentException(); // не нашли ничего
    }
    private static int getKPositionElement(int[] array, int k) {
        return array[k - 1];
    }
}
