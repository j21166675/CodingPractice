package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfIslands {

    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int islandCount = 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;
        for(int row=0;row<rowLength;row++){
            for(int col=0;col<colLength;col++){
                if(grid[row][col] == '1'){
                    islandCount++;
                    bfs(rowLength, colLength, grid, row, col);
                }
            }
        }
        return islandCount;
    }
    private void bfs(int rowLength, int colLength, char[][] grid, int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        grid[row][col] = '0';
        int[][] directions ={{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            for(int[] direction : directions){
                int nr = direction[0] + curr[0];
                int nc = direction[1] + curr[1];

                if(nr>=0 && nr<rowLength && nc>=0 && nc<colLength && grid[nr][nc] == '1'){
                    queue.add(new int[]{nr,nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }

    public static void main(String[] args){
        NumOfIslands obj = new NumOfIslands();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        char[][] grid = {
                {'0', '0', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'},
                {'0', '1', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '1', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '0'},
                {'0', '1', '0', '0', '1', '1', '0', '0', '1', '1', '1', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0'}
        };


        char[][] grid3 = {};
        System.out.println(obj.numIslands(grid));
    }

    }
