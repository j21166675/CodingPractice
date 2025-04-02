package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphValidTree {
    List<List<Integer>> adjList;
    boolean[] visited;
    int[] parent;

    //BFSImplementation
    public boolean bfs(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        visited[vertex] = true;


        queue.add(vertex);

        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.println(curr);
            for(int neighbor:adjList.get(curr)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    parent[neighbor] = curr;
                    queue.add(neighbor);
                }
                else{
                    if(neighbor != parent[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isTree(int vertex){
        int count = 0;
        adjList = Graphs.adjacentList;
        System.out.println(adjList.size());
        if(adjList.isEmpty()){
            return true;
        }
        int size = adjList.size();
        visited = new boolean[size];
        parent = new int[size];
        for(int i=0;i<adjList.size();i++){
            if(!visited[i]){
                count++;
                //if its not connected
                if(count > 1){
                    return false;
                }
                if(!this.bfs(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Graphs.createAdjacentList(5);
        //Graphs.printNeighbours(2);
        GraphValidTree obj = new GraphValidTree();
        //bfs
        //obj.bfs(0);
        //outer
        System.out.println(obj.isTree(0));

    }
}
