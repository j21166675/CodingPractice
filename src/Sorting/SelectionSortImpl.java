package Sorting;
/*
 * This is just a practice implemantation of selection sort this is not the algorithm to be selected for the arr which has large set of numbers since
 * the Time complexity is O(n^2) and the Cost of swapping does involved. We avoid using temp variable for swapping.
 */
public class SelectionSortImpl{
    private int[] getSorted(int[] arr)throws Exception{
        if(arr.length ==0) throw new Exception(" Not a valid array to sort ");
        int min = arr[0];
        for(int i=0; i< arr.length -1;i++){
            for(int j=i+1; j<arr.length;j++) {
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] * arr[j] ;
                    arr[j] = arr[i] / arr[j] ;
                    arr[i] = arr[i] / arr[j] ;
                }
            }
        }
        return arr;
    }

    public static void main(String a[]) throws Exception {
        SelectionSortImpl obj = new SelectionSortImpl();
        for(int i:obj.getSorted(new int[]{5,3,6,82,3,9,10,4,3,8,9})){
            System.out.println(i);
        }
    }
}
