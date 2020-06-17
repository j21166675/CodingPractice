package Sorting;

public class LomutosPartitionImpl {

    private int[] partition(int[] arr) {
        int pivot = arr[arr.length-1];
        int smaller = -1;
        int i=1;
        for( i=1;i<=arr.length-1;i++){
            while(smaller <= 0 && arr[i] < pivot){
                smaller++;
                if(i != smaller){
                    int temp = arr[i];
                    arr[i] = arr[smaller];
                    arr[smaller] = temp;
                }
            }
        }
        arr[i-1] = arr[smaller+1] ;
        arr[smaller+1] = pivot;
        return arr;
    }

    public static void main(String a[]) throws Exception {
        LomutosPartitionImpl obj = new LomutosPartitionImpl();
        for (int i : obj.partition(new int[]{11, 3, 10, 2, 8})) {
            System.out.println(i);
        }
    }
}
