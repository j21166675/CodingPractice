package Sorting;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueTest {
    public void addElements(int[] arr){
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr){
            que.add(x);
        }
        while(!que.isEmpty()){
            System.out.println(que.poll());
        }
    }
    public static void main(String a[]){
        priorityQueueTest obj = new priorityQueueTest();
        obj.addElements(new int[]{5,8,7,6,2,4,1});
    }
}
