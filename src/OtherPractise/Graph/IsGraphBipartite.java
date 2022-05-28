package OtherPractise.Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
* https://leetcode.com/problems/is-graph-bipartite/
* 785. Is Graph Bipartite?
* */
public class IsGraphBipartite {

    public static void main(String[] args) {
        int[][] graph = {
                {1,2,3},
                {0,2},
                {0,1,3},
                {0,2}};
        System.out.println(isBipartite(graph));
    }

    static public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            if(color[i] == 0){
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 1;

                while (!queue.isEmpty()){
                    int current = queue.poll();

                    for(int neighbour : graph[current]){
                        if(color[neighbour] == 0){
                            color[neighbour] = -color[current];
                            queue.offer(neighbour);
                        }else if(color[neighbour] != -color[current]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
