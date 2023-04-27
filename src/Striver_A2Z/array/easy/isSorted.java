package Striver_A2Z.array.easy;

public class isSorted {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        boolean result = check(nums);
        System.out.println(result);
    }


    static public boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
