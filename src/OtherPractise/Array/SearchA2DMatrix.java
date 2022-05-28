package OtherPractise.Array;
/*
* https://leetcode.com/problems/search-a-2d-matrix/
* 74. Search a 2D Matrix
* */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][]matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;

        System.out.println(searchMatrix(matrix,target));
    }
    static  public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) return false;

        int n = matrix[0].length;
        int row = 0;
        int column = n-1;

        while(row < m && column >= 0){
                if(matrix[row][column] == target) return true;
                else if(matrix[row][column] < target) row++;
                else column--;
        }
        return false;
    }
}
