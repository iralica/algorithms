package sort;

public class App {
    public static void main(String[] args) {
        int [] array = new int[]{1,3,5,63,6,8,3,4};
        int target = 4;
        int possion = -1;
        
        //Time = 0(n)
        for (int i = 0; i < array.length; i++) //цикл о массиву
        {if (array[i] == target){ // сравнение, если успех то
            possion = i; // присвоили значение для искомого значения
            break; // прервали цикл
        }

            
        }
    }
}
