package Sorting;

public class QuickSortImpl {
    private int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int j=start-1;
        for(int i=start;i<=end-1;i++){
            if(arr[i] < pivot){
                j++;
                if(i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arr[end] = arr[j+1];
        arr[j+1] = pivot;
        return 0;
    }

    private int[] quicksort(int[] arr)throws Exception{
        if(arr.length<=0) throw new Exception(" inGFvalid array ");
        int low =0;
        int high =arr.length-1;
        int pi = partition(arr, low, high );

        return null;
    }
    public static void main(String a[])throws Exception{
        QuickSortImpl obj = new QuickSortImpl();
        for(int i:obj.quicksort(new int[]{11,3,10,2,8}));
    }
}
