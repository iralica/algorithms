import java.util.Arrays;

public class StringBubbleSort {
    public static void main(String[] args) {
        String [] array = {"Lita", "Ann", "Go", "Soo", "Done", "Pool", "Bubble", "Moon", "Keep", "Woody", "Tool"};

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if ((array[i+1].compareTo(array[i])) < 0) {
                    String temp = array[i];
                    array[i] = array[i+1];
                    array [i+1] = temp;
                }
            }
        }
        System.out.println("List of students, group N2363:");
        for (int i = 0; i < array.length; i++)
            System.out.println((i + 1) + " " + array[i]);
    }
}

