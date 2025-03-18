package Sorting;

public class kthLargestPrat {

    public int partition(int[] arr, int low, int high){
        int pos = low;
        int pivot = arr[high];
        for(int i=low;i<high;i++){
            if(arr[i] < pivot){
                pos++;
            }
        }
        arr[high] = arr[pos];
        arr[pos] = pivot;
        return pos;
    }

    public int kthLargesdtEle(int[] arr, int low, int high, int k){
        int pos = partition(arr, low, high);
        if(pos == arr.length - k) return arr[pos];
        else if(pos < arr.length - k) return kthLargesdtEle(arr, pos+1, high, k);
        else if(pos > arr.length - k) return kthLargesdtEle(arr, 0, pos-1, k);
        return 0;
    }
    public static void main(String a[]){
       kthLargestPrat obj = new kthLargestPrat();
       //int[] arr = new int[]{6,5,2,3,4,1};
      // System.out.println(obj.kthLargesdtEle(arr, 0, arr.length-1, 2));

        int[] arr= new int[]{2,3,6,5,8,7};
        System.out.println(obj.kthLargesdtEle(arr, 0, arr.length-1,2));
    }
}
