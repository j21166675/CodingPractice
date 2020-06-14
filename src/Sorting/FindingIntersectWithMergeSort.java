package Sorting;
/*
 * Its already a sorted array so we are using merge sort's merging part and
 * the complexity is O(m+n) since we are traversing both the arrays
 */
import java.util.HashSet;

public class FindingIntersectWithMergeSort {
    private HashSet<Integer> retIntersect(int[] arr1, int[] arr2){
        int i=0;
        int j=0;
        HashSet<Integer> set = new HashSet<Integer>();
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]==arr2[j]){
                set.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        return set;
    }

    public static void main(String a[]){
       FindingIntersectWithMergeSort obj = new FindingIntersectWithMergeSort();
       for(int i:obj.retIntersect(new int[]{2,3,4,4}, new int[]{2,4,6,7,8})){
           System.out.println(i);
       }
    }
}
