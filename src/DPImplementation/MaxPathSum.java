package DPImplementation;

import java.util.ArrayList;

public class MaxPathSum {
    ArrayList<Integer> list;
    private int pathSum(int[][] grid) {
        return helper(grid);
    }

    private int helper(int[][] grid) {
        list = new ArrayList<>();
        int sum = 0;
        int[][] table = new int[grid.length][grid[0].length];

        table[0][0] = grid[0][0];
        list.add(grid[0][0]);

        for (int col = 1; col < grid[0].length; col++) {
            table[0][col] = grid[0][col] + table[0][col - 1];
        }

        for (int row = 1; row < grid.length; row++) {
            table[row][0] = grid[row][0] + table[row - 1][0];
        }

        for (int row = 1; row < grid.length; row++) {
            for (int col = 1; col < grid[row].length; col++) {
                int maxVal = Math.max(table[row][col - 1], table[row - 1][col]);

                if(maxVal == table[row][col-1]){
                    list.add(grid[row][col-1]);
                   // System.out.println("maxVal"  + maxVal);
                }
                else{
                    list.add(grid[row-1][col]);

                    System.out.println("grid[row-1][col]"  + grid[row-1][col]);
                    System.out.println("grid[row-1][col]"  + grid[row][col]);
                    System.out.println("row "  + row + " col " + col);
                }
                table[row][col] = grid[row][col] + maxVal;
            }
        }
        return table[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args){
        MaxPathSum maxPathSum = new MaxPathSum();
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        int[][] grid1 = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println( " ans : "+maxPathSum.pathSum(grid));

        for(int i: maxPathSum.list){
            System.out.println(i + " ,");
        }

    }
}
