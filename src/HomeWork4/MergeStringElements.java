package HomeWork4;

import java.util.Arrays;

public class MergeStringElements {
    public static void main(String[] args) {
        String one = "abcde";
        String two = "dgk";

        System.out.println(mergeString(one, two));
    }

    private static String mergeString(String one, String two) {
        StringBuilder result = new StringBuilder();
        int indexOne = 0;
        int indexTwo = 1;

        for (int i = 0; i < result.length(); i++) {
            if (indexOne < one.length() && indexTwo < two.length()) {

                if (indexOne % 2 ==0) {
                    result.append(indexOne);
                    indexOne++;
                } else if (indexTwo % 2 !=0) {
                    result.append(indexTwo);
                    indexTwo++;
                }
                else continue;
            }
            if (indexOne < one.length()) {
                result.append(indexOne);
                indexOne++;
            }
            if (indexTwo < two.length()) {
                result.append(indexTwo);
                indexTwo++;
            }
        }
        return result.toString();
    }
}
