package Graphs;
import java.util.List;

public class DFSRecurrsiveImplementation {
    List<List<Integer>> adjList;
    boolean[] visited;
    DFSRecurrsiveImplementation(int size){
        visited = new boolean[size];
    }

    public static void main(String[] a){
        DFSRecurrsiveImplementation obj = new DFSRecurrsiveImplementation(5);
        Graphs.createAdjacentList(5);
        obj.adjList = Graphs.adjacentList;
        obj.dfs(0);
    }
    public void dfs(int vertex){
        System.out.println(vertex);
        visited[vertex] = true;
        for(int neigbor :adjList.get(vertex)) {
            if (!visited[neigbor]) {
               dfs(neigbor);
            }
        }
    }
}
