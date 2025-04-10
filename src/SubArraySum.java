import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        for(int num:nums){
            sum += num;
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        return count;
    }

    public static void main(String[] args){
        SubArraySum solution = new SubArraySum();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        //System.out.println("Number of subarrays with sum " + k1 + ": " + solution.subarraySum(nums1, k1));

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Number of subarrays with sum " + k2 + ": " + solution.subarraySum(nums2, k2));

    }
}
