package HomeWork3;

//Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
//Ожидаемая временная сложность O(log n) x = 2 Вывод: 4 раза

public class NumbOfOccur {
    public static void main(String[] args) {
        NumbOfOccur numbOfOccur = new NumbOfOccur();
        int [] l = {1, 1, 2, 2, 2, 2, 3,};
        int count = numbOfOccur.count(l, 2, l.length);
        int count1 = numbOfOccur.count(l, 1, l.length);
        System.out.println("The number of occurrences of x =" + count);
        System.out.println("The number of occurrences of x =" + count1);
    }
    private int count(int arr[], int x, int n) // если x присут, то возвращает количество вхождений x, иначе -1
    {
        int i; //индекс первого вхождения
        int j; // индекс последнего вхождения
        i = first(arr, 0, n-1, x);
        if(i == -1){
            return i;}
        j = last(arr, i, n-1, x, n);{
         return j-i+1;}
    }

    private int first(int arr[], int left, int right, int x)  // low + (high - low)/2
    {
        if(right >= left)
        {
            int mid = left + (right - left)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
            else if(x > arr[mid])
                return first(arr, (mid + 1), right, x);
            else
                return first(arr, left, (mid -1), x);
        }
        return -1;
    }

    private int last(int arr[], int left, int right, int x, int n) // low + (high - low)/2
    {
        if(right >= left)
        {
            int mid = left + (right - left)/2;
            if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
                return mid;
            else if(x < arr[mid])
                return last(arr, left, (mid -1), x, n);
            else
                return last(arr, (mid + 1), right, x, n);
        }
        return -1;
    }
}
