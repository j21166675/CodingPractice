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

    public int[] productExceptSelfWithoutDiv(int[] nums) {
            int curr = 1;
            int[] res = new int[nums.length];
            Arrays.fill(res, 1);
            for( int i = 0; i < nums.length; i++){
                res[i] *= curr;
                curr *= nums[i];
            }
            curr = 1;
            for(int i=nums.length-1;i>=0;i--){
                res[i] *= curr;
                curr *= nums[i];
            }
            for(int i:res){
                System.out.print(i + " ");
            }
            return res;
        }


    public static void main(String a[]){
        ProductOfAllElementExceptCurrent obj = new ProductOfAllElementExceptCurrent();
        int[] arr = obj.productExceptSelfWithoutDiv(new int[]{1,2,3,4});
        System.out.println(arr);
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
