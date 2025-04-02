package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class FloodFillMatrix {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image.length == 0 || image[0].length == 0){
            return image;
        }
        if(color == image[sr][sc]){
            return image;
        }
        int rowLength = image.length;
        int colLength = image[0].length;
        int landNum = image[sr][sc];

        bfs(image, sr, sc, landNum, color, rowLength, colLength);
        return image;
    }

    private void bfs(int[][] image, int sr, int sc, int landNum, int color, int rowLength, int colLength){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});
        image[sr][sc] = color;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            for(int[] direction:directions){
                int nr = curr[0] + direction[0];
                int nc = curr[1] + direction[1];
                if(nr>=0 && nr<rowLength && nc>=0 && nc<colLength && image[nr][nc] == landNum){
                    image[nr][nc] = color;
                    queue.add(new int[]{nr,nc});
                }
            }
        }
    }

    public  static void main(String[] args){
        FloodFillMatrix f = new FloodFillMatrix();
        int[][] image = {{1,1,0},{0,1,0},{0,0,1}};
        int[][] res = f.floodFill(image, 1,1,0);

        for(int[] i: res){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}