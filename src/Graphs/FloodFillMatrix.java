package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
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

    static ArrayList<ArrayList<Integer>> flood_fill2(Integer pixel_row, Integer pixel_column, Integer new_color, ArrayList<ArrayList<Integer>> image) {
        // Write your code here.
        if(image.isEmpty()){
            return image;
        }
        int pointVal = image.get(pixel_row).get(pixel_column);
       // System.out.println(pointVal);

        if(new_color == pointVal){
            return image;
        }

        bfs2(pixel_row, pixel_column, new_color, image, pointVal);
        return image;
    }

    private static void bfs2(Integer pixel_row, Integer pixel_column, Integer new_color, ArrayList<ArrayList<Integer>> image, int pointVal) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        image.get(pixel_row).set(pixel_column, new_color);

        queue.add(new int[]{pixel_row, pixel_column});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] direction : directions) {
                int nr = direction[0] + curr[0];
                int nc = direction[1] + curr[1];

                if (nr >= 0 && nr < image.size() && nc >= 0 && nc < image.get(nr).size() && image.get(nr).get(nc) == pointVal) {
                    image.get(nr).set(nc, new_color);
                    queue.add(new int[]{nr, nc});
                }
            }
        }
    }


    public  static void main(String[] args){
        FloodFillMatrix f = new FloodFillMatrix();
        int[][] image = {{1,1,0},{0,1,0},{0,0,1}};
      /*  int[][] res = f.floodFill(image, 1,1,0);
        for(int[] i: res){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        ArrayList<ArrayList<Integer>> imageList = new ArrayList<>();

        imageList.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
        imageList.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        imageList.add(new ArrayList<>(Arrays.asList(1, 1, 0)));
        //imageList.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        for(ArrayList<Integer> i: imageList){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        FloodFillMatrix.flood_fill2(1,1,2, imageList);
        for(ArrayList<Integer> i: imageList){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}