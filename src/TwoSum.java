import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] a) {
        TwoSum obj = new TwoSum();
        for (int i : obj.twoSum(new int[]{2, 7, 11, 15, 5, 4}, 13)) {
            System.out.println(i);
        }

    }

    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int expnum = target - nums[i];
            System.out.println("ExpNum : " + expnum);
            if (map.containsKey(expnum) && map.get(expnum) != i) {
                return new int[]{expnum, nums[i]};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}