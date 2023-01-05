package OtherPractise.Hashing;

import java.util.HashMap;

public class ExceptionallyOdd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        int n = arr.length;
        System.out.println(solution.getOddOccurrence(arr,n));
    }
}
class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

