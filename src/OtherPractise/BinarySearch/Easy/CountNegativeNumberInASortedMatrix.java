package OtherPractise.BinarySearch.Easy;

/*
* https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
* 1351. Count Negative Numbers in a Sorted Matrix
* */
public class CountNegativeNumberInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    static public int countNegatives(int[][] grid) {
        int length = grid.length;
        int count = 0;

        //for all rows
        for (int i = 0; i < length; i++) {
            int low = 0, high = grid[i].length-1;
            //finding in every row
            while (low <= high){
                int mid = low + (high-low)/2;
                if(grid[i][mid] < 0) {
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            //increament count value  for each row
            count += grid[i].length-low;
        }
        return count;
    }
}
