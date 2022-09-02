package sort;

public class StringSelectionSort {
    public static void main(String[] args) {
        String[] array = {"Lit", "Ann", "Go", "Soo", "Done", "Pool", "Bubble", "Moon", "Keep", "Woody", "Tool"};

        for (int j = 0; j < array.length - 1; j++) {

            int min = j;
            for (int i = j + 1; i < array.length; i++)
                if (array[i].compareTo(array[min]) < 0)
                    min = i;

            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        System.out.println("List of students, group N2363:");
        for (int i = 0; i < array.length; i++)
            System.out.println((i + 1) + " " + array[i]);
    }
}
