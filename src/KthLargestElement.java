import java.util.concurrent.ExecutionException;

/*
 Finding Kth larges element with out sorting the array neither extra space.
*/

public class KthLargestElement {
    private int partition(int[] arr, int low, int high, int k){
        int pivot = arr[high];
        int j=low-1;
        int i;
        for(i=low;i<high;i++){
            if(arr[i]<=pivot){
                j++;
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arr[high] = arr[j+1];
        arr[j+1] = pivot;
        return j+1;
    }
    private int getKthLargest(int[] arr, int low, int high, int k)throws Exception{
        if(arr.length <=0)throw new Exception(" Invalid array ");
        int pos = partition(arr, low, high, k);
        int kth = 0;
        if(pos == (arr.length-k)){
             return arr[pos];
        }
        else if(pos < (arr.length-k)){
            return getKthLargest(arr, pos+1, high, k);
        }
        else if(pos > (arr.length-k)){
            return getKthLargest(arr, 0, pos-1, k );
        }
        return 0;
    }

    public static void main(String a[])throws Exception{
        KthLargestElement obj = new KthLargestElement();
        int[] arr= new int[]{2,3,6,5,8,7,4};
        System.out.println(obj.getKthLargest(arr, 0, arr.length-1,5));
    }

}
