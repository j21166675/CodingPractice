package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class MaxAreaIsland {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int rowLength = grid.length;
        int colLength = grid[0].length;

        int maxOfIsland = 0;

        for(int row=0;row<rowLength;row++){
            for (int col=0;col<colLength;col++){
                if(grid[row][col] == 1){
                    maxOfIsland = Math.max(maxOfIsland, bfs(grid, row, col, rowLength, colLength));
                }
            }
        }
        return maxOfIsland;
    }

    private int bfs(int[][] grid, int row, int col, int rowLength, int colLength){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        grid[row][col] = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int count = 1;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            for(int[] direction : directions){
                int nr = curr[0] + direction[0];
                int nc = curr[1] + direction[1];

                if(nr>=0 && nr<rowLength && nc>=0 && nc<colLength && grid[nr][nc] == 1){
                    count++;
                    queue.add(new int[]{nr, nc});
                    grid[nr][nc] = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] a){
        MaxAreaIsland m = new MaxAreaIsland();
        int[][] grid = {{1,1,0},{0,1,0},{0,0,1}};
        System.out.println(m.maxAreaOfIsland(grid));
    }
}
