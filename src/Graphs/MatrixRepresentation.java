package Graphs;

public class MatrixRepresentation {
    static int[][]adjacencyMatrix;
    int size;
    MatrixRepresentation(int size){
        adjacencyMatrix = new int[size][size];
        this.size = size;
    }

    static void addEdges(int start, int end, boolean directed){
        adjacencyMatrix[start][end] = 1;
        if(directed){
            adjacencyMatrix[end][start] = 1;
        }
    }

    static void printMatrix(int start){
        {
            for(int j: adjacencyMatrix[start]){
                System.out.print(j + " ");
            }
        }
    }
}
