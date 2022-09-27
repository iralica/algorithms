package HomeWork4;

//Дан отсортированный по возрастанию массив, все элементы этого массива уникальные.
//Дано целое число n , написать метод, который вернет n-й отсутствующий элемент в массиве.
//Например дан массив: [4,7,9,10,14]
//n = 1, вернуть первый отсутствующий элемент : ответ 5.
//n = 2, вернуть второй отсутствующий элемент : ответ 6
//n = 3, вернуть третий отсутствующий элемент : ответ 8

public class newMissingElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10, 14};
        int n = 8;
        int arr1 = missingElement(arr, n);
        System.out.println(arr1);
    }

    public static int missingElement(int[] arr, int n) {


        return n;
    }

    public static int binarySearchMissingElement(int n, int[] arr) {

        return n;
    }
}
