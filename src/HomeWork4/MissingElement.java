package HomeWork4;

//Дан отсортированный по возрастанию массив, все элементы этого массива уникальные.
//Дано целое число n , написать метод, который вернет n-й отсутствующий элемент в массиве.
//Например дан массив: [4,7,9,10,14]
//n = 1, вернуть первый отсутствующий элемент : ответ 5.
//n = 2, вернуть второй отсутствующий элемент : ответ 6
//n = 3, вернуть третий отсутствующий элемент : ответ 8

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10, 14};
        int n = 7;
        int arr1 = missingElement(arr, n);
        System.out.println(arr1);
    }

    public static int missingElement(int [] arr, int n){

        if (n == 0) {
            return arr[0] - 1;
        }
        if (n > arr.length || n < arr.length+1) {
            return arr[0] + n + arr.length - 1;
        }
        if (n > arr.length+1) {
            throw new IllegalArgumentException();
        }

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            for (int j = 1; j < difference; j++) {
                if (count == n) {
                    return arr[0] + count + i;
                }
                count++;
            }
            System.out.println(count);
        }
        return 0;
    }

}
