package DPImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ClimbingStairs {
      public int climbStairs(int n) {
          if (n <= 1) {
              return 1;
          }
          if (n == 2) {
              return 2;
          }

          int[] table = new int[3];
          table[0] = 1;
          table[1] = 2;

          for (int i = 3; i <= n; i++) {
              table[2] = table[0] + table[1];
              table[0] = table[1];
              table[1] = table[2];
          }
          return table[2];
      }
    public static void main(String[] args){
        ClimbingStairs obj = new ClimbingStairs();
       System.out.println( obj.climbStairs(45 ));
    }
}
