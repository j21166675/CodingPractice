package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFSImplementation {
    List<List<Integer>> adjList;
    boolean[] visited;

    public void dfs(int vertex){
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);
        visited[vertex] = true;

        while(!stack.isEmpty()){
             int curr = stack.pop();
             System.out.println(curr + " ");
             for(int neighbor : adjList.get(curr)){
                 if(!visited[neighbor]){
                     stack.push(neighbor);
                     visited[neighbor] = true;
                 }
             }
        }
    }

    public static void main(String[] args){
        DFSImplementation obj = new DFSImplementation();
        Graphs.createAdjacentList(5);
        obj.adjList = Graphs.adjacentList;
        obj.visited = new boolean[Graphs.size()];
        obj.dfs(0);
    }
}
