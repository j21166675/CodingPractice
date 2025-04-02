package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindingConnectedVertexes{
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> adjList;

    public int countComponents(int n, int[][] edges) {
        createAdjList(n, edges);
        return helper(n);
    }

    public void createAdjList(int n, int[][] edges){
        visited = new boolean[n];
        adjList = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int i=0;i<edges.length;i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
    }

    public int helper(int n){
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(i);
            }
        }
        return count;
    }

    public void bfs(int vertex){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int neighbor: adjList.get(curr)){
                if(!visited[neighbor]){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
