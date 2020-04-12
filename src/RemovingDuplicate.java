public class RemovingDuplicate {

    public static void main(String[] a) {
        RemovingDuplicate obj = new RemovingDuplicate();
       obj.removeDuplicatesWithOutExtraSpace(new int[]{1, 1, 2,4,5,6,7,7,7,7,7,7,7,8,9,9,9},true);
    }

    public int[] removeDuplicatesWithExtraSpace(int[] nums) {
        int sum = 1;
        int firstNum = nums[0];
        int[] finalArr = new int[nums.length];
        finalArr[0] = firstNum;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != firstNum) {
                firstNum = nums[i];
                finalArr[sum] = nums[i];
                sum++;

            }
        }
        for (int a : finalArr
        ) {
            if (a != 0) {
                System.out.println(a);
            }
        }
        return finalArr;

    }


    private void removeDuplicatesWithOutExtraSpace(int[] nums,Boolean flag){
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        for(int i=0;i<=j;i++){
            System.out.println(nums[i]);
        }
    }
}

