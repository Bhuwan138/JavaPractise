package OtherPractise.Graph;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    public static void main(String[] args) {
        int [][] heights = {{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(minimumEffortPath(heights));
    }

    static public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        if(n == 1 && m == 1) return 0;

        int[][] efforts = new int[n][m];
        for(int[] row : efforts){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>((a,b) -> (a[2]-b[2]));
        priorityQueue.offer(new int[]{0,0,0});

        int[][] direction = { {0,1}, {0,-1} , {1,0} , {-1,0}};

        while (!priorityQueue.isEmpty()){
            int[] current = priorityQueue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            int currentWT = current[2];

            for(int[] num : direction){
                int newRow = currentRow + num[0];
                int newCol = currentCol + num[1];

                if(newRow<0 || newRow>=n || newCol<0 || newCol >= m) continue;

                int wt = Math.max(currentWT , Math.abs(heights[newRow][newCol] - heights[currentRow][currentCol]));

                if(wt < efforts[newRow][newCol]){
                    efforts[newRow][newCol] = wt;
                    priorityQueue.offer(new int[]{newRow,newCol,wt});
                }
            }
        }

        return efforts[n-1][m-1];

    }
}
