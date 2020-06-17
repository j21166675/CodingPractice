package Sorting;

public class QuickSortImpl {
    private int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int j=start-1;
        for(int i=start;i<end;i++){
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
        return j+1;
    }

    private int[] quicksort(int[] arr, int low, int high)throws Exception{
        if(arr.length<=0) throw new Exception(" Invalid array ");
        if(low<high){
            int pi = partition(arr, low, high );
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1, high);
        }

        return arr;
    }
    public static void main(String a[])throws Exception{
        QuickSortImpl obj = new QuickSortImpl();
        for(int i:obj.quicksort(new int[]{11,3,10,2,8},0,4)){
            System.out.println(i);
        }
    }
}
