

public class MergeSortedArrayWithoutExtraSpace {

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


    private int[] mergeArr(int[] arr1, int[] arr2)throws Exception {
        if(arr1.length <=0 || arr2.length <=0) throw new Exception(" Invalid Array ");

      int i=0;
      int j=0;
      int k= arr1.length-1;
      while (i < arr1.length && j < arr2.length){
          if(arr1[i] == arr2[j]){
              arr1[arr1.length] = arr1[i+1];
              arr1[k--] = arr2[j];
              i++;
              j++;
          }
          else if(arr1[i] < arr2[j]){
              arr1[k--] = arr2[j];
              j++;
              i++;
          }
          else{
              arr1[k--] = arr1[i];
              arr1[i] = arr2[j];
              j++;
          }
      }
        return arr1;
    }
    private int[] quicksort(int[] arr, int low, int high){
        int pivot = arr[arr.length-1];
        if(low<high){
            int pi = partition( arr,  low, high);
            quicksort(arr, low,pi-1);
            quicksort(arr, pi+1, high);
        }
        return arr;
    }
    public static void main(String a[])throws Exception{
        MergeSortedArrayWithoutExtraSpace obj = new MergeSortedArrayWithoutExtraSpace();
        for(int i:obj.quicksort(obj.mergeArr(new int[]{1,2,3,0,0,0}, new int[]{2,5,1}),0, 5)){
            System.out.println(i);
        }
    }
}
