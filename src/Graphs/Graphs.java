package Graphs;

import java.util.List;
import java.util.ArrayList;

public class Graphs {
    static List<List<Integer>> adjacentList;
    static int size;

    Graphs(int adjSize){
        size = adjSize;
        adjacentList = new ArrayList<>(size);

        for(int i=0; i<size; i++){
            adjacentList.add(new ArrayList<Integer>());
        }
    }

    public static int size(){
        return size;
    }

    public static void addEdges(int start, int end, boolean directed){
        adjacentList.get(start).add(end);
        if(!directed){
            adjacentList.get(end).add(start);
        }
    }

    public static void printNeighbours(int vertex){
          for(int i : adjacentList.get(vertex)){
              System.out.print(i + " ");
        }
    }

    public static void createAdjacentList(int size){
        Graphs g = new Graphs(size);
      /*  addEdges(0, 2, true);
        addEdges(0, 3, true);
        addEdges(0, 1, true);
        addEdges(1, 0, true);
        addEdges(2, 0, true);
        addEdges(2, 4, true);
        addEdges(2, 3, true);
        addEdges(3, 0, true);
        addEdges(4, 2, true); */


        // Input for VAlid Tree

       /* addEdges(0, 1, true);
        addEdges(0, 2, true);
        addEdges(1, 3, true);
        addEdges(2, 4, true);*/

        //Star Tree

    /*    addEdges(0, 1, true);
        addEdges(0, 2, true);
        addEdges(0, 3, true);
        addEdges(0, 4, true);*/

    }
}
