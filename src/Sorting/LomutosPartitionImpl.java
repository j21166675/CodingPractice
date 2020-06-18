package Sorting;

public class LomutosPartitionImpl {

    private int[] partition(int[] arr) {
      int pivot = arr[arr.length-1];
      int j = -1;
      int i=0;
      for(i=0;i<=arr.length-2;i++){
          if(pivot >= arr[i]){
              j++;
              if(i!=j){
                  int temp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = temp;
              }
          }
      }
      arr[i] = arr[j+1];
      arr[j+1] = pivot;
      return arr;
    }

    public static void main(String a[]) throws Exception {
        LomutosPartitionImpl obj = new LomutosPartitionImpl();
        for (int i : obj.partition(new int[]{1,11, 3, 10, 2, 2})) {
            System.out.println(i);
        }
    }
}
