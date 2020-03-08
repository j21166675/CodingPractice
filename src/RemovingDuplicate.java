public class RemovingDuplicate {

    public static void main(String[] a) {
        RemovingDuplicate obj = new RemovingDuplicate();
        System.out.println(obj.removeDuplicates(new int[]{1, 1, 2}));
    }

    public int[] removeDuplicates(int[] nums) {
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
}

