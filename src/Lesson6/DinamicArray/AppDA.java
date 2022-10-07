package Lesson6.DinamicArray;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;

public class AppDA {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(3);
        da.add(10);
        da.add(100);
        da.add(152);
        System.out.println(Arrays.asList(da));
        da.remove();
        da.remove();
        System.out.println("After remove all" + da);
    }
}
