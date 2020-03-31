import java.util.Arrays;

/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
With no extra space
  */
public class ProductOfAllElementExceptCurrent {

    private int[] retProd(int[] arr){
        int prodAll = 1;
        for(int i:arr){
            prodAll *= i;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = prodAll / arr[i];
        }
        return arr;
    }

    public static void main(String a[]){
        ProductOfAllElementExceptCurrent obj = new ProductOfAllElementExceptCurrent();
        int[] arr = obj.retProd(new int[]{2,4,2,1});
        System.out.println(arr);
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
