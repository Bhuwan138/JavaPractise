package OtherPractise.Graph;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class PrimAlgorith_MinCosttoConnectAllPoints {
    public static void main(String[] args) {
        int[][] points = {{3,12},{-2,5},{-4,1}};
        System.out.println(minCostConnectPoints(points));
    }

    static public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        int cost = 0;

        priorityQueue.offer(new int[] {0,0,0});
        Set<Integer> visited = new HashSet<>();

        int num = points.length;
        while (!priorityQueue.isEmpty() && visited.size() < num) {
            int[] current = priorityQueue.poll();
            int end = current[1];
            int currentCost = current[2];

            if(visited.contains(current[1])) continue;

            cost += currentCost;
            visited.add(end);
            for (int i = 0; i < num; i++) {
                if(!visited.contains(i)){
                    priorityQueue.offer(new int[] {end,i,distance(points,end,i)});
                }
            }
        }
        return cost;
    }

    private static int distance(int[][] points, int i, int j) {
        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}
