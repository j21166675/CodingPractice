/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.

        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        The order of elements can be changed. It doesn't matter what you leave beyond the new length.

        Example 1:

        Given nums = [3,2,2,3], val = 3,

        Your function should return length = 2, with the first two elements of nums being 2.

        It doesn't matter what you leave beyond the returned length.*/

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int j= 0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }

        }
        return j;
    }

    public static void main(String a[]){
        RemoveElement obj = new RemoveElement();
        obj.removeElement(new int[]{1,2,3,4,5,6}, 2);
        obj.removeElement(new int[]{1,2,2,2,4,2,6}, 2);
    }

}
