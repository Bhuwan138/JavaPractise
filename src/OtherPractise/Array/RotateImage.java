package OtherPractise.Array;

import java.util.Arrays;

/*
* https://leetcode.com/problems/rotate-image/
* 48. Rotate Image
* */
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            int col = matrix[i].length;
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    static public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix,n);
        reverse(matrix,n);
    }

    private static void reverse(int[][] matrix, int n) {
        for(int i=0;i<n;i++){
            int low=0,high=matrix[i].length-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
    private static void reverseCol(int[][] matrix, int n) {
        int low=0, high = matrix.length-1;
        while (low< high){
            for (int i = 0; i < matrix[i].length-1; i++) {
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;
                low++;
                high--;
            }
        }
    }

    private static void transpose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

    }
}
