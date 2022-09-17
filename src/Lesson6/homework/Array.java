package Lesson6.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        int n = 1000000;

    }

    private static void addBigNumber(List<Integer> integerList, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            integerList.add(rand.nextInt());
        }
    }

    private static int getElement(List<Integer> integerList, int n) {
        Random rand = new Random();
        return integerList.get(rand.nextInt(n));
    }
}
