package HomeWork4;

public class MergeStringEl1 {
    public static void main(String[] args) {
        String one = "abcde";
        String two = "dgk";

        System.out.println(new MergeStringEl1().mergeString(one, two));
    }

    private String mergeString(String one, String two) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < result.length(); i++) {
            if (i < one.length() && i < two.length()) {
                char charOne = one.charAt(i);
                char charTwo = two.charAt(i);
                result.append(charOne).append(charTwo);
            }
            else {
                if (i < one.length()) {
                    result.append(one.charAt(i));
                }
                if (i < two.length()) {
                    result.append(two.charAt(i));
                }
            }
        }
        return result.toString();
    }
}
