package Sorting;

public class InsertionSortImpl {
    private int[] insertionSort(int[] arr)throws Exception{
        if(arr.length<=0) throw new Exception("Invalid array");

        for(int i=1;i<arr.length;i++){
        int j =i-1;
        int temp = arr[i];
        while(j>=0 && temp < arr[j]){
            arr[j+1] = arr[j];
             j--;
        }
            arr[j+1] = temp;
        }
        return arr;
    }
    public static void main(String a[])throws Exception{
        InsertionSortImpl obj = new InsertionSortImpl();
        for(int i:obj.insertionSort(new int[]{4,6,3,2,6,9})){
            System.out.println( i );
        }
    }

}
