package dc;

public class AppBinarySearchSqrt {
    public static void main(String[] args) {
        int number = 16;
        int number1 = 1;
        int number2 = 3;
        AppBinarySearchSqrt appBinarySearchSqrt = new AppBinarySearchSqrt();
        System.out.println("Is square ?" + appBinarySearchSqrt.isSquare(number));
        System.out.println("Is square ?" + appBinarySearchSqrt.isSquare(number1));
        System.out.println("Is square ?" + appBinarySearchSqrt.isSquare(number2));
    }
    private boolean isSquare(int number){
        int left = 1;
        int right = 16;
        int mid = 0;
        while (left<right){
            mid = left + (right - left) / 2;
            if (mid * mid == number) {
                return true;
            }
            if (mid * mid > number){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
