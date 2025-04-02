package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSImplementation {
    List<List<Integer>> adjacentList;
    BFSImplementation(){
        adjacentList = Graphs.adjacentList;
    }
    public void bfs(int vertex){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);

        int size = adjacentList.size();
        boolean[] visited = new boolean[size];
        visited[vertex] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();
           for(int neighbor: adjacentList.get(curr)){
               if(!visited[neighbor]){
                   queue.add(neighbor);
                   visited[neighbor] = true;
               }
           }
           System.out.println(curr);
        }
    }

    public static void main(String[] a){
        Graphs.createAdjacentList(5);
        //Graphs.printNeighbours(2);
        BFSImplementation obj = new BFSImplementation();
        obj.bfs(0);

    }
}
