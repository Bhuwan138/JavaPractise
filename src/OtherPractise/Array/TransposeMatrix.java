package OtherPractise.Array;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][]ans = s.transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
class Solution1 {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}
