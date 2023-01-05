package OtherPractise.math;

public class reverseInteger {
    public static void main(String[] args) {
        int x = 120;
        System.out.println(reverse(x));
    }

    static public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (result > Integer.MAX_VALUE) return 0;
        return (int) (isNegative ? -result : result);
    }
}
