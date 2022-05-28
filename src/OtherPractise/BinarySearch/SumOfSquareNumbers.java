package OtherPractise.BinarySearch;

import java.util.HashSet;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int c = 6;
        System.out.println(judgeSquareSum(c));
    }

    static public boolean judgeSquareSum(int c) {
        HashSet nums = new HashSet();
        for (int i = 0; i <= Math.sqrt(c); i++) {
            nums.add(i*i);
            if(nums.contains(c-i*i)) return true;
        }
        return false;
    }
}
